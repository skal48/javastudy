package ex01_mkdirs;

import java.io.File;
import java.time.LocalDateTime;




public class MainWrapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 현재 날짜와 시간을 이용하여 디렉터리를 만드시오 
    // C:/2023/08/03/14
    
    LocalDateTime date = LocalDateTime.now();
    
    File dir = new File("C:" + date.getYear() +File.separator+ date.getMonthValue() +File.separator+ date.getDayOfMonth() +File.separator+ date.getHour());
    
    if(!dir.exists()) {
      dir.mkdirs();
      System.out.println("만들었어");
    }
    //----------------------------------------------------------------------------------------------
    LocalDateTime localDateTime = LocalDateTime.now();
    int year = localDateTime.getYear();
    int month = localDateTime.getMonthValue();
    int day = localDateTime.getDayOfMonth();
    int hour = localDateTime.getHour();
    
    StringBuilder sb = new StringBuilder();
    sb.append("C:");
    sb.append("/");
    sb.append(year);
    sb.append("/");
    sb.append(String.format("%02d", month));
    sb.append("/");
    sb.append(String.format("%02d", day));
    sb.append("/");
    sb.append(String.format("%02d", hour));
    
    File dir1 = new File(sb.toString());
    if(!dir1.exists()) {
      dir1.mkdirs();
    }
    
    System.out.println(dir1.getPath() + " 디렉터리 생성 완료");
    
    
    
  }

}
