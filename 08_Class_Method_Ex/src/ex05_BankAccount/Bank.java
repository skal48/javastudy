package ex05_BankAccount;

public class Bank {
 
  private String name;
  private String tel;   // 필드라서 늘 초기 값을 가지고 있다. 
  
  public Bank() {   
  }
  
  
  public Bank(String bankName, String bankPhone) {
    this.name = bankName;
    this.tel = bankPhone;
  }
  //setter
  public void setName(String name) {
       this.name = name;
  }
  
  
  public void setTel(String tel) {
    this.tel = tel;
  }
  //getter
  public String getName() {
    return name;
  }
  
  public String getTel() {
    return tel;
  }
  
  public void info() {
    System.out.println( name +"(" + tel + ")");
  }
  
}
