package ex10_Cart;

public class MainWrapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Customer c = new Customer(100_000, 1_000);
    // 카트
    Cart cart = new Cart();
    /// 고객이 카트를 가짐
    c.setCart(cart);
    // 고객이 물건을 카트에 넣음
    c.addProductToCart(new Product("1", "양파링", 1000));
    c.addProductToCart(new Product("2", "새우깡", 2000));
    c.addProductToCart(new Product("3", "맛동산", 3000));
    
    //고객이 카트 물건을 바꿈
    c.changeProductFromCart(0, new Product("4", "웨하스", 5000));
    
    //고객이 카트 물건을 뻄
    c.deleteProductFromCart(1);
    
    
    
    
    // 구매하고 영수증 받음
    String receipt = c.buy();
    //영수증 확인
    System.out.println(receipt);
    //고객확인
    System.out.println(c);
    
    
    
    
  }

}
