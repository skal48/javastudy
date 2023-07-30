package ex02_Coffee;

public class Cup {

  private Coffee coffee; //new Coffee()는 불가능 추상메소드 

  public Coffee getCoffee() {
    return coffee;
  }

  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }
  
  
  
  
}
