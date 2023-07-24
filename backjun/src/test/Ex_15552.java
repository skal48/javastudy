package test;
import java.io.*;
public class Ex_15552 {

  public static void main(String[] args) throws IOException{
    // TODO Auto-generated method stub
    
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   String a;
   
   a = br.readLine();
   
   int[] c = new int[Integer.parseInt(a)];
   
   for(int i = 0; i < Integer.parseInt(a); i++ ) {
     String b;
     b = br.readLine();
     int[] arr = new int[3];
     arr[0] = Integer.parseInt(b);
     
     
     c[i] = arr[0] + arr[2]; 
     
   }
    for (int i = 0; i < Integer.parseInt(a); i++) {
      System.out.println(c[i]);
    }

  }

}
