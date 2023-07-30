package ex07_constructor;

public class MainWapper {

  public static void main(String[] args) {
    //Computer myCom 객체 선언
    
    Computer myCom;
    
    //Computer myCom 객체 생성
    myCom = new Computer();// public Computer(){}생성자가 호출된다.
    
    myCom.setModel("gram");
    
    System.out.println("myCom: " + myCom.getModel());
    
    // Computer yourCom 객체 선언
    Computer yourCom;
   
    // Computer yourCom 객체 생성
    yourCom = new Computer("macbook"); // public Computer(String model){}생성자가 호출된다. 
                                       //getter 함수를 소환한 것과 같은 결과이다.      
    System.out.println("yourCom: " + yourCom.getModel());

  }

}
