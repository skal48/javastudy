package test;
import java.util.Scanner;
public class ex_25304 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a, b, c, d;
    int total = 0;
    
    a = sc.nextInt();
    b = sc.nextInt();
    
    for(int i = 0; i < b; i ++) {
      c = sc.nextInt();
      d = sc.nextInt();
      total += c * d;      
    }
    
    if(total == a) {
      System.out.println("Yes");
    }else {
    System.out.println("No");
    }

    
  }

}
