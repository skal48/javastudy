package ex04_Library;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Library {

  private List<Book> books;  //선언만
  private Scanner sc;        //선언만
   
  //new Library()
  public Library() {
    sc = new Scanner(System.in);   //생성
    books = new ArrayList<Book>(); //생성       
   }
 
  /**
   * 등록<br>
   * 책의 제목과 가격을 입력 받아서 List<Book> books에 저장하는 메소드 
   * @throws InputMismatchException 책의 가격을 정수로 입력하지 않아
   */
  private void addBook() throws InputMismatchException {
    System.out.println("=== 등록 ===");
    System.out.println("책 제목 입력");
    String title = sc.next();
    System.out.println("책 가격 입력");
    int price = sc.nextInt();
    books.add(new Book(title,price));
    System.out.println(title + "책이 등록되었습니다.");
    
    
  }
  /**
   * 삭제<br>
   */
  private void deleteBook() throws RuntimeException{
    System.out.println("=== 삭제 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    }
    System.out.println("삭제할 책의 제목 입력 >>> ");
    String title = sc.next();
    if(title.isEmpty()) { //isBlank - 공백 및 화이트 스페이스 검사
      throw new RuntimeException("삭제할 책의 제목이 입력되지 않았습니다.");
    }
    //객체 기반 삭제(동일한 객체를 찾아서 삭제)
    //동일한 객체인지 비교하기 위해서는 book클래스에 equals 메소드가 오버라이드 되어 있어야한다. 
    for(Book book : books) {
      if(title.equals(book.getTitle())) {
        books.remove(book);
        System.out.println(book + "책이 삭제되었습니다.");
        return;
      }
    }
    System.out.println(title + "제목을 가진 책이 없습니다.");
  
  }
  
  /**
   * 수정<br>
   * 수정할 책의 제목을 입력 받아서 해당 책의 가격을 수정하는 메소드
   * @throws RuntimeException 책이 0권이거나 수정할 책의 제목이 입력되지 않았을 때 발생하는 예외
   * @throws InputMismatchException 책의 가격을 정수로 입력하지 않았을 때 발생하는 예외
   */
  private void modifyBook() throws RuntimeException, InputMismatchException {
    System.out.println("=== 수정 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");      
    }
    System.out.println("수정할 책의 제목 입력 >>> ");
    String title = sc.next();
    if(title.isEmpty()) {
      throw new RuntimeException("조회할 책의 제목이 입력되지 않았습니다.");      
    }
    for(int i = 0, size = books.size(); i < size; i++) {
      if(title.equals(books.get(i).getTitle())) {        
        System.out.println(books.get(i));
        System.out.println("가격을 수정해 주세요.");
        int price = sc.nextInt();
        books.get(i).setPrice(price);
        System.out.println(books.get(i));
        return;
      }
      
    }
    System.out.println(title + "제목을 가진 책이 없습니다.");
  }
  
  
  /**
   * 조회<br>
   * 조회할 책의 제목을 입력 받아서 해당 책의 정보를 출력하는 메소드
   */
  private void queryBook() throws RuntimeException{
    System.out.println("=== 조회 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");      
    }
    System.out.println("조회할 책의 제목 입력 >>> ");
    String title = sc.next();
    if(title.isEmpty()) {
      throw new RuntimeException("조회할 책의 제목이 입력되지 않았습니다.");      
    }
    for(int i = 0, size = books.size(); i < size; i++) {
      if(title.equals(books.get(i).getTitle())) { 
        
        System.out.println(books.get(i));
        return;
      }
    }
    System.out.println(title + "제목을 가진 책이 없습니다.");
   
  }
  
  /**
   *전체조회<br>  
   */
  private void queryAllBook() throws RuntimeException{
    System.out.println("=== 전체조회 ===");
    int size = books.size();
    System.out.println("전체 보유 도서 수 : " + books.size() + "권");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    }
    for(int i = 0; i < size; i++ ) {
      System.out.println((i + 1) + "번쨰 도서: " + books.get(i));
    }
  }
  
  /**
   * 운영<br>
   * @throws TimeoutException 
   */
  public void manage() {
    
    //무한루프로 사용자가 종료 명령을 내릴때까지 프로그램은 종료되지 않는다. 
    while(true) {
        
      try {
      
        System.out.println("1.등록 2.삭제 3.수정 4.조회 5.전체조회 0.종료");
        String choice = sc.next();
    
        switch(choice) {
        case "1": addBook(); break;
        case "2": deleteBook(); break;
        case "3": modifyBook(); break;
        case "4": queryBook(); break;
        case "5": queryAllBook(); break;
        case "0": System.out.println("도서관리 프로그램을 종료합니다."); return; 
        default: System.out.println("잘못된 입력입니다. 다시 시도하세요.");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      
    } //while(true)
    
  } //manage()
   
}
