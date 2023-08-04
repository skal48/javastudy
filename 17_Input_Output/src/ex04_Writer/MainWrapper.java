package ex04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainWrapper {

  /*
   * java.io.Writer 클래스
   * 1. 문자 기반의 출력스트림이다.
   * 2. 출력단위 
   *    1) int
   *    2) char[]
   *    3) String
   */
  
  private static void ex01() {
    
    //디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdir();
    }
    
    //파일은 File 객체로 만들기
    File file = new File(dir, "ex01.txt");
    
    //파일출력스트림 선언
    FileWriter fw =null;
    
    try {
      //파일출력스트림 생성(반드시 예외 처리가 필요한 코드)
      // 1.생성모드 : 언제나 새로 만든다.(덮어쓰기)               new FileWriter(file)
      // 2.추가모드 : 새로 만들거나 기존 파일에 추가한다.         new FileWriter(file, true)   
      
      fw = new FileWriter(file);
      
      // 출력할 데이터(파일로 보낼 데이터)
      int c = 'H';
      char[] cbuf = {'e', 'l', 'l', 'o'};
      String str = "World";
      
      //출력 (파일로 데이터 보내기)
      fw.write(c);
      fw.write(cbuf);
      fw.write(str);
      
      //메세지
      System.out.println(file.getPath() + "파일 생성 완료");
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally{
      try {
        if(fw != null) {
          fw.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }

  }
  public static void ex02() {
    /*
     * java.io.BufferWiter 클래스
     * 1. 내부 버퍼를 가지고 있는 출력스트림이다. 
     * 2. 많은 데이터를 한 번에 출력하기 때문에 속도 향상을 위해서 사용한다. 
     * 3. 보조스트림이기 때문에 메인스트림과 같이 사용한다.
     */
    
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdir();
    }
    
    //파일은 File 객체로 만들기
    File file = new File(dir, "ex02.txt");
    
    //버퍼출력스트림 선언
    BufferedWriter bw = null;
    
    try {
      //버퍼출력스트림 생성(반드시 예외 처리가 필요한 코드)
      bw = new BufferedWriter(new FileWriter(file));
      
      // 출력할 데이터(파일로 보낼 데이터)
      String str1 = "Hello";
      String str2 = "World";
      
      //출력 (파일로 데이터 보내기)
     bw.write(str1, 0, 4); //문자열 str1의 인덱스 0부터 4글자만 출력
     bw.newLine(); // 줄바꿈 (bw.writer("\n")과 동일하다.  
     bw.write(str2); 
      
      //메세지
      System.out.println(file.getPath() + "파일 생성 완료");
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally{
      try {
        if(bw != null) {
          bw.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  private static void ex03() {
    /*
     * java.io.PrintWriter 클래스
     * 1. print() 메소드와 println() 메소드를 지원하는 출력스트림이다. 
     * 2. println() 메소드 를 사용하면 자동으로 줄 바꿈이 처리된다. 
     * 3. 서버가 클라이언트에게 테이터를 전송할때 사용하는 기본 writer이다.  
     */
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdir();
    }
    
    //파일은 File 객체로 만들기
    File file = new File(dir, "ex02.txt");
    
    //버퍼출력스트림 선언
    PrintWriter out = null;
    
    try {
      //버퍼출력스트림 생성(반드시 예외 처리가 필요한 코드)
      out = new PrintWriter(file);
      
      // 출력할 데이터(파일로 보낼 데이터)
      String str1 = "Hello";
      String str2 = "World";
      
      //출력 (파일로 데이터 보내기)
     out.println(str1); //문자열 str1의 인덱스 0부터 4글자만 출력
     out.println(str2); 
      
      //메세지
      System.out.println(file.getPath() + "파일 생성 완료");
      //out.close 여기에 적어도 실행에 문제는 없음 이론상만 문제가 있을뿐이다. 
    } catch(IOException e) {
      e.printStackTrace();
    } finally{      
        if(out != null) {
          out.close();  //try 체크를 하지 않는 close()메소드 
        }      
    }
    
    

  }
  public static void main(String[] args) {
    ex03();
    
  }
  
  
}
