package ex08_SmartPhone;

//인터페이스 다중구현이 가능하다. 
//클래스 상속과 인터페이스 구현을 동시에 할 수 있다. (상속 먼저 구현 나중에 )

public class SmartPhone extends Camera implements Phone, Computer {
  
  //자바는 다중상속이 안되지만 인터페이스로 다중상속기능을 할수 있다. 
 
 
  
  
  
  
  @Override
  public void game() {
    System.out.println("게임");
    

  }

  @Override
  public void internet() {
   
    System.out.println("인터넷");

  }

  @Override
  public void call() {
    

    System.out.println("전화");
  }

  @Override
  public void sms() {
    

    System.out.println("문자");
  }

}
