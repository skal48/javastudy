package ex09_interface;


/*
 * 인터페이스
 * 1.JDK 1.7 이전에는 "추상 메소드 + final 상수" 로만 구성된 추상클래스를 의미 
 * 2.JDK 1.8 이후로는 "추상메소드  + default 메소드 + static 메소드 + final 상수" 로 구성된다. 
 *    1) 추상 메소드    : 본문이 없는 메소드 (대부분 추상 메소드로 구성됨)
 *    2) default 메소드 : 본문이 있는 메소드 
 *    3) static 메소드  : 클래스 메소드 (본문이 있음)  
 * 3. 인터페이스의 추상 메소드는 public abstract 를 생략할 수 있다. 
 * 
 */
public interface Shape {
    
  // final 상수
  public static final double PI = 3.14;
  
  //추상 메소드
 double getArea(); //public abstract 생략된 모습

 // default 메소드
 public default void info1() {   //  --> 객체.info1
   System.out.println("나는 도형이다.1 ");
 }
 
 // static 메소드 
 public static void info2() { //클래스.info2
   System.out.println("나는 도형이다.2");
 }
 
 
}
