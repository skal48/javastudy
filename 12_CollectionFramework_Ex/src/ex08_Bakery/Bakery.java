package ex08_Bakery;

import java.util.HashMap;
import java.util.Map;

// 빵을 한종류만 판다. 

public class Bakery {

  private int count; //빵이 몇개있느가?
  public final int PRICE = 2000; //빵이 얼마인가 ?
  private int money; //빵집에 돈이 얼마 있는가?
  
  public Bakery(int count, int money) {
    this.count = count;
    this.money = money;
  }
  
  public void setCount(int count) {
    this.count = count;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  
  public int getCount() {
    return count;
  }
  public int getMoney() {
    return money;
  };
  
  /**
   * 판매 메소드<br>
   * 고객으로부터 구매할 빵의 갯수와 돈을 전달  받아서 판매한다. 
   * @param count 구매할 빵의 개수 
   * @param money 빵을 사려고 내는 돈
   * @return 빵과 잔돈
   */
  
  public Map<String, Integer> sell(int count, int money) {
    
    //빵이 부족하다. 
    if(this.count < count) {
      System.out.println("판매붉합니다. (빵이 부족하다.)");
    }
    
    
    //고객이 돈을 안 냈다.
    if(money <= 0) {
      System.out.println("판매 불가합니다. (돈을 안냈다.)");
      return null;
    }
    
    
    //고객이 낸 돈이 모자르다.
    if(PRICE * count > money) {
      System.out.println("판매불가합니다.(낸 돈이 모자르다)");
      return null;
    }
    
    //잔돈이 부족하다
    if(this.money < money - count*PRICE) {
      System.out.println("잔돈 부족 추가해 주세요.");
      return null;
    }
    
    
    //판매처리
    this.count -= count;
    this.money += count * PRICE;
    
    //고객에게 반환할 Map 생성
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("bread", count);
    map.put("change" , money - count * PRICE);
    
    //고객에게 빵과 잔돈 반환
    return map;
    
  }
  
  
}
