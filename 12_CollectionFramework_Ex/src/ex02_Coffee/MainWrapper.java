package ex02_Coffee;

public class MainWrapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Cup cup1 = new Cup();
    Cup cup2 = new Cup();
    Coffee coffe1 = new Americano("아메리카노");
    cup1.setCoffee(coffe1);
    
    
    Coffee coffee2 = new CafeLatte("카페라떼");
    cup2.setCoffee(coffee2);
    
    Person p = new Person();
    p.addCupToTray(cup1);
    p.addCupToTray(cup2);
    
    p.trayInfo();
    
    
    
    
   
  }

}
