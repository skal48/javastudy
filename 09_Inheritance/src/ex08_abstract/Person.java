package ex08_abstract;

/*
 * 추상클래스 
 * 1. 추상메소드를 1개 이상 가지고 있는 클래스이다. 
 * 2. abstract 키워드를 추가하면 된다. public 뒤에 붙인다. 
 * 3. 추상클래스는 객체를 생성할 수 없다.(미완성된 클래스이기 때문이다. 본문이 없는 메소드가 있어서 그렇다.  ) 
 * 4. 추상클래스의 서브클래스는 "반드시" 추상메소드를 오버라이드 해야한다.  
 * 
 */



public abstract class Person {

  
  public void eat() {
    System.out.println("냠냠");
    
  }
  public void sleep() {
    System.out.println("쿨쿨");
  }
  
  ///호출을 위해서 생성된 Study
  // 본문이 필요없기 때문에 본문이 없는 메소드로 만들 수 있다.
  //본문이 없는 메소드를 "추상 메소드" 라고 한다.
  //abstract 키워드를 추가하고 본문({})을 제거한다. 
  public abstract void study();
  
  
     
                             
}
