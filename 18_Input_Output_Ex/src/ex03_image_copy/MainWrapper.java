package ex03_image_copy;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {

  
 public static void main(String[] args) {
    
    // 문제. %ORA_HOME%/oui/instImages/bg.jpg 이미지 파일을 C:/storage/bg.jpg 이미지로 복사하시오.
    // %ORA_HOME%은 C:/app/사용자/product/18.0.0/dbhomeXE 디렉터리를 의미한다.
   File open = new File("C:/app/GDJ/product/18.0.0/dbhomeXE/oui/instImages/");
   File image = new File(open, "bg.jpg");
   
   
      
   File down = new File("C:/storage");
   if(down.exists() == false) {
     down.mkdirs();
   }
  
   File copy = new File(down, "bg.jpg");
   
   
   
   BufferedInputStream bin = null;
   
   BufferedOutputStream bout = null;
   
   
   try {
     
     
     byte[] paste = new byte[1024];
     
     
     bin = new BufferedInputStream(new FileInputStream(image));
     
     bout = new BufferedOutputStream(new FileOutputStream(copy));
     int readByte = 0;
     
     while((readByte = bin.read(paste)) != -1) {
       bout.write(paste, 0, readByte );
     }
     
     System.out.println("복사함");
     
     
   }catch( IOException e) {
     e.printStackTrace();
   }finally {
     try {
     if(bout != null) { bout.close();}
     if(bin != null) { bin.close();}
 
   }catch(IOException e)
     {
     e.printStackTrace();
     }
   }
  }
}
