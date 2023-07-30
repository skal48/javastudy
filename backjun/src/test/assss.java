package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class assss {

  
  
      public static void main(String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
          
          int a = Integer.parseInt(br.readLine());
          
          StringTokenizer ST;
          
          for(int i = 1; i <= a; i++){
              ST =new StringTokenizer(br.readLine()," ");
              bw.write("Case #"+i+": " + (Integer.parseInt(ST.nextToken()) + Integer.parseInt(ST.nextToken())) + "\n");
              
          }
          bw.flush();
         
          
          
          
      }
      
  }
  
  

