package ex02_loop;


public class MainWrapper {

  /*
   * for문 
   * 1. 연속된 숫자(수열)를 생성하는 목적의 반복문이다. 
   * 2. 형식
   *    for(초기값; 조건문; 증감문;){
   *      실행문
   *    }   
   *  3. 실행순서
   *      초기값 -> 조건문 -> 실행문 -> 증감문 -> 조건문 -> 실행문 -> 증감문 -> 조건문 .....
   */
  
  public static void ex01() {
  
    // 1 ~ 10 출력하기
    
   for(int n = 1; n <= 10; n++) {
     System.out.println(n);
   }
    
   
   // 10~1 까지 출력하기 
   
   for(int n = 10; n >= 1; n--) {
     System.out.println(n);
   }
   
   for(int n = 0; n < 100; n++) {
     System.out.println(2023 - n + "년");
   }
  }
  
  public static void ex02() {
    
    //특정 횟수 만큼 반복시키는 for문 
    int count = 5;  //5번
    for(int n = 0; n < count; n++) {
      System.out.println(n + " 번");
    }
     
   
    String star = "*";
    int cnt = 10;
    for(int n = 0; n < cnt; n++) {
      for( int m = (cnt - 1) - n; m > 0; m-- ) {
        System.out.print(" ");
      }
      System.out.println(star);
      star += "**"; 
    }
    
  }
  
  /*
   * while문
   * 1. 특정 조건을 만족하면 실행되는 반복문이다. 
   * 2. 형식
   *    while(조건문){
   *       실행문
   *     }
   *     
   */
  public static void ex03() {
     int n = 0;
     while(n < 10) {
        System.out.println(n);
        n++;
     }     
  }
  
  /*
   * do while 문
   * 1. 반드시 1번은 실행되는 while문이다. 
   * 2. 형식
   *    do {
   *       실행문
   *    } while(조건문);
   */
  public static void ex04() {
    
    int n = 100;
    do {    
      System.out.println(n);
      n++;
    } while(n <10); 
  }
  
  /*
   * break문
   * 1.switch문을 종료한다. 
   * 2.반목문(for while, do while)을 종료한다. 
   */
  public static void ex05() {
        
    //무한 루프(끝없는 반복) 만든느 2가지 방법
    //1. while(true) {  }
    //2. for( 빈칸 ; 빈칸  ; 빈칸){  }
    
    //while(true) {
    //  System.out.println("!");  // 무한루프는 실생활에 많이 쓰인다. 
    //}
    
    //무한루프와 break 를 이용한 1 ~ 10 출력하기 
    int n = 1;
    while(true) {
      if(n == 11) {   // 초반에 해석이 편한 자리에 끝나는 조건을 명시하는 것이 좋다 while 문 바로 아래에 
        break;
      }
      System.out.println(n);
      n++;
    }
        
  }
  
  /*
   * continue 문
   * 1. 반목문의 실행 시작 지점부터 다시 실행한다.
   * 2. continue 문 이후의 코드를 실행에서 제외하고자 할 때 사용한다.
   *   
   */
  public static void ex06() {
    
    // 1 ~ 50 사이 정수 중 7의 배수는 제외하고 출력하기 
    
    for(int n = 1; n < 51; n++) {
      if(n % 7 == 0) {
        continue; //for문의 증감문(n++)으로 돌아가시오.
      }
        
      System.out.println(n);
    }
    
  }
  public static void ex07() {
    
    // 중첩(nested) for문
    for(int n = 1; n <=5; n++) {
      System.out.println ("===" + n + "일차 입니다. ");
      for(int m = 1; m <= 8; m++) {
        System.out.println(n + "일차 " + m + "교시입니다.");
      }
    }
    
    
    
  }
  
  public static void main(String[] args) {
    
    //ex01();
    //ex02();
    //ex03(); 
    //ex04();
    //ex05();
    //ex06();
    ex07();
    
    
  }

}
