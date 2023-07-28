package ex08_Bakery;

import java.util.HashMap;
import java.util.Map;

public class Customer {
  
  private int buyCount; //빵을 몇개 샀는가?
  private int money; //돈을 얼마나 가지고 있는가

  public Customer(int money) {
    this.money = money;
  }
  
  public void setCount(int buyCount) {
    this.buyCount = buyCount;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  
  public int getCount() {
    return buyCount;
  }
  public int getMoney() {
    return money;
  }
  
  
  /**
   * 구매 매소드<br>
   * Bakery에서 빵을 구매하는 메소드 이다. <br>
   * 어떤 Bakery에서 살 것인지, 몇개의 빵을 살 것인지 , 얼마를 낼 것인지 전달 받는다.
   * 베이커리 클래스의 판매 메소드(sell)을 이용해서 구현한다.  
   * @param bakery 빵을 구매할 베이커리
   * @param count 구매한 빵의 갯수
   * @param money 구매할때 내는 돈
   */
  public void buy(Bakery bakery, int count, int money) {
 // 가진 돈 부족
    if(this.money < money) {
      System.out.println("가진 돈 부족 추가해 주세요");
      return;
    }
    
    
    //베이커리에 카운드와 머니를 전달하고 빵과 잔돈을 받는다. 
   Map<String,Integer> map = bakery.sell(count, money);
    
     
    
    //구매 처리 
    if(map != null) {
    this.buyCount += map.get("bread"); //빵3개 받기
    this.money -= money;            // 10000원 내고 
    this.money += map.get("change");    // 4000원 받기 
    }
  }
  
  
  
}
