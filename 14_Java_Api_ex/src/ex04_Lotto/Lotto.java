package ex04_Lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
  private final int MAX = 100000;
  private int money;
  
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money 사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0 로또 구매 실패 시 반환
   */
  public int buyLotto() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> ");
    int money = sc.nextInt();
    if(money < 1000 || money > MAX) {
      System.out.println(money + "원 Lotto 구매는 불가능합니다.");
      return 0;
    }
    return this.money = money - (money % 1000);
   
    
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money 로또 구매 비용
   */
  public void generateLotto(int money) {
    Random rd = new Random();
    int count = 0;
    
    if(this.money / 5000 == 0) {
      count = (this.money / 5000);
    }
      count = (this.money / 5000) + 1;
    
      
    
    
    for(int i = 0; i < count ; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print(String.format("%02d",j + 1) + " : ");
        for(int k = 0; k < 6; k++) {
          int ball = rd.nextInt(45) + 1;
          System.out.print(String.format("%4d", ball));   
          }
        if( i * 5 + ( j + 1 ) == this.money / 1000 ) {
          System.out.println();
          System.out.println(i +1 + "개 ------------------------------");
          return;
        }
        System.out.println();
      }
      System.out.println("------------------------------");
    }
    
    
    
    
  }
    
}
