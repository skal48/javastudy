package ex04_Field;


public class mainWrapper {

  public static void main(String[] args) {
 
    
    //AccCalculator  객체의 선언 & 생성
    AccCalculator myAcc = new AccCalculator();
    
    // value 확인
    myAcc.showValue();
    
    //사칙연산
    myAcc.addition(3);         // +3
    myAcc.substraction(2);     // -2
    myAcc.multiplication(3);   // *3
    myAcc.division(2);         // /2
    
    //value 확인
    myAcc.showValue();

  }

}
// 프라이빗은 나만 접근해서 보겠다. 여기서 나는 클래스 
// 퍼블릭은 클래스 바깥에서도 접근가능
