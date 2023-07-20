package ex03_class;

public class MainWapper {

  public static void main(String[] args) {
    
    //calculator 객체 선언
    Calculator myCalc; 
    
    
    
    // Calculator 객체 만들기   (객체 == 인스턴스)
    // 클래스의 이름 객체의 타입이다.
    myCalc = new Calculator();  //생성자. 우리가 안만들면 자바가 만든다.  
                                // 인스턴스화 : 메모리에 로드 되었다. 
    //계산하고자 하는 실수 2개 준비
    double a = 1.5;
    double b = 1.2;
    
    //덧셈, 뺄셈, 곱셈, 나눗셈 메소드 호출
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.substraction(a, b));
    System.out.println(myCalc.multiplcation(a, b));
    System.out.println(myCalc.division(a, b));
  }

}
