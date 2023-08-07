package ex02_lambda;

/*
 * 람다 표현식
 * 1. Anonymous Inner Type 방식의 객체를 생성할 때 사용할 수 있는 표현식이다. 
 * 2. 추상 메소드가 하나인 인터페이스 에서 람다 표현식을 사용할 수 있다. (두개 메소드가 있으면 사용 못한다.)
 *    (함수형 인터페이스 : 추상메소드가 하나인 인터페이스)
 * 3. 형식
 *    (매개변수)->{
 *      본문;
 *     };   
 */

/*
 * 람다 표현식의 적용 예시
 * 
 * 1. 파라미터가 없고 반환도 없는 
 *    () -> { 
 *      System.out.println("Hello World");
 *     };
 * 
 *    () -> System.out.println("Hello World"); // 메소드 본문이 1줄이면 중괄호 {] 생략이 가능
 *    
 * 2. 파라미터 O, 반환 X (파라미터의 타입은 생략한다. )
 * 
 *    (name) -> {
 *    (System.out.println("Hello " + name);
 *    }
 *      
 *    (String name) -> System.out.println("Hello " + name);  
 *    
 * 3. 파라미터 X, 반환 O (반환 타입은 생략한다. )      
 *
 *   () -> {
 *      String name = "tom";
 *      return name;
 *   }
 *   
 *   () -> "tom"; // 메소드에 return만 존재하면 return을 생략한다.
 *    
 * 4. 파라미터 O, 반환 O
 *   
 *   //이름을 전달하면 "님"을 붙여서 출력하고 ,
 *   //해당 값을 반환하는 함수 
 *   
 *   (name) -> { 
 *      String retVal = name + "님"
 *      System.out.println(retVal);
 *      return retVal;
 *    }
 *   
 *   //정수 값을 전달하면 해당 값보다 1이 큰 수를 반환하는 함수 
 *   
 *   (n) -> n + 1; 
 *       
 *   
 */        
 



import ex01_anonymous_inner_type.Car;

public class GasStation {

  private int totalOil;
  private int payPerLiter;
  private int earning;
  
  public GasStation() {
    
  }

  public void sellOil(String model, int oil) {
   //Car 인터페이스를 구현한 별도 클래스를 만들고, 해당 클래스 객체를 만들고, addOil()호출
   //Car`s addOil()
   // Car car 지역변수(객체) 선언 (sellOil 메소드 호출 시 생성되고, sellOil 메소드 종료시 소멸된다.)
    Car car;
    
    // car 지역변수(객체) 생성
    // 람다식으로 Car인터페이스 타입의 객체 생성
    car = () -> {//자바스크립스에서 애로우 펑션 함수형 프로그램이 가능한 함수형 프로그래밍
      
      totalOil -= oil;
      earning += oil * payPerLiter;
      System.out.println(model + " " + oil +"L 주유 완료");
      
    };
    
    
    /*
      car = new Car() { //본문을 같이 만들어라 
      
      @Override
      public void addOil() {
        totalOil -= oil;
        earning += oil * payPerLiter;
        System.out.println(model + " " + oil +"L 주유 완료");
         
      }
    };
    */
    
    //Car car 지역 변수(객체)의 addOil()메소드 호출
    car.addOil();
    
  }
  
  
  
  
  
  
  
  
  public int getTotalOil() {
    return totalOil;
  }

  public void setTotalOil(int totalOil) {
    this.totalOil = totalOil;
  }

  public int getPayPerLiter() {
    return payPerLiter;
  }

  public void setPayPerLiter(int payPerLiter) {
    this.payPerLiter = payPerLiter;
  }

  public int getEarning() {
    return earning;
  }

  public void setEarning(int earning) {
    this.earning = earning;
  }
}
