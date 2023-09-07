package test;

import java.util.Scanner;

public class Ex_11022 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int number;
    number = sc.nextInt();
    String[] a, b;
    a = new String[number];
    b = new String[number];
    
    for(int i = 0; i < number; i++) {
      
      a[i] = sc.next();
      b[i] = sc.next();      
    }
    
    for(int i = 0; i < number; i++) {
    System.out.println("Case #" + (i+1) + ": " + a[i] + " + " + b[i] +" = " + (Integer.parseInt(a[i]) + Integer.parseInt(b[i])) );
    }
    
    
  }

}
