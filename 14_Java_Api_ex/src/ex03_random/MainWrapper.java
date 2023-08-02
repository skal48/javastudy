package ex03_random;



import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class MainWrapper {

  // 문제1. 주사위 3개 던지기.
  // 주사위 3개를 동시에 던져서 나오는 상황을 연출하시오. Random 클래스를 활용하시오.
  // 실행예시)
  // 주사위: [3, 1, 5]
  public static void ex01() {
    int[] dice = new int[3];
    Random random = new Random();
    for(int i = 0; i < 3; i++) {
    dice[i] = random.nextInt(6) + 1;
    }
    System.out.println("주사위: [" + dice[0] + ", " + dice[1] + ", " + dice[2]+"]" ); //Arrays.toString(dice)
    
    
  }
  
  // 문제2. 통장(balance)에 최초 5000원이 있다.
  // 1원부터 통장 잔고 사이의 난수를 발생시켜서 해당 난수만큼 출금 처리하시오.
  // 더 이상 출금이 불가능한 상황이면 출금을 멈추시오.
  // 실행예시)
  // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
  // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
  // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
  // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
  // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
  // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
  public static void ex02() {
    // 통장
    int balance = 5000;
    Random random = new Random();
    
    for(int i = 1; i < i+1; i ++) {
      int wd = random.nextInt(balance) + 1 ;
      System.out.print("출금 전 " + balance + "원, " + i + "회 출금액 " + wd + " 원, " + "출금 후 ");
      balance -= wd;
      System.out.println(balance + "원");
      if(balance == 0) {
        return;
      }
           
      /*
       * int balance = 5000;  // 통장 
       * int nth = 0;  // 회차
       * while(balance > 0) {
       *   nth++;  // 회차 증가
       *  int withdrawal = (int)(Math.random() * balance) + 1;  // 1 <= withdrawal <= balance
       *   System.out.println("출금 전 " + balance + "원, " + nth + "회 출금액 " + withdrawal + "원, 출금 후 " + (balance -= withdrawal) + "원");
       * }
       * 
       */
    }
    
    
    
    
  }
  
  // 문제3. 인증코드 6자리 만들기.
  // 0~9 사이 값을 이용하여 임의의 인증코드 6자리를 생성하시오. SecureRandom 클래스를 활용하시오.
  // 실행예시)
  // 인증코드: [966419]
  public static void ex03() {
    SecureRandom sr = new SecureRandom();
    int code = sr.nextInt(900000) + 100000; 
    
      System.out.println("인증코드: [" +  code + "]");
     
      /*
       * SecureRandom secureRandom = new SecureRandom();
       * String code = "";
       * for(int n = 0; n < 6; n++) {
       *  code += secureRandom.nextInt(10);  // 0~9
       * }
       * System.out.println("인증코드: [" + code + "]");
       */
  }
  
  // 문제4. 구구단을 외자.
  // 2~9단 사이의 임의의 구구단이 출력되면 사용자는 정답을 입력한다.
  // 정답을 입력해서 맞히면 "정답", 틀리면 "땡"을 출력하시오. Math 클래스의 random() 메소드를 활용하시오.
  // 실행예시1)
  //   4x9? >>> 36
  //   정답
  // 실행예시2)
  //   8x7? >>> 49
  //   땡
  public static void ex04() {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in); 
    
    int one = rd.nextInt(8) + 2;
    int two = rd.nextInt(9) + 1;
    System.out.print(one + "*" + two + "? >>> ");
    int three = sc.nextInt();
   
    if(three == one * two) {
      System.out.println("정답");      
    }else {
      System.out.println("땡");     //System.out.println(answer == dan * n ? "정답" : "땡");
    }
    
    sc.close();
  }
  
  // 문제5. 자동으로 진행되는 윷 던지기를 구현하시오. 윷이나 모가 나오면 추가로 던지시오.
  // 실행예시1)
  //   "도", 1칸 이동한다.
  // 실행예시2)
  //   "개", 2칸 이동한다.
  // 실행예시3)
  //   "걸", 3칸 이동한다.
  // 실행예시4)
  //   "윷", "도", 5칸 이동한다.
  // 실행예시5)
  //   "모", "윷", "도", 10칸 이동한다.
  public static void ex05() {
    String[] yut = {"", "도", "개", "걸", "윷", "모"};
    Random rd = new Random();
    int total = 0;
    
    for(int i = 0; i < i + 1; i++) {
      int a = rd.nextInt(5) + 1;
      System.out.print("\"" + yut[a]+ "\"" + ", ");
      if(a == 4 || a == 5) {        
        total += a;
      }else if(a == 1 || a == 2 || a == 3) {
        total += a;
        System.out.println(total +"칸 이동한다.");
        break;
      }
    }
        
    /*
     *  String[] yut = {"", "도", "개", "걸", "윷", "모"};
     *  int move = 0;
     *  int totalMove = 0;
     *  do {
     *    move = (int)(Math.random() * 5 + 1);      // 이동횟수 1~5는 yut 배열의 인덱스로 활용한다.
     *    totalMove += move;
     *    System.out.print("\"" + yut[move] + "\"");// "도"~"모"
     *    System.out.print(", ");
     *  } while(move >= 4);
     *  System.out.println(totalMove + "칸 이동한다.");
     * 
    
     */
    
    
    
  }
  
  // 문제6. 가위바위보.
  // 사용자로부터 "가위", "바위", "보" 중 하나를 입력 받아서 컴퓨터와 가위바위보를 진행하시오.
  // 내부적으로 가위는 0, 바위는 1, 보는 2로 처리하시오.
  // 실행예시)
  // 가위바위보 >>> 가위
  // 당신은 가위, 컴퓨터는 보, 당신은 이겼습니다.
  public static void ex06() {
    String[] rsp = {"가위", "바위", "보"};
    Random rd = new Random();
    int a = rd.nextInt(3);
    
    Scanner sc = new Scanner(System.in);
    System.out.print("가위바위보 >>> ");
    String me = sc.next();
    
    if(rsp[a].equals(me) ) {
      System.out.println("당신은 " + me + ", 컴퓨터는 " + rsp[a] + ", 비겼습니다. ");
    }else if((a == 0 && me.equals("바위")) || (a == 1 && me.equals("보")) || (a == 2 && me.equals("가위")) ) {
      System.out.println("당신은 " + me + ", 컴퓨터는 " + rsp[a] + ", 당신은 이겼습니다. ");
    }else if((a == 0 && me.equals("보")) || (a == 1 && me.equals("가위")) || (a == 2 && me.equals("바위"))) {
      System.out.println("당신은 " + me + ", 컴퓨터는 " + rsp[a] + ", 당신은 졌습니다. ");
    }else {
      System.out.println("다시 실행해주세요.");
    }
    
    sc.close();
    
     // String[] rsp = {"가위", "바위", "보"};
     // int com = (int)(Math.random() * 3);
     // int user = 0;
     // Scanner sc = new Scanner(System.in);
     // System.out.println("가위바위보 >>> ");
    
     // switch(sc.next()) {
     // case "가위": user = 0; break;
     // case "바위": user = 1; break;
     // case "보":   user = 2; break;
     // }
    
     // String result = null;
     // switch(user - com) {
     // case -2:
     // case 1:
     //   result = "이겼습니다.";
     //   break;
     // case 0:
     //   result = "비겼습니다.";
     //   break;
     // default:
     //   result = "졌습니다.";
     // }
     // System.out.println("당신은 " + rsp[user] + ", 컴퓨터는 " + rsp[com] + ", " + result);
     // sc.close();
         
    
  }
  
  // 문제7. "대문자+소문자+숫자"로 구성된 인증번호를 만드시오.
  // 사용자로부터 몇 자리의 인증번호를 만들것인지 입력 받아서 처리하시오.
  // 대문자와 소문자와 숫자는 임의의 비율로 나타나도록 처리하시오. SecureRandom 클래스를 활용하시오. 
  // 실행예시1)
  //   몇 자리의 인증번호를 생성할까요? >>> 4
  //   생성된 4자리 인증번호는 7W5e입니다.
  // 실행예시2)
  //   몇 자리의 인증번호를 생성할까요? >>> 6
  //   생성된 6자리 인증번호는 Fa013b입니다.
  public static void ex07() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("몇 자리의 인증번호를 생성할까요? >>> ");
    int a = sc.nextInt();
    System.out.print("생성된 " + a + "자리 인증번호는 ");
    
    SecureRandom rd = new SecureRandom();
    
    for(int i = 0; i < a; i++) {
      int temp = rd.nextInt(72);
      if((temp >= 10 && 16 >= temp) || (temp >= 43 && temp <= 48) ) {
        i--;
        continue;
      }else {
               
      }
      char ascii = '0';
      ascii += temp;
      System.out.print(ascii);
     
    }
    System.out.println("입니다.");
    
    sc.close();
    
    
   // System.out.println("몇 자리의 인증번호를 생성할까요? >>> ");
   // int count = sc.nextInt();
   // SecureRandom secureRandom = new SecureRandom();
   // StringBuilder sb = new StringBuilder();
   // for(int n = 0; n < count; n++) {  // count만큼 반복하기
   //   double randomNumber = secureRandom.nextDouble();  // 0.0 <= randomNumber < 1.0
   //   if(randomNumber < 0.33) {
   //     sb.append(secureRandom.nextInt(10));
   //   } else if(randomNumber < 0.66) {
   //     sb.append((char)(secureRandom.nextInt(26) + 'A'));
   //   } else {
   //     sb.append((char)(secureRandom.nextInt(26) + 'a'));
   //   }
   // }
   // String code = sb.toString();
   // System.out.println("생성된 " + count + "자리 인증번호는 " + code + "입니다.");
   // sc.close();
    
  }
  
  // 문제8. UpDown 게임
  // 1 ~ 10000 사이의 난수를 발생시키고 해당 난수를 사용자가 맞히는 게임이다.
  // 입력마다 "Up!", "Down!" 메시지를 출력하시오.
  // 실행예시)
  // 입력 >>> 5000
  // Down!
  // 입력 >>> 2500
  // Up!
  // ...
  // 입력 >>> 4500
  // 정답. 총 5번만에 성공.
  public static void ex08() {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int number = rd.nextInt(10000) + 1;
    
    for(int i = 0; i < i + 1; i++) {
      System.out.print("입력 >>> ");
      int player = sc.nextInt();
      
      if(number > player) {
        System.out.println("Up!");
      }else if(player > number) {
        System.out.println("Down!");      
      }else if(player == number) {
        System.out.println("정답. 총 " + (i+1) + "번만에 성공.");
        return;
      }
      sc.close();
    }
    
    
   // Scanner sc = new Scanner(System.in);
   // int goal = (int)(Math.random() * 10000) + 1;
   // int input = 0;
   // int nth = 0;
   // do {
   //   System.out.println("입력 >>> ");
   //   input = sc.nextInt();
   //   nth++;
   //   if(goal == input) {
   //     System.out.println("정답은 " + goal + "이었습니다. " + nth + "번만에 성공했습니다.");
   //   } else if(goal > input) {
   //     System.out.println("Up!");
   //   } else {
   //     System.out.println("Down!");
   //   }
   // } while(goal != input);
   // sc.close();
    
  }
  
  // 문제9. 0~9 사이 난수를 100개 생성하시오.
  // 발생한 0~9 사이의 각 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
  // 실행예시)
  // 0 : #### 4
  // 1 : ############ 12
  // 2 : ############ 12
  // 3 : ##### 5
  // 4 : ######## 8
  // 5 : ########### 11
  // 6 : ############ 12
  // 7 : ################## 18
  // 8 : ####### 7
  // 9 : ########### 11
  public static void ex09() {
    int[] number = new int[100];  // 100개 난수
    int[] count = new int[10];    // 각 숫자가 발생한 횟수
    
    SecureRandom sr = new SecureRandom();
    
    
      for(int i = 0; i < 100; i++) {
        number[i] = sr.nextInt(10);
        for(int j = 0; j < 10; j++) {
          if(number[i] == j) {
            count[j]++;        
          }          
        }
      }
      
      // for(int i = 0; i < number.length; i++) {
      //   number[i] = (int)(Math.random() * 10);
      //   count[number[i]]++;
      // }
      
      
     for(int k = 0; k < 9; k++) {
       System.out.print(k + " : ");
       for(int a = 0 ; a < count[k] + 1; a++) {
         System.out.print("#");
       }
       System.out.println(" " + count[k]);
     }
     
    // for(int i = 0; i < count.length; i++) {
    //   StringBuilder sb = new StringBuilder();
    //   for(int n = 0; n < count[i]; n++) {  // count 배열에 저장된 값(count[i])만큼 반복
    //     sb.append("#");
    //   }
    //   String graph = sb.toString();
    //   System.out.println(i + " : " + graph + " " + count[i]);
    // }
  }
  
  // 문제10. 다음 순서에 따라서 5 x 5 형태의 숫자 빙고판을 자동으로 생성하시오.
  // 지시사항)
  //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo에 순차적으로 넣는다.
  //      1  2  3  4  5
  //      6  7  8  9 10
  //     11 12 13 14 15
  //     16 17 18 19 20
  //     21 22 23 24 25
  //   2. 섞는다.
  //      총 25번의 교환이 랜덤하게 발생된다.
  //      bingo[0][0] <-> bingo[1][4]
  //      bingo[0][1] <-> bingo[0][2]
  //      bingo[0][2] <-> bingo[2][1]
  //      ...
  //      bingo[4][4] <-> bingo[3][1]
  // 실행예시)
  //  10  9  4 25  2
  //  15  3 13 21  1
  //  14 20 11 19  6
  //   8 17  5 12  7
  //  16 22 18 24 23
  public static void ex10() {
    final int SIZE = 5;
    int[][] bingo = new int[SIZE][SIZE];
    Random rd = new Random();   
    
    for(int i = 0; i < SIZE; i++) {
      for(int j =0; j <SIZE; j++) {
        bingo[i][j] = (i * SIZE) + (j + 1);
      }
    }
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        int a = rd.nextInt(SIZE);
        int b = rd.nextInt(SIZE);
        int[][] tmp = new int[SIZE][SIZE];
        tmp[i][j] = bingo[i][j];
        bingo[i][j] = bingo[a][b];
        bingo[a][b] = tmp[i][j];      
      }      
      
      // int temp;
      // temp = bingo[i][j];
      // bingo[a][b] = temp;   더 간략하게 나타 낼 수 있음
    }
    
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        System.out.print(String.format("%3d", bingo[i][j]));
      }
      System.out.println();
    }
      
    
    
    
  }
  
  public static void main(String[] args) {
   // ex01();
   // ex02();
   // ex03();
   // ex04();
   // ex05();
    ex06();
   // ex07();
   // ex08();
   // ex09();
   // ex10();
  }

}
