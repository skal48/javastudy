package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.management.RuntimeErrorException;

public class MainWrapper {

  public static void main(String[] args) {
    
    //문제. data.go.kr 에서 "한국 전력공사_전기차 충전소 운영정보" API를 신청하고 
    // 결과를 "C:/storage/한국전력공사_전기차_충전소_운영정보.xml"로 저장하시오 
    
    URL url =null;
    HttpURLConnection con = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try {
      String spec = "http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList";
      String serviceKey = "l/szQJhwAqMLU77JxVJ8ku0IPWcEfdXzbRblOGP8EuLS06kpdD6c/Urad2t0SB4RVSZui/Ron5inWrLiTmuDcg==";
      String pageNo = "1";
      String numOfRows = "10";
      String addr = "전라남도 나주시 빛가람동 120";
      
      StringBuilder sb = new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey,"UTF-8"));
      sb.append("&pageNo=").append(pageNo);
      sb.append("&numOfRows=").append(numOfRows);
      sb.append("&addr=").append(URLEncoder.encode(addr,"UTF-8"));
      
      url = new URL(sb.toString());
      con = (HttpURLConnection) url.openConnection();
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + "발생하였습니다.");
      }
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sbuf = new StringBuilder();
      String line = null;
      if((line = br.readLine()) != null) {
        sbuf.append(line + "\n");
      }
     
      File dir = new File("C:/storage");
      File file = new File(dir, "한국전력공사_전기차_충전소_운영정보.xml");
      
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      bw = new BufferedWriter(new FileWriter(file));
      bw.write(sbuf.toString());
      
      System.out.println(file.getPath() + "파일 생성 완료");
                  
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(bw != null) {bw.close();}
        if(br != null) {br.close();}
        if(con != null) {con.disconnect();}
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }

}
