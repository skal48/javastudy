package ex05_BankAccount;

public class BankAccount {

  private String bankAcc;
  private long balance;
  private Bank bank;
  
  public BankAccount(Bank bank, String bankAcc, long balance) {
    this.bankAcc = bankAcc;
    this.balance = balance;
    this.bank = bank;
  }
  
  public void info() {
    System.out.println("계좌번호: " + bankAcc + ", " + "통장잔액: " + balance + "원");
    bank.info();
  }
}
