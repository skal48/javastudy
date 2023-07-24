package exam;

public class Cafrica {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  //카프리카 수 판별하기 
    //2 자리 (10~99) 또는 4자리(1000~9999) 수 대상
    // 앞 뒤로 숫자를 분리 -> 각 숫자를 더함 -> 더한 수의 제곱을 구함-> 이 결과가 자신과 같은 값
    // 81 8 과 1로 분리 각 숫자를 더해 9  9*9 =81 
    int total = 0;
    int add = 0;
    int front = 0;
    int rear = 0;
    
    for(int i = 1000; i < 100000 ; i++) {
      front = i / 100;
      rear = i % 100;
      add = front + rear;
      total = add * add;
      if(total == i) {
        System.out.println(i);
      }
      
    }
    
    
    
    
    
    
    
  }

}
