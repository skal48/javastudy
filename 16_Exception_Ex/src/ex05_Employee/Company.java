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
    System.out.print("고용 형태 선택(1.정규 2.프리랜서) >>> ");
    int twoWay = sc.nextInt();
    System.out.print("사원번호 입력 >>> ");
    String empNo = sc.next();
    System.out.print("사원명 입력 >>> ");
    String empName = sc.next();
    if(twoWay == 1) {
      
      employees.add(employees.size(), new Regular(empNo, empName));       
      System.out.print("기본급 입력 >>> ");
      int salary = sc.nextInt();
      ((Regular)employees.get(employees.size() - 1)).setSalary(salary);
      
      System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 " + employees.size() + "명입니다.");
    }else if(twoWay == 2) {      
      employees.add(employees.size(), new Freelance(empNo, empName)); 
      System.out.print("시간당 임금 입력 >>> ");
      int hw = sc.nextInt();
      ((Freelance)employees.get(employees.size() - 1)).setHourlyWage(hw);
      System.out.print("근무한 시간 입력 >>> ");
      int time = sc.nextInt();
      ((Freelance)employees.get(employees.size() - 1)).setWorkingHours(time);
      System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 " + employees.size() + "명입니다.");
    } else { return ;}
      
  }
  
  public void dropEmployee() {
    System.out.println("===== 해고 =====");
    System.out.print("삭제할 사원번호 입력 >>> ");
    String empNo = sc.next();
    for(int i = 0, lenght = employees.size(); i < lenght-1; i++) { 
      if((employees.get(i).getEmpNo()).equals(empNo)) {
        System.out.println("다음 사원이 삭제되었습니다.");
        employees.get(i).info();              
        employees.remove(i);
        
      }
    }
  }
  
  public void findEmployee() {
    System.out.println("===== 조회 =====");
    
    System.out.print("조회할 사원번호 입력 >>> ");
    String empNo = sc.next();
    System.out.println("사원 조회 성공!");
    for(Employee emps: employees) { 
      if(emps.getEmpNo().equals(empNo)) {
        emps.info();
        
      }
    }
  }
  
  public void printAllEmployee() {
    System.out.println("===== 전체조회 =====");
    System.out.println("전체 사원(" + employees.size() + "명)");
    System.out.println("------------------");
    for(Employee emps : employees ) {
      emps.info();
      System.out.println("------------------");      
    }
    int total1 = 0;
    int total2 = 0;
    
    System.out.println("[사원 전체 급여:" + (total1 + total2) + "원]" );
    
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