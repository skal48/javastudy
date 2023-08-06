package ex03_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ex02_OutputStream.Student;

public class MainWrapper {

  /*
   * java.io.InputStream 클래스 
   * 1. 바이트 기반의 입력스트림이다. 
   * 2. 입력단위 1) int 2) byte[]
   */
  public static void ex01() {

    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");

    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");

    // 파일입력스트림 선언
    FileInputStream fin = null;

    try {

      // 파일입력스트림 생성(반드시 예외처리 필요, 파일이 없으면 예외 발생)
      fin = new FileInputStream(file);

      // 입력할 데이터 저장 변수
      int c = 0;

      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();

      // read() 메소드
      // 1. 1개 데이터를 읽어서 반환한다.
      // 2. 읽은 내용이 없으면 -1을 반환한다.

      // 반복문 : 읽은 내용이 -1 이 아니면 계속 읽는다.
      while ((c = fin.read()) != -1) {
        sb.append((char) c);
      }
      // 결과확인
      System.out.println(sb.toString());

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void ex02() {

    // 바이트 기반 스트림은 원래 한글 처리가 안된다.

    File dir = new File("C:/storage");

    File file = new File(dir, "ex02.dat");

    FileInputStream fin = null;

    try {

      // 파일입력스트림 생성(반드시 예외처리 필요, 파일이 없으면 예외 발생)
      fin = new FileInputStream(file);

      // 입력할 데이터 저장 변수
      byte[] b = new byte[4]; // 임의로 크기 설정(최대 4바이트 입력 가능(컴퓨터 성능이 안좋을때) 컴퓨터 성능이 좋다면 더 큰수도 가능

      // 실제로 읽은 바이트 수 저장 변수
      int readByte = 0;

      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();

      // read(byte[] b) 메소드
      // 1. 파라미터로 전달된 byte[] b 에 읽은 내용을 저장한다.
      // 2. 실제로 읽은 바이트 수를 반환한다.
      // 3. 읽은 내용이 없으면 -1을 반환한다.

      // 반복문 : read()의 반환값이 -1 이 아니면 계속 읽는다.
      while ((readByte = fin.read(b)) != -1) {
        sb.append(new String(b, 0, readByte)); // 배열 b의 인덱스 0부터 readByte 개 데이터를 String으로 변환한다.
      }
      // 결과확인
      System.out.println(sb.toString());

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  public static void ex03() {
    /*
     * java.io.BufferedInputStream 클래스 
     * 1. 내부 버퍼를 가지고 있는 입력스트림이다. 
     * 2. 많은 데이터를 한번에 입력받기 때문에 속도 향상을 위해서 사용한다. 
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     * 
     */

    File dir = new File("C:/storage");

    File file = new File(dir, "ex03.dat");
    // 버퍼입력스트림 선언
    BufferedInputStream bin = null;

    try {

      // 버퍼입력스트림 생성(반드시 예외처리 필요, 파일이 없으면 예외 발생)
      bin = new BufferedInputStream(new FileInputStream(file));

      // 입력할 데이터 저장 변수
      byte[] b = new byte[4]; // 임의로 크기 설정(최대 4바이트 입력 가능(컴퓨터 성능이 안좋을때) 컴퓨터 성능이 좋다면 더 큰수도 가능

      // 실제로 읽은 바이트 수 저장 변수
      int readByte = 0;

      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();

      // read(byte[] b) 메소드
      // 1. 파라미터로 전달된 byte[] b 에 읽은 내용을 저장한다.
      // 2. 실제로 읽은 바이트 수를 반환한다.
      // 3. 읽은 내용이 없으면 -1을 반환한다.

      // 반복문 : read()의 반환값이 -1 이 아니면 계속 읽는다.
      while ((readByte = bin.read(b)) != -1) {
        sb.append(new String(b, 0, readByte)); // 배열 b의 인덱스 0부터 readByte 개 데이터를 String으로 변환한다.
      }

      /*
       * 15바이트 "abcdefghijklmno"를 4바이트씩 읽는 방식
       * 
       * byte[] b readByte new String(b, 0, readByte)
       * 
       * 1차 Loop ┌---------------┐ 
       *          │ a | b | c | d │ 4 배열 b의 인덱스 0부터 4개 데이터를 String으로변환한다. 
       *          └---------------┘ 
       * 2차 Loop ┌---------------┐ 
       *          │ e | f | g | h │  4 배열 b의 인덱스 0부터 4개 데이터를 String으로 변환한다. 
       *          └---------------┘ 
       * 3차 Loop ┌---------------┐ 
       *          │ i | j | k | l │ 4 배열 b의 인덱스 0부터 4개 데이터를 String으로 변환한다. 
       *          └---------------┘ 
       * 4차 Loop ┌---------------┐ 
       *          │ m | n | o | l │ 3 배열 b의 인덱스 0부터 3개 데이터를 String으로 변환한다. 
       *          └---------------┘ 
       *                         ↑ 
       *                         └---- 이전 Loop에서 읽은 데이터이므로 사용하면 안 된다.
       */
      // 결과확인
      System.out.println(sb.toString());

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bin != null) {
          bin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  public static void ex04() {

    // DataOutputStream과 DataInputStream을 사용하면
    // 바이트 기반 입출력에서도 한글 처리가 가능하다. (writeUTF, readUTF 메소드 이용)

    /*
     * java.io.DataInputStream 클래스 1. int, double, String 등의 변수를 그대로 입력받는 입력스트림이다.
     * 2. 보조스트림이므로 메인스트림과 함께 사용한다.
     * 
     */
    File dir = new File("C:/storage");

    File file = new File(dir, "ex04.dat");

    // 데이터입력스트림 선언
    DataInputStream din = null;

    try {

      // 데이타입력스트림 생성(반드시 예외처리 필요, 파일이 없으면 예외 발생)
      din = new DataInputStream(new FileInputStream(file));

      // 순서대로 입력받기
      char ch1 = din.readChar(); // 't'
      char ch2 = din.readChar(); // '0'
      char ch3 = din.readChar(); // 'm'
      int age = din.readInt(); // 50
      double height = din.readDouble(); // 180.5
      String school = din.readUTF(); // 가산대학교

      // 결과확인
      System.out.println("" + ch1 + ch2 + ch3);
      System.out.println(age);
      System.out.println(height);
      System.out.println(school);

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (din != null) {
          din.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void ex05() {

    /*
     * java.io.ObjectInputStream 클래스 1. 객체를 그대로 입력받는 입력스트림이다. 
     * 2. 직렬화(Serializeable)된 객체를 입력 받을 수 있다. 
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */

    File dir = new File("C:/storage");

    File file = new File(dir, "ex05.dat");

    // 데이터입력스트림 선언
    ObjectInputStream oin = null;

    try {

      // 데이타입력스트림 생성(반드시 예외처리 필요, 파일이 없으면 예외 발생)
      oin = new ObjectInputStream(new FileInputStream(file));

      // 객체 순서대로 입력받기
      Student s = (Student) oin.readObject();

      // 결과확인

      System.out.println(s);

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (oin != null) {
          oin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  public static void main(String[] args) {
    // ex01();
    // ex02();
    // ex03();
    // ex04();
    ex05();
  }

}
