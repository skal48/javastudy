package ex02_has_a;

public class MainWapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //Tv 객체 선언 & 생성
    Tv tv = new Tv();
    
    // Tv 객체 메소드 
    tv.upCh();
    tv.upVol();
    System.out.println(tv.getVol());
    System.out.println(tv.getCh());
    
    tv.downCh();
    tv.downVol();
    System.out.println(tv.getCh());
    System.out.println(tv.getVol());
    
    
  }

}
