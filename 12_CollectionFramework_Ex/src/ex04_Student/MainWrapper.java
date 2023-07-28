package ex04_Student;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {
    
    //교실의 학생 정보를 저장하는 HashMap을 만들기
    //key : 학번(10101) 
    // Value : Student 객체 
    Map<Integer, Student> school = new HashMap<Integer, Student>();
    
    school.put(10101, new Student("홍길동",new Exam(100,50,60)));
    school.put(10102, new Student("김길동",new Exam(90,60,20)));
    school.put(20613, new Student("박길동",new Exam(80,70,30)));
    school.put(10712, new Student("최길동",new Exam(70,80,90)));
    school.put(20726, new Student("이길동",new Exam(60,90,100)));

    
     // Student student = new Student();
     // student.setName("나길동");
     // student.setExam(new Exam(90, 90, 90));
     // school.put(11220, student);
     
    
    
    Integer[] stuNo = {10101, 10102};
    
    for(int i = 0; i < stuNo.length; i++) {
      Student student = school.get(stuNo[i]);
      System.out.println("이름: " + student.getName());
      System.out.println("시험: " + student.getExam());
    }
    
  }

}
