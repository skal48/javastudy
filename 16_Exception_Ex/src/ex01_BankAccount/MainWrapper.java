package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {

    try {
      BankAccount acc1 = new BankAccount(10000, "1234");
      BankAccount acc2 = new BankAccount(10000, "5678");
      acc1.deposit(10000);
      acc2.withdrawal(5000);
      
      acc1.transfer(acc2, 1);
      acc1.inquiry();
      acc2.inquiry();
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
      
  }

}
