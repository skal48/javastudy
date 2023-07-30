package ex07_Car;

public class Car {

  private Driver driver;
  private int speed;
  private int fuel;
  
  
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  
  
  public Driver getDriver() {
    return driver;
  }
  public int getSpeed() {
    return speed;
  }
  public int getFuel() {
    return fuel;
  }
 
  
  public void engineStart() {
    if(this.fuel == 0) {
      System.out.println("시동이 걸리지 않았습니다.");
    } else {
      System.out.println("시동이 걸렸습니다.");    
    }
  }
  
  public void drive() {
    if(fuel == 0 || driver == null) {
      System.out.println("자동차가 움직이지 않습니다.");  
    }else {
      System.out.println("자동차가 움직였습니다.");
    }
  }
  
  public void accel(int speed) {
    this.speed += speed;
    
    if(this.speed > 100) {      
      System.out.println("기존 속도에 " + speed + "이 추가" + "(최대 속도는 100), 현재속도는 100입니다.");
      fuel -= (speed - (this.speed - 100))/10;      
      
      System.out.println("연료량: " + fuel);  
      
    }else {      
      System.out.println("기존 속도에 " + speed +"이 추가, 현재속도는 " + this.speed + "입니다.");
      fuel -= speed/10;
      System.out.println("연료량: " + fuel);      
    }
   
    
  }
  
  
  public void brake(int speed) {
    this.speed -= speed;
    if(this.speed < 0) {
      System.out.println("기존 속도가 " + speed + "만큼 감속(최저 속도는 0), 현재 속도는 0 입니다.");
    }else {
      System.out.println("기존 속도가 " + speed + "만큼 감속, 현재속도는 " + this.speed + "입니다.");
    }
    
  }
  
  
  
}
