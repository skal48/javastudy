package ex01_try_catch;

import java.net.URL;
import java.util.Scanner;

public class MainWrapper {

  public static void ex01() {
    
    try {
      
      String name = "tom";
      Integer.parseInt(name); //발생한 NumberFormatException을 catch 블록으로 java가 던진다.
                             //Exception은 모든 예외를 처리 할 수 있다. 무슨종류의 exception이 발생하는지 모르면 그냥 exception 적으면 된다. 
    } catch(NumberFormatException e) { //RuntimeException, Exception 가능
      System.out.println("예외발생");
      
    }
  }
  
  public static void ex02() {
    
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("덧셈식을 입력하세요(예 : 1 + 2)");
      String expr = sc.next();                // number = {"1", "2"}
      String[] numbers = expr.split("[+]");  //대괄호를 하여야지 안전하게 처리할 수 있다. [] 안하면 정규식으로 인식해서 다른 결과가 나올 수 있음
      int number1 = Integer.parseInt(numbers[0]);
      int number2 = Integer.parseInt(numbers[1]);
      System.out.println(number1 + number2);
      sc.close();
    }catch(NumberFormatException e){   //catch를 여러개 쓰는 이유는 사용자에게 예외의 이유를 알려주기 위해서이다. 
      System.out.println("정수 연산만 가능합니다.");
    }catch (ArrayIndexOutOfBoundsException e) { //NumberFormatException 과 ArrayIndexOutOfBoundsException으로 처리 못한 예외를 담당한다. 
      System.out.println("덧셈식에 +를 포함해서 입력하세요");
    }catch(Exception e) {
      System.out.println("알 수 없는 예외가 발생했습니다.");
    }
    
    
  }
  
  public static void ex03() {
    //반드시 Try - catch가 필요한 예외를 checked Exception이라고 한다. 
    try {
    URL url = new URL("http://www.naver.com");
    }catch(Exception e) {
      System.out.println("예외 발생");
    }
  }
  
  
  
  public static void main(String[] args) {
    //ex01();
    //ex02();
    ex03();
    
    
    
  }

}
