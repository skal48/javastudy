package ex02_Soldier;

public class MainWapper {

  public static void main(String[] args) throws RuntimeException{ //main이 예외를 던지면 Java가 예외 처리한다.
    
    Gun gun = new Gun(30);   
    Soldier s = new Soldier(gun); //총알을 30개 가진 군인
    
    s.reload(30); //30발은 장전이 불가능 합니다. 
    s.reload(20); // 20발이 장전 되었습니다. 현재 50 발이 들어있습니다. 
    
    for(int n = 0; n < 50; n++) {
      s.shoot();
    }
    s.shoot(); //헛빵!
    
    

  }

}
