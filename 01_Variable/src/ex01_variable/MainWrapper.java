package ex01_variable;

public class MainWrapper {
  
  public static void main(String[] args) {
     
  // single comment (한 줄 주석)
  /*
     multiple comment
     여러 줄 주석
   */
    
    /*
     * 키워드 규칙
     * 1. 프로젝트 : 마음대로 
     * 2. 패키지   : 모두 소문자로 작성(실무는 회사 도메인을 거꾸로 작성 : com.samaung.xxx  -그룹아이디라고도 함)
     * 3. 클래스   : Upper Camel Case(첫 글자가 대문자인 Camel Case)
     * 4. 메소드   : Lower Camel case(첫 글자가 소문자인 Camel Case)
     * 5. 변수     : Lower Camel Case(첫 글자가 소문자인 Camel Case)
     * 6. 상수     : Snake Case(대문자를 밑줄로 연결)
     */
    
    // 들여쓰기는 필수이다. 코드가 개발자의 얼굴이다.
    
    // 변수 선언하기 
    
    //primitive type - 1 : 논리타입
    boolean isGood = true;       //변수 이름은 의미전달이 좋아야한다. 
    boolean isAlive = false;
    System.out.println(isGood);
    System.out.println(isAlive);  // ctrl + space 정확하게 입력하기 위해서 
    
    //primitive type - 2 : 문자타입
    char ch1 = 'A';
    char ch2 = '가';
    System.out.println(ch1);
    System.out.println(ch2);
    
    //primitive type - 3 : 정수타입
    int score = 100;
    long money = 10000000000L;   //숫자 자체를 보고 L을 붙이는가 아닌가 정한다.  그냥 int는 안붙이고 long은 안붙이기로 하자. 
    System.out.println(score);
    System.out.println(money);
    
    //primitive type - 4 : 실수타입
    double commission = 0.5123456789123465789;
    System.out.println(commission);
    
    // 상수 -변하지 않는 값
    final double PI = 3.141592;  //(final값은 못바꾼다.)
    System.out.println(PI); 
    
    //클래스를 가지고있으면 참조타입이다.
    //reference type : 참조타입   
    String name = "tom";
    System.out.println(name);   //name은 tom의 주소값을 가지고 있다. 
    
    
    /*
     * primitive type    reference type
     * 
     *    boolean            Boolean
     *    char               Character
     *    byte               Byte
     *    int                Integer
     *    long               Long
     *    double             Double              
     *     
     */

    
    
    
    
    
    
    
    
    
  
  }
}
