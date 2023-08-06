package ex04_text_copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {
 public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    File dir = new File("C:/storage");
    File file = new File(dir, "alphabet.txt");
    if(file.exists() == false) {
      file.mkdirs();
    }
  
    FileWriter fw = null;
    
    try {
      fw = new FileWriter(file);
      
      char[] alpha = new char[26];
      for(int i = 0; i < 26 ; i++) {
      alpha[i] = (char)(65 + i); 
      }
      
      fw.write(alpha);
      
      System.out.println("만들었음");
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fw != null) {fw.close();}        
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
   //왜  dataoutputstream 으로 하면 띄어쓰기 A B C 처럼 되고 
    //fileWriter 로 하면 띄어 쓰기 없는 거임?
    
      
      
    
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
   //파일 생성 
   File dir = new File("C:/storage");    
   File file = new File(dir, "alphabet2.txt");
   if(dir.exists() == false) {
     dir.mkdirs();
   }
   //파일 읽기
   File dir1 = new File("C:/storage");    
   File file1 = new File(dir, "alphabet.txt");
   
   FileReader fr = null;
   FileWriter fw = null;
   try { 
     fr = new FileReader(file1);
     
     int ch = 0;
     StringBuffer sb = new StringBuffer();
     
     while((ch = fr.read()) != -1) {
       sb.append((char)ch);       
     }
     
     fw = new FileWriter(file);
     fw.write(sb.toString());
    
     System.out.println("복사함");
   }catch(IOException e) {
     e.printStackTrace();
   }finally {
    try{
      if(fw != null) {fw.close();}
      if(fr != null) {fr.close();}
  } catch(IOException e) {
    e.printStackTrace(); 
    }
   }
    
   
  }
    
    
    
    
    
    
    
    
    
    
    
  
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }
}
