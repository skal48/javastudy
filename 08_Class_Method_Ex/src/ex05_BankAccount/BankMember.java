package ex05_BankAccount;

public class BankMember {
  
  private String name;
  private BankAccount acc;
  
  
  public BankMember(String name, BankAccount acc) {
    this.name = name;
    this.acc = acc;
    
  }
  
  public BankMember() {
    
  }
  
  //setter
  public void setAcc(BankAccount acc) {
    this.acc = acc;
  }
   public void setName(String name) {
     this.name = name;
   }
  //getter
   public BankAccount getAcc() {
     return acc;
   }
   
   public String getName() {
     return name;
   }
  
  
  
  public void deposit(long money) {
    acc.deposit(money);
  }
  
  public long withdrawal(long money) {
    return acc.withdrawal(money);
  }
  
  public void transfer(BankMember member, long money) {
    member.deposit(withdrawal(money));
  }
  
   
   
   
   public void info() {
    System.out.println("고객명: " + name);    
    acc.info(); 
   }
  

}
