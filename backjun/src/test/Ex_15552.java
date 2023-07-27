package test;
import java.io.*;
import java.util.*;
public class Ex_15552 {

  public static void main(String[] args) throws IOException{
    // TODO Auto-generated method stub
    
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   int n = Integer.parseInt(br.readLine());
   
   StringTokenizer ST;  //

   for (int i = 0; i < n; i++) {
     ST = new StringTokenizer(br.readLine()," ");
     bw.write((Integer.parseInt(ST.nextToken()) + Integer.parseInt(ST.nextToken())));
     bw.newLine();

  }
   bw.flush();

  }
  
}