package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    //객체 선언 & 생성
    BankAccount my = new BankAccount();
    
    //객체에 계좌번호 등록
    my.setAccNo("554602-04-030597");
    
    //입금하기
    my.deposit(50000);
    
    // 객체 출금하기
    
    my.withdrawal(1);
    
    
    //객체 조회하기 
    my.inquiry();
    
    //new  객체 선언
    BankAccount you = new BankAccount();
    
    //계좌번호 등록
    you.setAccNo("1111-2222-33333");
    
    // 내가 너에게 3만원 이체하기 

    my.transfer(you, 30000);
    my.transfer(you
        , 30000);

    
    // my 객체 조회하기 
    my.inquiry(); //  통장잔액 : 19999
    you.inquiry(); // 통장잔액 : 30000    
  }

}



