package ex03_advanced_fo;

import java.util.Arrays;

public class MainWapper {

  // 1차원 배열의 advanced- for 문
  
  public static void ex01() {
  
    //1차원 배열의 초기화 
    int[] a = {10, 20, 30};
    
    //advanced-for
    //for(배열요소를 저장 할 변수 : 배열 명)
    for(int number :a) { 
      System.out.println(number); //인덱스를 명시 안해도 된다. 
    }                             // 안되는 경우는 배열의 내용이 변할때이다. 

 }
    //advanced-for문을 사용하지 못하는 대표적인 경우 : 베열요소의 값이 변하는 경우 
  
  public static void ex02() {
    // 1차원 배열의 초기화 
    int[] a = {10, 20, 30};
    
    //모든 배열의 요소를 1씩 증가시키기 - 1 :advanced-for문 (불가능) 
    for(int number2 :a) {  //배열의 요소를 복사 해와서 사용하는 것이다. 배열의 주소값에 다시 넣어주어야 한다. 
      number2++;
    }
    
    // 모든 배열요소를 1씩 증가시키기 -2 : 일반 for 문 (가능)
    for (int i = 0; i < a.length; i++) {
      a[i]++;
    }
    // 배열 요소 확인
    System.out.println(Arrays.toString(a));
       
  }
  
  
  //2차원 배열의 advanced-for문
  public static void ex03() {
    int[][] a = {
        {10, 20},
        {30, 40},
        {50, 60}
    };
    
    // advanced-for문
    for(int[] b : a) {
      for(int number : b) {
        System.out.print(String.format("%4d", number));
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    ex03();
    
    
  }

}
