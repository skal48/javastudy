package ex04_Field;
/**
 * 
 * 사칙연산 결과를 저장할 수 있는 계산기 
 * 
 * @author 홍길동
 * @since 2023.07.19
 * @version 1.0.0
 * 
 */

public class AccCalculator {
  
  /*
   * 필드(field)
   * 1. 객체가 가질 수 있는 값을 저장 할 변수
   * 2. 클래스에서 선언한다.
   * 3. 필드는 자동으로 초기화 된다. (배열값을 가질 수 있다. 0, 0.0, false, null) null - 참조타입은 값이 없을때 쓰임.
   * 4. 정보 은닉을 위해서 private 처리한다.  
   * 
   */
  
  /**
   * 이 필드는 AccCalculator 의 사칙연산 결과를 <br> 저장할 수 있는 필드이다. 
   */
  private double value;   // 변수가 아니라 필드로 선언
  /**
   * 
   *  전달된 실수를 필드 Value에 더해주는 메소드
   *  
   * @param a 실수 
   */
  public void addition(double a) {
    value += a;    
    System.out.println("+" + a + " = " + value);
  }
  /**
   * 
   * 전달된 실수를 필드 value 에서 빼주는 메소드 
   * 
   * @param a 실수 
   */
  public void substraction(double a) {
    value -= a;    
    System.out.println("-" + a + " = " + value);
  }
  /**
   * 
   * 전달된 실수를 필드 value 에 곱해주는 메소드
   * 
   * @param a 실수
   */
  public void multiplication(double a) {
    value *= a;    
    System.out.println("*" + a + " = " + value);
  }
  /**
   * 
   * 전달된 실수를 필드 value 에서 나눠주는 메소드
   * 
   * @param a 실수
   */
  public void division(double a) {
    value /= a;    
    System.out.println("/" + a + " = " + value);
  }
  
  /**
   * 필드 value를 출력하는 메소드 
   */
  public void showValue() {
    System.out.println(value);
    
  }
  
  
  
}
