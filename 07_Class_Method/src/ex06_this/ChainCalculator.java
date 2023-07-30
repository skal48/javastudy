package ex06_this;

public class ChainCalculator {
  /*
   * this
   * 1. 필드나 메소드를 호출하는 객체의 참조값이다.
   * 2. 클래스 내부에서만 사용할 수 있는 키워드이다.
   */

  /**
   * <p>메소드를 연속해서 호출할 수 있는 메소드 체이닝(method chaining)이 가능한 계산기</p>
   * <p>사칙연산 메소드를 연속해서 호출할 수 있다.</p>
   * @author 홍길동
   * @since 2023.07.20
   * @version 1.0
   */
 

    /**
     * 필드 value는 사칙연산의 결과를 저장하고 있다.
     */
    private double value;
    
    
    public void printThis() {
      System.out.println("현재 객체(printThis 메소드를 호출한 객체)의 참조값: " + this);
      
    } 
    //Setter
    public void SetValue(double value) {
      this.value = value; //this.value는 필드 value를 의미, 필드와 파라미터의 이름이 같을 경우 this를 붙여서 사용 
    }
    
    public double getValue() {
      return value;
    }
    
    
    public ChainCalculator on() {
      System.out.print(value);
      return this;
    }
    
    public ChainCalculator addition(double a) {
      value += a;
      System.out.print("+" + a );
      return this;
    }
    
    public ChainCalculator substraction(double a) {
      value -= a;
      System.out.print("-" + a);
      return this;
    }
    
    public ChainCalculator multiplication(double a) {
      value *= a;
      System.out.print("*" + a );
      return this;
    }
    
    public ChainCalculator division(double a) {
      value /= a;
      System.out.print("/" + a );
      return this;
    }
       
    
    public void done() {
      System.out.print("=" + value);     
    }
    
  }   
  

    
 
