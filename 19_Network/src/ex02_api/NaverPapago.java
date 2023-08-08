package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class NaverPapago {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedOutputStream bout = null; //서버로 포스트 데이터 보내는 용도 
    BufferedReader reader = null; //번역결과를 받아오는데 텍스트이다. 
    
    
    try {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("번역할 한국어 입력 >>>");
      String text = sc.nextLine();
      
      String spec = "https://openapi.naver.com/v1/papago/n2mt";
      String clientId = "emwjRM02_8WIWde35QI4";
      String clientSecret = "2Zd240M_xE";
      
      String params ="source=ko&target=en&text=" + text;
      //보안이 필요하면 포스트 방식
      
      url = new URL(spec);
      con =(HttpURLConnection) url.openConnection();
      
      //요청에 메소드 POST(생략 불가)
      con.setRequestMethod("POST");
      
      //요청헤더(clientId, clientSecret)
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      //OutPutStream을 이용해서 post 데이터를 보낸다는 뜻으로
      con.setDoOutput(true); 
      
      // OutputStream을 이용해서 POST 데이터 보내기 
      bout = new BufferedOutputStream(con.getOutputStream());
      bout.write(params.getBytes());
      bout.flush();
      
      
      int responsecode = con.getResponseCode();
      if(responsecode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responsecode + "발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
      JSONObject message = obj.getJSONObject("message");
      JSONObject result = message.getJSONObject("result");
      String translatedText = result.getString("translatedText");
      
      System.out.println("번역결과");
      System.out.println("--------");
      System.out.println(translatedText);
      
    }catch(Exception e) {
      System.out.println(e.getMessage());  
    }finally {
      try {
        if(reader != null)reader.close();
        if(bout != null)bout.close();
        if(con != null)con.disconnect();
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
       
  }

}
