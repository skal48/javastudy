package ex03_Rectangle;

public class MainWrapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    //정사가형 만들기 
    Square s1 = new Square();
    s1.setWidth(5);
    s1.setHeight(5);
    s1.info();
    
    //정사각형 만들기 
    Square s2 = new Square(6);
    s2.info();
  }

}
