package ex04_text_copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainWrapper {
 public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
   File dir = new File("C:/storage");
   File file = new File(dir, "alphabet.txt");
   if(dir.exists() == false) {
     dir.mkdirs();
   }
   
   DataOutputStream dout = null;
   
   try { 
     dout = new DataOutputStream(new FileOutputStream(file));
     
     char a = 65;
     for(int i = 0; i < 26; i++) {
       dout.writeChar(a + i); 
     }
     
     System.out.println("만듦");
   } catch(IOException e) {
     e.printStackTrace();
   } finally {
     try {
       if(dout != null) {dout.close();}      
     } catch(IOException e) {
       e.printStackTrace();
     }
   }
   
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
    File dir1 = new File("C:/storage");
    File file1 = new File(dir1, "alphabet.txt");
    
    DataInputStream din = null;
    
    File dir2 = new File("C:/storage");
    File file2 = new File(dir2, "alphabet2.txt");
    
    DataOutputStream dout = null;
    
    try {
      din = new DataInputStream(new FileInputStream(file1));
      dout = new DataOutputStream(new FileOutputStream(file2));   
      byte[] bin = new byte[1024];
      
      int readByte = 0;
      StringBuilder sb = new StringBuilder();
      
      while((readByte = din.read()) != -1) {
        sb.append(new String(bin, 0, readByte));
      }
      dout.writeChars(sb.toString());
      
      System.out.println("복사함");
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(dout != null){ dout.close();}
        if(din != null ){ din.close();}
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
    
    
    
    
    
    
    
    
    
    
    
  
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }
}
