package ex08_bakery;

public class MainWrapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Bakery bakery = new Bakery(100, 10000); 
    
    Customer customer = new Customer(10000); //돈 만원 가지고 있음
    
    customer.buy(bakery,3, 10000);  //6000원 어치 빵을 구매함 잔돈 4000원
    
    System.out.println("빵집 money: " + bakery.getMoney() + "원");
    System.out.println("빵집 빵: " + bakery.getCount() + "개");
    System.out.println("고객 money:" + customer.getMoney()+"원");
    System.out.println("고객 빵: " + customer.getCount() + "개");
    
    
    
    
  }

}
