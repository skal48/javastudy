package ex02_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Temp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String query = null;
    System.out.println("검색어 입력해주세요 >>> ");
    query = sc.nextLine();
    try {
      query = URLEncoder.encode(query, "UTF8");      
    } catch(UnsupportedEncodingException e) {
      System.out.println("검색어 인코딩 실패");
    }
    
    String spec = "https://openapi.naver.com/v1/search/blog.json?query=" + query;
    String clientId = "emwjRM02_8WIWde35QI4";
    String clientSecret = "2Zd240M_xE";
    Map<String, String> requestHeaders = new HashMap<String, String>();
    requestHeaders.put("X-Naver-Client-Id", clientId);    
    requestHeaders.put("X-Naver-Client-Secret", clientSecret);
    
    String result = get(spec, requestHeaders);
    System.out.println(result);
  }
  
  private static String get(String spec, Map<String, String> requestHeaders) {
    HttpURLConnection con = connect(spec);
    try {
      con.setRequestMethod("GET");
      
      for(Map.Entry<String, String> entry : requestHeaders.entrySet()) {
        con.setRequestProperty(entry.getKey(), entry.getValue());
      }
    
      int responseCode = con.getResponseCode();
      if(responseCode == HttpURLConnection.HTTP_OK){
        return readBody(con.getInputStream());
      }else {
       return readBody(con.getErrorStream());
      }
    
   } catch(IOException e) {
     System.out.println("요청 또는 응답 실패");
   }finally {
     con.disconnect();
   }
    return spec;
    
  }
  
  private static HttpURLConnection connect(String spec) {
    URL url = null;
    HttpURLConnection con =null;
    try{
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      return (HttpURLConnection) url.openConnection();
      
    }catch(MalformedURLException e) {
      System.err.println("주소가 잘못되었다.");
    }catch(IOException e) {
      System.out.println("접속이 안된다.");
    }
    return con;
    }
  
  private static String readBody(InputStream in) {
    
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null){
        sb.append(line + "\n");
      }
      
      return sb.toString();
      
    }catch(IOException e) {
      throw new RuntimeException("API 응답을 읽는 데 실패했습니다.");
    }
  }
  
 
}
