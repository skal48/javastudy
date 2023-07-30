package ex02_Loop;

public class mainWrapper {
  public static void ex01() {
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2;  // 이 곳에 원하는 구구단을 넣으면 된다.
    
    for(int i = 1; i <10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    } 
   
  }
  
  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    int GOAL = 100000;  // 목표 모금액  final int 상수명 하면 고정된 값이 됨 (상수) 상수는 이름이 대문자 
    int MONEY = 60;  // 1회당 모금액
    int total = 0;  // 모금액 합계
    int nth = 0;  // 회차
    
    /*for(nth = 1; total < GOAL; nth++ ) {
      total += MONEY ;
      System.out.println(nth + "회 모금액" + MONEY + "원, 현재 모금액" + total + "원" );
    }    
    */
   while(total <= GOAL) {
      total += MONEY;
      nth++; 
      System.out.println(nth + "회 모금액" + MONEY + "원, 현재 모금액" + total + "원" );        
    }
    
  }
  
  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81
    //고정 값 : 바깥 loop에 배치
    
    for(int i = 2; i < 10; i++) {
      for(int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + i*j);
      }
      
    }
  }
  
  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2  3x1=3  4x1=4  ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81
    
    // 참고할코드
    //System.out.print("2x1=2");  // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
    
    for(int i = 1; i < 9; i++) {
      for(int j = 2; j <= 9; j++) {
       // System.out.print( j + " * " + i + " = " + i*j + "\t");   //   \t  -- 탭 키라고 하는 것  간격을 맞추는 것
        System.out.print( j + " * " + i + " = " + String.format("%-4d", i * j));
      }                                                           // \t는 프로그램마다 다르다. 
      System.out.println();  // 줄 바꿈
    }    
    
    String str1 = String.format("%d", 10); // %d는 정수 이다. 
    String str2 = String.format("%3d", 10); // 세자리 정수 앞에 한칸을 비우고 뒤에 2개 에 10이 들어감
    String str3 = String.format("%4d", 10); // 네자리 정수 앞에 두칸을 비우고 뒤에 2개에 10이 들어감
    
    String str4 = String.format("%-3d", 10); // 앞에 숫자를 넣고 뒤에를 공백으로 처리 
    String str5 = String.format("%-4d", 10);
    
    System.out.print(str3 + str2 +str1);
    System.out.println();
    System.out.print(str5 + str4);
    
  }
  
  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    // *
    // **
    // ***
    // ****
    // *****   로우가 1일때 별은 1개 
    
    // 참고할 코드
    System.out.print("*");  // *를 출력한 뒤 줄을 바꾸지 않는다.
    System.out.println();   // 줄 바꾸기
    
    for(int i = 1; i <= 5; i++) {      
         
      for(int j = 1; j <= i; j++ ) {
        System.out.print("*"); 
      }
      System.out.println();   
    }   
    
  }
  
  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    // *****
    // ****
    // ***
    // **
    // *
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5 - i ;j++) {
        System.out.print("*");
      }
      System.out.println();
    }    
    
  }
  
  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    
  //System.out.print("*");
  //System.out.print(" ");
  //System.out.println();
  
  for(int i = 0; i < 5; i++) {
    for(int j = 0; j < 4 - i; j++) {
      System.out.print(" ");
      }
    for(int k = 0; k < 2*i + 1; k++) {  //for(int k = 5 - i; k < i + 5; k++)
    System.out.print("*");
    }
    System.out.println();
   }
  }
  
  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    System.out.print("*");
    System.out.print(" ");
    System.out.println();
    
    for(int i = 0; i < 5; i++) {
   
      for(int j = 0; j < i ; j++) {
        System.out.print(" ");
        }
      for(int k = 0; k < 9 - 2 * i; k++) {
        System.out.print("*");
        }
      System.out.println();
     }
  
  
  for(int row = 1; row <= 5; row++) {
    for( int space = 1 ; space <= row - 1; space++) {
      System.out.print(" ");
    }
    for(int star = row; star <= 10 - row; star++  ) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  
  
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    ex08();

    ex04();

    
  }

}
