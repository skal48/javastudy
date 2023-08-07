package ex03_functional_interface;

public class MainWrapper {

  public static void ex01() {
    
    // Anonymous inner type
    MyInterface1 interface1 = () -> System.out.println("Hello World");
    
    //method1()호출
    interface1.method1();
    
  }
  
  public static void ex02() {
    
    // Anonymous inner type
    MyInterface2 interface2 = (name) -> System.out.println(name + "님");
    
    /*
     * MyInterface2 interface2 = new MyInterface2() {
     * 
     * @Override public void method2(String name) { // TODO Auto-generated method
     * stub System.out.println(name + "님"); } };
     */
    
    // methode2() 호출
    interface2.method2("홍길동");

  }
  
  public static void ex03() {
    
    // Anonymous inner type
    MyInterface3 interface3 = () -> "hello world";
        
        
        
      /* MyInterface3 interface3 = new MyInterface3() {
      
      @Override
      public String method3() {
        // TODO Auto-generated method stub
        return "hello world";
      }
    };*/
    
    String str = interface3.method3();
    System.out.println(str);
    
  }
  
  public static void ex04() {
    // Anonymous inner type
    Myinterface4 interface4 = (name) -> name + "님";
    
    
    /*
     * MyInterface4 interface4 = new Myinterface4() {
     * 
     * @Override public String method4("홍길동") { // TODO Auto-generated method
     * stub return name + "님"; } };
     */
    String str = interface4.method4("홍길동");
    System.out.println(str);
    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    

  }

}
