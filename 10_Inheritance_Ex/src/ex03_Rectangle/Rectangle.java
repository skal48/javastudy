package ex03_Rectangle;

public class Rectangle {

  private int width; //너비


  private int height; //높이

  // new Rectangle()
  
  public Rectangle() {
    
  }
  
  
  // new Rectangle(10, 20)
  
  public Rectangle(int width, int hieght) {
    this.width = width;
    this.height = hieght;
  }
  public int getWidth() {
    return width;
  }
  
  
  public void setWidth(int width) {
    this.width = width;
  }
  
  
  public int getHeight() {
    return height;
  }
  
  
  public void setHeight(int height) {
    this.height = height;
  }

  //넓이를 반환하는 메소드 
  public int getArea() {
    return width * height;
  }
  //넓이 높이 너비 를 출력하는 메소드 
  public void info() {
    System.out.println("너비: " + width);
    System.out.println("높이: " + height);
    System.out.println("넓이: " +getArea());
  }
  
}
