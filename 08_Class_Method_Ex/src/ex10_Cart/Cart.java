package ex10_Cart;

public class Cart {
  
  /* Product 배열의 길이 */ private final int CART_LENGTH = 10;
  /* Product 배열 */        private Product[] products = new Product[CART_LENGTH]; 
  /* 담긴 Product 갯수 */   private int prodCount;
  
  // new Cart()
  
  public Cart() {
    // TODO Auto-generated constructor stub
  }

  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getProdCount() {
    return prodCount;
  }

  public void setProdCount(int prodCount) {
    this.prodCount = prodCount;
  }
 
  //물건 넣기 순차적으로  
  //addProduct(new Product("제품번호", "제품명", 제품가격))
  public void addProduct(Product product) {
    if(prodCount == CART_LENGTH ) {
      System.out.println("Cart id Full");
      return;
    }
    //물건 넣기 productCount 는 0부터 시작하기 떄문에 인덱스로 사용할 수 있음
    products[prodCount++] = product; 
    
    
  }
  
  
  //물건 바꾸기
  //changeProduct(0, new product("제품번호","제품명", 제품가격))
  public void changeProduct(int idx,Product product) {
    if(prodCount <= idx || idx < 0) {
      System.out.println("There is no product ");
      return;
    }
    products[idx] = product;
    
  }
  
  //물건 빼기
  public void  deleteProduct(int idx) {
    if(prodCount == 0) {
      System.out.println("Cart is Empty");
      return;
    }
    
    if(prodCount <= idx || idx < 0 || products[idx] == null) {
      System.out.println("There is no products");
      return;
    }
    
    //idx 복사할 요소의 갯수 
    //0   3     idx + x +1 = prodcount
    //1   2      x = prodCount - idx -1 
    //2   1
    System.arraycopy(products, idx + 1, products, idx, prodCount - (idx + 1));
    products[--prodCount] = null;
    
  }
  
  
}
