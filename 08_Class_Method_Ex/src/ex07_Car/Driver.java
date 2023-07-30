package ex07_Car;

public class Driver {

    private String name;
    private int career;
    private boolean bestDriver;
    
    public void setName(String name) {
      this.name = name;
    }
    public void setCareer(int career) {         
      this.career = career;
      setBestDriver(career >= 10);
    }
    private void setBestDriver(boolean bestDriver) {
      this.bestDriver = bestDriver;
    }
    
    public String getName() {
      return name;
    }
    public int getCareer() {
      return career;
    }
    public boolean isBestDriver() {  //boolean 은 get으로 시작안한다. is 이름명  
      return bestDriver;
    }

 
}
