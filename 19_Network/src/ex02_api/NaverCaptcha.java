package ex02_api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class NaverCaptcha {

  private static final String CLIENT_ID = "emwjRM02_8WIWde35QI4";
  private static final String CLIENT_SECRET = "2Zd240M_xE";
  
  private static String getKey() { //static -> 메인에서 부를려고 있는거임 나중에 웹에서 쓰려면 없애야 한다. 
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    String result = null;
    
    try {
    String spec = "https://openapi.naver.com/v1/captcha/nkey"; //?code=0
    
    url = new URL(spec);
    con =(HttpURLConnection) url.openConnection();
    
    con.setRequestMethod("GET");
    
    con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
    con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);
    
    int responseCode = con.getResponseCode();
    if(responseCode != HttpURLConnection.HTTP_OK) {
      throw new RuntimeException(responseCode + "발생");      
    }
    
    reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
    
    StringBuilder sb = new StringBuilder();
    String line =null;
    while((line = reader.readLine()) != null) {
      sb.append(line);
      
    }
    System.out.println(sb.toString());
    
    JSONObject obj = new JSONObject(sb.toString());
    return obj .getString("key");
    
    
    }catch(Exception e) {
      System.out.println(e.getMessage());
    }finally{
      try {
        if(reader != null)reader.close();
        if(con != null)con.disconnect();
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
    return result;
  }
  
  private static String getImage() {
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    String key = null;
    
    try {
      key = getKey();      
      String spec = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);   
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) { //HttpURLConnection.HTTP_OK = 200  200이면 성공코드이다. 
        throw new RuntimeException(responseCode + "발생");
      }
      
      bin = new BufferedInputStream(con.getInputStream());
      
      File dir = new File("C:/storage"); 
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file =new File(dir, System.currentTimeMillis() + ".jpg");
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[1024];
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      
      System.out.println(file.getPath() + "파일 생성 완료");
           
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
        if(con != null) con.disconnect();
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
     return key;
  }

  private static void validInput() {
    
    URL url = null;
    HttpURLConnection con =null;
    BufferedReader reader = null;
    
    try {
       
      String key = getImage();
      
      Scanner sc = new Scanner(System.in);
      System.out.println("입력 >> ");
      String value = sc.next();
      
      String spec = "https://openapi.naver.com/v1/captcha/nkey?code=1&key=" + key + "&value=" + value;
      
      url =new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);   
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode +"발생");
      }
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));  
        
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      JSONObject obj = new JSONObject(sb.toString());
      System.out.println("응답시간: " + obj.getDouble("responseTime"));
      if(obj.getBoolean("result")) {
        System.out.println("맞습니다.");
      }else {
        System.out.println("틀립니다.");
      }
        
    }catch(Exception e) {
      System.out.println(e.getMessage());
    }finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
  }
  
  
  
  
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //getImage();
    validInput();
  }

}
