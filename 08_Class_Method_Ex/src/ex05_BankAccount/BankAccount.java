package ex05_BankAccount;

public class BankAccount {

  private String accNo;
  private long balance;
  private Bank bank;
  
  
  public BankAccount(Bank bank, String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
    this.bank = bank;
  }
  
  public BankAccount() {
    
  }
  //setter
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  //getter
  public Bank getBank() {  
    return bank;
  }
  
  public String getAccNo() {
    return accNo;
  }
  
  public long getBalance() {
    return balance;
  }
  
  public long withdrawal(long money) {
  
    /*long retVal = 0;
    if(money <= 0 || money > balance) {
      retVal = 0;
    }else {
    balance -= money;
    retVal = money;
    }
    return retVal; */
    
      long retVal = 0;
    if(money > 0 && money <= balance) {
    balance -= money;
    retVal = money;
    }
    return retVal;
     

  }
  
  public void deposit(long money) {
    if(money <= 0) {
      return;
    }
    balance += money;
  }
  
  public void transfer(BankAccount acc, long money) {
    acc.deposit(withdrawal(money));
  }
  
  
  public void info() {
    System.out.println("계좌번호: " + accNo + ", " + "통장잔액: " + balance + "원");
    System.out.print("개설지점: ");   bank.info();
  }
}
