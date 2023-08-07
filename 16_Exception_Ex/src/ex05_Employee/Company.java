package ex05_Employee;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Company {

  private List<Employee> employees = new ArrayList<Employee>();
  private Scanner sc = new Scanner(System.in);
  
  public Company() {
   
  }
  
  public void addEmployee() throws InputMismatchException{
    System.out.println("===== 고용 =====");
    System.out.print("고용 형태 선택(1.정규 2.프리랜서) >>>");
    int twoWay = sc.nextInt();
    if(twoWay == 1) {
      System.out.print("사원번호 입력 >>>");
      String empNo = sc.next();
      System.out.print("사원명 입력 >>>");
      String empName = sc.next();
      Regular reg = new Regular(empNo, empName);
      employees.add(reg); 
      System.out.print("기본급 입력 >>> ");
      int salary = sc.nextInt();
      reg.setSalary(salary);
      System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 " + (employees.size()+1) + "명입니다.");
    }else if(twoWay == 2) {
      System.out.print("사원번호 입력 >>>");
      String empNo = sc.next();
      System.out.print("사원명 입력 >>>");
      String empName = sc.next();
      Freelance fre = new Freelance(empNo, empName);
      employees.add(fre); 
      System.out.print("시간당 임금 입력 >>> ");
      int hw = sc.nextInt();
      fre.setHourlyWage(hw);
      System.out.print("근무한 시간 입력 >>>");
      int time = sc.nextInt();
      fre.setWorkingHours(time);
      System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 " + (employees.size()+1) + "명입니다.");
    } else { return;}
      
  }
  
  public void dropEmployee() {
    System.out.println("===== 해고 =====");
    
  }
  
  public void findEmployee() {
    System.out.println("===== 조회 =====");
    
  }
  
  public void printAllEmployee() {
    System.out.println("===== 전체조회 =====");
    
  }
  
  public void manage() {
    System.out.println("===== 사원관리프로그램 시작 =====");
    while(true) {
      try {
        System.out.print("\n1.고용 2.해고 3.조회 4.전체조회 0.종료 >>> ");
        String choice = sc.next();
        switch(choice) {
        case "1": addEmployee(); break;
        case "2": dropEmployee(); break;
        case "3": findEmployee(); break;
        case "4": printAllEmployee(); break;
        case "0": System.out.println("===== 사원관리프로그램 종료 ====="); return;
        default: throw new RuntimeException("잘못된 요청입니다. 다시 시도하세요.");
        }
      } catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}