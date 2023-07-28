package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {

  /* 10진수 */ private int number; // 10진수
  /* 2진수*/   private List<Integer> binary;
  
  //new BinaryNumber(32)
  public BinaryNumber(int number) {
    this.number = number;
    //binary.get(0) : 0
    //binary.get(1) : 0
    //binary.get(2) : 0
    //binary.get(3) : 0
    //binary.get(4) : 0
    //binary.get(5) : 1
    binary = new ArrayList<Integer>();
    
    for(int i = 0; i < this.number ;i++) {
    
      binary.add(number % 2);
      number = number / 2;
      if(number == 0) {
        return;
        }
    
    }
    
    /*
     * if(number == 0){
     * binary,add(0);}
    while(number >= 0){
     binary.add(number % 2);
     number /= 2;
    }
    */
    
  }
  // BinaryNumber bn = BinaryNumber(32);
  //System.out.println();  //100000
  
  public void info() {
    System.out.println(binary.size());
  }
  
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    for(int i = 0, lenght = binary.size() ; i < lenght ; i++) {
      
      System.out.println( "binary.get(" + i + ") : " + binary.get(binary.size() - i - 1 ));
    }
    return "";
  }
  
  /*
   * public String toString(){
   * String result = "";
   * for(int i = bianry.size() - 1; i >= 0; i--){
   *   result += binary.get(i);
   */
  
}
