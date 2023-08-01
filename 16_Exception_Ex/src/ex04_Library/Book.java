package ex04_Library;

import java.util.Objects;

public class Book {

  private int price;
  private String title;
  
  // new Book()
  public Book() {
    // TODO Auto-generated constructor stub
  }
  
  
  // new Book("좋은생각")
  public Book(String title) {
    this(title, 0); //파라미터가 2개인 다른 생성자를 호출한다. public Book(String title,int price){}을 의미한다.
  }
  
  // new Book("어린왕자", 10000)
  public Book(String title, int price) {
    super();
    this.price = price;
    this.title = title;
  }
  
  
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  // 동일한 내용이 들어오게 되면 같은 것이라고 인식시켜주기 위해서 
  
  @Override
  public String toString() {
    return "제목 : " + title + ", 가격 : " + price ;
  }


  @Override
  public int hashCode() {
    return Objects.hash(price, title);
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return price == other.price && Objects.equals(title, other.title);
  }
  
  
  
}
