package test;
import java.util.Scanner;
public class Test_test {
  

      public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);
       
       int a, b, c, d;
       
       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt();
       
       if(a == b && b == c) { 
         d = 10000 + a * 1000;
         System.out.println( d );
       }else if(a == b) {
         d = 1000 + a * 100; 
         System.out.println( d );
       }else if(b == c) {
         d = 1000 + b * 100;
         System.out.println( d );
       }else if(a == c){
         d = 1000 + a * 100;
         System.out.println( d );
       }else {System.out.println(a>b ? a > c ? a*100 : c*100 :b>a ? b>c ? b*100: c*100 : a *100 );
         
       }
       
       
       
        
        
      }
  }

