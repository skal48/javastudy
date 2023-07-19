package ex;

import java.util.Arrays;

public class MainWarpper3 {

  public static void ex01(int[] a) {   //int[] a = 0x1000000
    System.out.println(Arrays.toString(a));  
    a[0] = 100;
    System.out.println("ex01의 배열 a = " + Arrays.toString(a));
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] a = {10, 20, 30};
    ex01(a);
    System.out.println("main의 배열 a = " + Arrays.toString(a));  //[100, 20, 30] 이 나온다. 원래의 배열이 바뀌고 ex01은 a 의 주소를 받는다. --> 참조타입
    
  }

  
}
