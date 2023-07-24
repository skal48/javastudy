package ex02_Computer;

public class Notebook extends Computer {
  
  private int battery;
  
  //new Notebook("gram", 70)에 의해서 호출되는 생성자
  public Notebook(String model, int battery) {    
    super(model);  //반드시 super의 호출이 먼저 와야한다. 
    this.battery = battery;
  }
  
  public void setBattery(int battery) {
    this.battery = battery;
  }
  public int getBattery() {
    return battery;
  }

}
