package ex08_bakery;

public class BreadChange {
  private int bread; //판매한 빵이 몇개인가?
  private int chage; //잔돈이 얼마인가?
  
  public BreadChange(int bread, int chage) {
    this.bread = bread;
    this.chage = chage;
  }
  
  public void setBread(int bread) {
    this.bread = bread;
    
  }
  public void setChange(int change) {
    this.chage = change;
  }
  public int getBread() {
    return bread;
  }
  public int getChage() {
    return chage;
  }
  
}
