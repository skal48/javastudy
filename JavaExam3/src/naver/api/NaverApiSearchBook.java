package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {
 
  private void generateImage(String spec) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      bin = new BufferedInputStream(con.getInputStream());
      
      File dir = new File("C:/download");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      String fileName = spec.substring(spec.indexOf("_") + 8);
      
      File file = new File(dir, fileName) ;
      
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[1024];
      
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      
      System.out.println("이미지 다운로드 완료");
      // 파라미터 String spec에는 다운로드 받을 이미지 파일의 URL이 전달된다.
      // 해당 URL의 이미지 파일을 다운로드 받는다.
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

  public void getSearchList() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("책 관련 검색어를 입력하세요 >>> ");
      String bookQuery = sc.nextLine(); 
      sc.close();
      
      String spec = "https://openapi.naver.com/v1/search/book.json";
      String query = bookQuery;
      String display = "10";
      String start = "1";
      String sort = "sim";
      String clientId = "emwjRM02_8WIWde35QI4";
      String clientSecret = "2Zd240M_xE";
      
      
      StringBuilder sbUrl = new StringBuilder();
      sbUrl.append(spec);
      sbUrl.append("?query=").append(URLEncoder.encode(query, "UTF-8"));
      sbUrl.append("&display=").append(display);
      sbUrl.append("&start=").append(start);
      sbUrl.append("&sort=").append(sort);
            
      url = new URL(sbUrl.toString());
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");      
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + "발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
     
      JSONArray items = obj.getJSONArray("items");
      //List<String> list = new ArrayList<String>();
      for(int i = 0,lenght = items.length(); i < lenght; i++) {
        JSONObject item = items.getJSONObject(i);      
        //list.add(item.getString("image"));
        generateImage(item.getString("image"));
      }
      
      
      //for(int i = 0,lenght = list.size(); i < lenght; i++) {        
       // generateImage(list.get(i));
       //}
      // 책 검색 OpenAPI를 사용해서 응답 결과 중 이미지(image) 결과만 추출하여
      // generateImage 메소드에 전달한다.
      // 10번의 generateImage 메소드 호출이 필요하다.

      
    } catch (Exception e) {
      
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a h:mm:ss");
      String time = dtf.format(now);
      
      
      String message = e.getMessage();
            
      File dir = new File("C:/download/log");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      
      File file = new File(dir, "log.txt");
      
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
        
        
        bw.write(time + ",  " + message );
        bw.newLine();
        
        
        System.out.println(file.getPath() + " 파일에 로그가 작성되었습니다");
      } catch (IOException e2) {
        e2.printStackTrace();
      
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }
    }
  }
    
  
  
}