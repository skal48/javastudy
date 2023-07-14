package ex01_one_dim;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mainWrapper {
  /*
   * 배열
   * 1. 여러 변수를 하나의 이름으로 관리하는 자료 구조이다. 
   * 2. 배열에 저장된 모든 변수가 이름은 같지만, 인덱스가 다르다.
   * 3. 인덱스란 배열의 모든 변수를 구분하기 위한 위치 정보이다. 0부터 1씩 증가하는 값을 가진다.
   * 4. 기본 용어 
   *   1) 배열명    : 모든 변수의 대표 이름
   *   2) 인덱스    : 첨자, 모든 변수를 구분하는 숫자 
   *   3) 배열 요소 : 배열에 속한 각 변수를 의미  
   */
   
   /*
    * 배열의 선언 & 생성
    * 1. 배열의 서언 
    *   1) int[] 배열명  --추천
    *   2) int 배열명[]  --C 언어 기반의 언어에서 자주쓰임
    *  2. 배열의 생성
    *    배열명 = new int [생성할 변수의 갯수]    
    */
   
   /*
    * 배열요소 
    * 1. 배열에 저장된 각 변수를 의미한다. 
    * 2. 일반 변수와 다르게 자동으로 초기화된다.
    *      0, 0.0, false, null(없다라는 뜻을 가진 것들) 값으로 초기화 된다. 
    * 3. 배열 요소 호출방법
    *    배열명[인덱스]
    */
   
   public static void ex01() {
     
     //배열의 선언
     int[] a;
     
     //배열의 생성
     a = new int[5];
     
     // 배열 요소 확인
     System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a[2]);
     System.out.println(a[3]);
     System.out.println(a[4]);
     //System.out.println(a[5]); // 인덱스의 범위를 벗어난 배열요소 : 예외발생
         
   }
   
   public static void ex02() {
     
     //배열에 저장할 변수의 갯수를 앞으로 "배열의 길이"라고 표현한다. 
    int length = 5;
     
     //배열의 선언 & 생성
     int[] a = new int[length];
     
     //배열 요소를 하나씩 순차적으로 for 문으로 접근해보기 
     
     for(int i = 0; i < length; i++) {
       System.out.println(a[i]); //a[0], a[1]..을 순차적으로 호출
     }
     
   } 
   
   public static void ex03() {
     
     //배열의 선언 및 생성
     int[] a = new int[5];
     
     //배열의 순회 
     // 배열의 길이는 "배열명.length"로 알아낼 수 있다. 
     for(int i = 0; i < a.length; i++) {
       System.out.println(a[i]);
     }    
   }
   
   /*
    * 배열의 초기화 
    * 1. 배열을 생성하면 자동으로 초기화된다. (0, 0.0, false, null)
    * 2. 중괄호({})를 이용해서 초기화 하고자 하는 값을 지정할 수 있다.
    * 3. 배열의 초기화는 최초배열을 선언할 때만 사용가능
    * 4. 형식
    *     int[] a = {10, 20, 30, 40};  
    */
   
   public static void ex04() {
     
     //배열의 초기화 
     int[] a = {10, 20, 30};
     
     for(int i = 0; i < 3; i++) {
       System.out.println( a[i] );
        }
     
   }
   /*
    * 배열의 구조 
    * 1. 배열의 타입은 참조타입(reference type)이다.
    * 2. 배열의 모든 요소는 순서대로 메모리의 연속된 공간을 할당받는다. 
    * 
    */
   
   public static void ex05() {
     int day =14;
     int nDay = 10;
     day += nDay; //14일로부터 10일 후 
     
     String[] weeknames = {"금", "토", "일", "월", "화", "수" };
     System.out.println(day + "일은 " + weeknames[day % 7] + "요일입니다.");
   }
   public static void ex06() {
     
     //배열의 서언 및 생성
     int[] a = new int[5];  //new 메모리 공간 확보하라는 것 
     
     //배열명 확인
     System.out.println(a);  //배열의 참조 값(주소 값) 확인 
   }
   
   public static void ex07() {
    
     //배열의 초기화 
     
     int[] a = {10, 20, 30};
     
     //배열의 선언
     
     int[] b;
     // 배열의 a의 참조 값을 배열b 로 전달하면 배열 a와 b 는 동일한 메모리 공간을 참조할 수 있다. 
     b = a;
     
     //배열 순회 
     for(int i = 0; 0 < b.length; i++) {
       System.out.println(b[i]);
     }
     
  }
   public static void ex08() {
     
    //배열이 생성되면 배열의 길이 변경은 불가능하다.
    // 하지만, 배열의 길이를 변경(대부분 길이를 늘리는 것)하려면??
    //새로운 배열을 만들어서 기존 배열의 데이터를 모두 옮긴다. 
     
     // 기존의 배열
     int[] a = {10, 20, 30};
     
     //신규 배열
     int[] b = new int[5];
     
     // 신규 배열 <- 기존 배열
     /*
       for(int i = 0; i < a.length; i++) {
         b[i] = a[i];
       }
      */
     
     System.arraycopy(a, 0, b, 0, a.length ); //배열 a의 인덱스 0부터 시작, 배열b의 인덱스 0으로 보내기 시작,a.length 만큼 복사 
     
     // 기존 배열 a의 참조 값을 새로운 배열의 b의 참조 값으로 변경
      a = b;
     //이제 더 이상 배열 a가 참조하던 0x10000000 영역을 참조하는 변수가 없다.   0x10000000  -> 0x20000000 으로 곧장 가시오 같아 지면서 원래에 100~아래에 있던 곳에 메모리 누수가 된다. 
     // 이런 영역을 c++ 같은 언어에서는 delete 명령으로 개발자가 직겁 메모리를 해제해야하지만 자바는 스스로 메모리를 해제한다. (garbage collector가 담당 : System.gc())
      
      //배열 a 확인(단순 조회는 Java의 기능을 이용할 수 있다);
      
      
      
      System.out.println(Arrays.toString(a));
      
      
     
   }
     public static void main(String[] args) {
   
    
    //ex01();
    //ex02();
    //ex04();
    ex08(); 
  }
  
  
  

}
