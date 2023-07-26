package ex09_Eatable;

public class Food {

  private String name;
  
  public Food(String name) { //디폴트 생성자가 아니라서 꼭 불러줘야함
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Food [name=" + name + "]";
  }
  
  
  
  
}
