package ex04_override;

public class CafeLatte extends Espresso{

  
  /*
   * 메소드 오버라이드(method override)
   * 1. 슈퍼 클래스의 메소드를 서브 클래스가 다시 만드는 것을 말한다.(메소드 덮어쓰기) 
   * 2. 오버라이드 하는 메소드는 @override annotation 을 추가하는 것이 좋다.(권장이지만 필수로 하자.) 
   * 3. 반드시 동일한 모습으로 오버라이드 해야 한다. (슈퍼 클라스와 똑같이 만들어야 한다. )
   */
  
  @Override  //오버라이드 한 메소드, 문법 체크를 해 준다. 
  public void taste() {
    System.out.println("라떼 맛");
  }
  
  
  /*메소드 오버로딩과 메소드 오버라이드에 대해 
   * 메소드 오버로딩(Overloading)
   * 1. 같은 이름을 가지고 있는 메소드를 여러개 만들 수 있다는 의미이다. 
   * 2. 메소드 오버로딩의 조건
   *    1) 메소드 이름이 같다. 
   *    2) 파라미터가 반드시 달라야 한다. (개수가 다르거나 타입이 다르거나)
   *       
   */
  
}
