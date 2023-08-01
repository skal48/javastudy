package ex03_throw;

import java.util.Scanner;

public class Mainwrapper {

  /*throw
   * 1. 예외 객체를 직겁 생성(new)해서 던질 때 사용한다. 
   * 2. JAVA는 예외로 판단하지 않는 것들을 던질 때 사용한다. 
   * 3. 개발자가 직겁 예외를 처리할 때 사용한다.  
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    
    
    Scanner sc = null; 

    try {
      sc = new Scanner(System.in);
      System.out.println("몇 살이세요?");
      int age = sc.nextInt();
      if(age < 0 || age >100) {
        throw new RuntimeException(); // 직접 RuntimeException을 발생시켜서 던진다. 
      }
      System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
      sc.close();      
    } catch(Exception e) {
      System.out.println("제대로 입력하세요");
    } finally {
      sc.close(); 
    }
  }

}
