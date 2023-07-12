package ex02_convert_type;

public class Mainwrapper {
  
  public static void main(String[] args) {
    
    /*
     * 자동 변환(promotion)
     * 1. 작은크기 -> 큰 크기
     * 2. 정수 -> 실수  (5->5.0)
     */
    
    byte num1 = 127; //byte는 128 ~127 범위가 가능
    int num2 = num1; //1 byte 크기를 가진 num1을 4바이트 크기로 자동 변환
    System.out.println(num2);
    
    double addResult = 1.5 + 5; // 5를 5.0으로 자동 변환
    System.out.println(addResult);
    
    /*
     * 강제 변환 (casting)
     * 1. 큰 크기 -> 작은크기
     * 2. 실수 -> 정수
     * 
     */
    int bigNum = 256;
    byte smallNum = (byte)bigNum; // 4바이트 bigNum을 강제로 1바이트로 변화 
    System.out.println(smallNum); //원본이 훼손될 수 있다. 
    
    double pct = 0.5;
    int iPct = (int)pct;
    System.out.println(iPct);
    
    /*
     * 구문 분석(parsing)
     * 1. 문자열 -> 정수(int, long)
     * 2. 문자열 -> 실수 (double)
     */
    
    String strScore = "100";
    int score = Integer.parseInt(strScore); //자바에서 모든 함수는 메소드이다. 
    
    String strMoney = "10000000000";
    long money = Long.parseLong(strMoney);
    
    String strComm = "0.5";
    double comm = Double.parseDouble(strComm);
    
    System.out.println(score);
    System.out.println(money);
    System.out.println(comm);
    
    /* web 개발에 필요한 이유 : 검색란에 100을 누르고 검색을 하면 String query = "100"; 라고 저장된다.  
     * 숫자로 바꿔주기 위해서 구문 분석이 필요할 수 있다. 전달은 다 'string' 
     */
    
    
  }

}
