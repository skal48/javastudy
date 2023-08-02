package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  private String name;
  private List<Car> cars = new ArrayList<Car>();
  private final int MAX = 5;
  private Scanner sc = new Scanner(System.in);
  
  public ParkingLot(String name) {
    this.name = name;
  }
  
  public void addCar() {
    System.out.println("현재 등록된 차량 : " + cars.size() + "대");
    if(cars.size() == MAX) {
      System.out.println("만차입니다. 더 이상 차량이 등록이 불가능 합니다.");
      return;
    }
    
    System.out.print("차량번호 입력 >>> " );
    String carNo = sc.next();
    System.out.print("모델 입력 >>> ");
    String model = sc.next();
    cars.add(new Car(carNo, model));
    System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
      
  }
  
  public void deleteCar() {
    if(cars.size() == 0) {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }
    System.out.print("삭제할 차량번호 입력 >>> ");
    String carNo = sc.next();
    for(Car car : cars) {
      if(carNo.equals(car.getCarNo())) {
         cars.remove(car);
         System.out.println("차량번호 " + carNo + " 차량이 삭제되었습니다.");
         return;
      }
      
      }
    System.out.println("차량번호 " + carNo +"차량이 존재하지 않습니다.");
    }
    
    
    
    
  
  
  public void searchCar() {
    if(cars.size() == 0) {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }    
    System.out.print("조회할 차량번호 입력 >>> ");
    String carNo = sc.next();
    for(Car car : cars) {
    if(carNo.equals(car.getCarNo())) {
      System.out.println("조회 결과: " +  car.toString());
      return;
    }        
    }
    
    System.out.println("차량번호 " + carNo + " 차량이 존재하지 않습니다.");
  }
  
  public void printAllCars() {
    if(cars.size() == 0) {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }  
    System.out.println(name + " 차량 목록");
    for(int i = 0, lenght = cars.size(); i < lenght; i++) {
      if(cars.get(i) == null) {
       System.out.println((i + 1) + "번째 차량: 없음" );
       return;
      }
      System.out.println((i + 1) + "번째 차량: " + cars.get(i).toString());
    }
    
  }
  
  public void manage() {
    while(true) {
      System.out.print("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>> ");
      String choice = sc.next();
      switch(choice) {
      case "1": addCar(); break;
      case "2": deleteCar(); break;
      case "3": searchCar(); break;
      case "4": printAllCars(); break;
      case "0": System.out.println("주차관리 프로그램을 종료합니다."); return;
      default: System.out.println("존재하지 않는 메뉴입니다.");
      }
    }
  }
  
}