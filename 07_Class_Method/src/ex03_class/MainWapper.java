package ex03_class;

public class MainWapper {

  public static void main(String[] args) {
    
    //calculator 객체 선언
    Calculator myCalc; 
    
    
    
    // Calculator 객체 만들기 
    // 클래스의 이름 객체의 타입이다.
    myCalc = new Calculator();
    
    //계산하고자 하는 실수 2개 준비
    double a = 1.5;
    double b = 1.2;
    
    //덧셈, 뺄셈, 곱셈, 나눗셈 메소드 호추 ㄹ
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.substraction(a, b));
    System.out.println(myCalc.multiplcation(a, b));
    System.out.println(myCalc.division(a, b));
  }

}
