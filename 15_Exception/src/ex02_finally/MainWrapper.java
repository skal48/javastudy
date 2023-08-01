package ex02_finally;

import java.util.Scanner;

public class MainWrapper {

  // finally 블록을 
  // 1. try-catch문의 마지막 블록을 추가할 수 있다. (생략 가능)
  // 2. 예외 발생 여부와 상관 없이 "항상 마지막"에 실행된다.  
  
  
  public static void main(String[] args) {
    
    //나이를 입력받아서 "주류 구매 가능", "주류 구매 불가능"출력하기
    
    //try 블록과  finally 블록에서 모두 사용할 수 있도록 scope 조정
    Scanner sc = null; // 선언
    try {
      sc = new Scanner(System.in);
      System.out.println("몇 살이세요?");
      int age = sc.nextInt();
      System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
      sc.close();      
    } catch(Exception e) {
      System.out.println("제대로 입력하세요");
    } finally {
      sc.close(); //finally는 주로 자원 반납용으로 사용한다.       
    }
  }

}
