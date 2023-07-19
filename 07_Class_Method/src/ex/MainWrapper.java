package ex;

public class MainWrapper {

  public static void ex01() {
    System.out.println("파라미터가 없는 ex01");
    
  }
  
  public static void ex01(String str) { //파라미터 String str :인수)(arguments)를 받아서 저장하는 변수(매개변수)
    System.out.println("파라미터 String str = " + str);
  }
  
  public static void ex01(int a, int b) { //파라미터 int a 와 파라미터 int b 
    System.out.println("파라미터 int a = "+ a );
    System.out.println("파라미터 int b = "+ b );
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ex01();  //ex01() 메소드에 전달하는 인수가 없다.
    ex01("Hello world"); //ex01() 메소드에 인수 "hello world"를 전달한다. 
    ex01(10, 20); // ex01() 메소드에 인수 10, 20을 전달한다. 
    
    
  }

}
