package test;
import java.util.Scanner;
public class ex_8393 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int a;
    int total = 0;
    a = sc.nextInt();
    
    for(int i = 1; i <= a; i++) {
      total += i;
      
    }
    System.out.println(total);
    
    
  }

}
