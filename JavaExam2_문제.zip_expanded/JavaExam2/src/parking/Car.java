package parking;

import java.util.Objects;

public class Car {

  private String carNo;
  private String model;
  
  public Car(String carNo, String model) {
    super();
    this.carNo = carNo;
    this.model = model;
  }
  
  public String getCarNo() {
    return carNo;
  }
  public void setCarNo(String carNo) {
    this.carNo = carNo;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "Car [carNo=" + carNo + ", model=" + model + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(carNo, model);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Car other = (Car) obj;
    return Objects.equals(carNo, other.carNo) && Objects.equals(model, other.model);
  }
  
  
  
}
