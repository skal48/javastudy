package ex02_Coffee;

import java.util.ArrayList;
import java.util.List;

public class Person {

private List<Cup> tray;
  
  //new Person() 때 tray 생성
  public Person() {
   tray = new ArrayList<Cup>();
  }  
  public void addCupToTray(Cup cup) {
    tray.add(cup);
  }
  
  public void trayInfo() {
    for(int i = 0, lenght = tray.size(); i < lenght; i++) {
      System.out.println((i + 1) + "번째 커피: "+tray.get(i).getCoffee());  //아메리카노와 카페라떼의 toString 동작 
    }
  }
  
  
}
