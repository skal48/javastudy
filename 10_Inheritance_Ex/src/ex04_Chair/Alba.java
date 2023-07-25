package ex04_Chair;

public class Alba extends Student{

  private String work;
  
  public Alba() {
    
  }
  public Alba(String name, String school, String work) {
    super(name, school); // public Student(String name String school){} 생성자가 호출 됨
    this.work = work;
    
    
  }
  public String getWork() {
    return work;
  }
  public void setWork(String work) {
    this.work = work;
  }
  @Override
  public void info() {
    super.info(); //super class의  info -> Student 클래스의 인포 
    System.out.println("직장: " + work);
  }
  
  
  
}
