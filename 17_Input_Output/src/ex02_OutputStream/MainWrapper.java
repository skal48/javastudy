package ex02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class MainWrapper {

  /*
   * java.io.OutputStream 클래스
   * 1. 바이트 기반의 출력 스트림이다.
   * 2. 출력단위
   *    1) int
   *    2) byte[]
   * FileOutputStream : byte 단위로 파일을 기록하는 클래스
   * 끝나고 반드시 close()해주어야한다. 
   */
  
  public static void ex01() {
    
    //디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기 
    File file = new File(dir, "ex01.dat");
    
    // 파일 출력스트림 선언
    FileOutputStream fout = null;   //선언만
    try {
      
      // 파일 출력스트림 생성(반드시 예외 처리가 필요한 코드 )
      // 1.생성모드 : 언제나 새로 만든다.(덮어쓰기)               new FileOutPutstream(file)
      // 2.추가모드 : 새로 만들거나 기존 파일에 추가한다.         new FileOutPutstream(file, true)      
      fout = new FileOutputStream(file); // 생성
      
      // 출력할 데이터(파일로 보낼 데이터)
      int c = 'A';    // int
      String s = "pple";
      byte[] b = s.getBytes(); // byte[] : String을 byte[]로 변환
      
      // 출력(파일로 데이터 보내기)
      fout.write(c);
      fout.write(b);
      System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");
      
    }catch(IOException e ) {
      e.printStackTrace();
    } finally {//항상 마지막에 수행되는 곳
      try{
        if(fout != null) {   
          fout.close();  //exception을 요구하기에(예외처리가 필요하기 떄문에) 트라이  다시 써줌 
        }                //출력 스트림은 반드시 닫아줘야함  안하면 파일이 안만들어진다.        
      }catch (IOException e) {
        e.printStackTrace();        
      }
    }
    
    //file.getparant 폴더 주소 가져오기 
    //file.getPath() 파일 폴더 주소 다 가져오기
    //file.name() 파일 이름가져오기 
    
    
  }
  
  public static void ex02() {
    
    // C:\storage\ex02.dat 파일로 "안녕하세요" 보내기, 파일크기 확인
    
    File dir = new File("C:/Storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "ex02.dat");
    
    FileOutputStream fout = null; 
    try {
      fout = new FileOutputStream(file);
      String kor = "안녕하세요";
      byte[] bkor = kor.getBytes("UTF-8");
      
      fout.write(bkor);      
      System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");    
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(fout != null) {
          fout.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
      
    }
  }
  
  
  /*
   * bufferedOutputStream 클래스 
   * 1. 내부 버퍼를 가지고 있는 출력스트임이다. 
   * 2. 많은 데이터를 한 번에 출력하기 때문에 속도 향상을 위해서 사용한다.
   * 3. 보조스트림이므로 메인스트림과 함께 사용한다. 
   *  자바는 이미 파일이 있으면 덮어 쓰기를 한다.
   */
  public static void ex03() {
    
    //두줄로 안녕하세요.
    //         \n
    //        반갑습니다. 
    
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "ex03.dat");
    
    //버퍼출력스트림 선언 출력속도가 빠름
    BufferedOutputStream bout =null; 
    
    try {
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      String one = "안녕하세요";
      int two = '\n';
      String three = "반갑습니다.";
   
      
      bout.write(one.getBytes("UTF-8"));
      bout.write(two);
      bout.write(three.getBytes(StandardCharsets.UTF_8)); //getBytes("UTF-8")과 동일하다. 
    
      System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");    
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(bout != null) {
          bout.close();
        }
      }catch (IOException e) {
          e.printStackTrace();
        }
      }

    }
    
  public static void ex04() {
    
    /*
     * java.io.DataoutputStream 클래스
     * 1. int. double. String 등의 변수를 그대로 출력하는 출력스트림이다. 
     * 2. 보조스트림이므로 메인스트림과 함께 사용한다. 
     * 3.
     */
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "ex04.dat");
 // 데이터출력스트림 선언
    DataOutputStream dout =null; 
    
    
    try {
      //데이터출력스트림 생성(반드시 예외 처리가 필요한 코드 )
      dout = new DataOutputStream(new FileOutputStream(file));
      
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산대학교";
      
      //출력(파일로 내보내기)
      dout.writeChars(name);
      dout.writeInt(age);
      dout.writeDouble(height);
      dout.writeUTF(school);
      
      System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");    
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(dout != null) {
          dout.close();
        }
      }catch (IOException e) {
          e.printStackTrace();
        }
      }

    }
    
    public static void ex05() {
      
      /*
       * java.io.ObjectOutputStream 클래스
       * 1. 객체를 그대로 출력하는 출력 스트림이다. 
       * 2. 직렬화(Serializable)된 객체를 보낼 수 있다.김밥을 잘라서 하나씩 보내는 것
       * 3. 보조스트림이므로 메인스트림과 함께 사용한다. 
       */
      File dir = new File("C:/storage");
      if(!dir.exists()) {
        dir.mkdir();
      }
      
      File file = new File(dir, "ex05.dat");
      
      //객체출력스트림 선언 출력속도가 빠름
      ObjectOutputStream oout =null; 
      
      
      try {
        //객체출력스트림 생성(반드시 예외 처리가 필요한 코드 )
        oout = new ObjectOutputStream(new FileOutputStream(file));
        
        String name = "tom";
        int age = 50;
        double height = 180.5;
        String school = "가산대학교";
        Student student =new Student(name, age, height, school);
        
        //출력(파일로 내보내기)
       oout.writeObject(student);
       
       System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");    
        
      }catch(IOException e) {
        e.printStackTrace();
      }finally {
        try {
          if(oout != null) {
            oout.close();
          }
        }catch (IOException e) {
            e.printStackTrace();
          }
        }

    }
    
  
   
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub

   // ex01();
    //ex02();
    //ex03();
    //ex04();
    ex05();
  }

}
