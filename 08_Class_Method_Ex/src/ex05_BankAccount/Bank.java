package ex05_BankAccount;

public class Bank {
 
  private String bankName;
  private String bankPhone;
  
  public Bank(String bankName, String bankPhone) {
    this.bankName = bankName;
    this.bankPhone = bankPhone;
  }
  
  
  public void info() {
    System.out.println("개설지점: " + bankName +"(" + bankPhone + ")");
  }
  
}
