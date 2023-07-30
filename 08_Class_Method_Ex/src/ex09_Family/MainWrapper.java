package ex09_Family;

public class MainWrapper {

  public static void ex01() {
    
    //가족이 3명인 경우
    Family f = new Family(3);
    
    //가족의 이름 3개 나이 3개 
    String[] name = {"나", "엄마", "아빠"};
    int[] age = {20, 40, 43};
    
    //디폴트 생성자와 + setter
    for(int i = 0; i < f.getFamily().length;i++) {
      
      f.getFamily()[i] = new Person(); //디폴트 생성자를 이용해서 배열 요소를 저장해 둔다. 
     
      f.getFamily()[i].setName( name[i]); //setter를 이용해서 이름을 저장한다.  
      f.getFamily()[i].setAge( age[i]); //setter 을 이용해서 나이를 저장한다. 
    }
    
    //확인
    for(int i = 0; i < f.getFamily().length;i++) {
      System.out.println((i+1) + "번째 가족 이름 : " + f.getFamily()[i].getName());
      System.out.println((i+1) + "번째 가족 나이 : " + f.getFamily()[i].getAge());
           
    }
    
  }
  
  public static void ex02() {
    
    //person이 3명인 Family 객체 생성
  
    Family f = new Family(3);
    
    //가족의 이름 3개 나이 3개 
    String[] name = {"나", "엄마", "아빠"};
    int[] age = {20, 40, 43};
    
    //파라미터가 2개인 생성자
    for(int i = 0; i < f.getFamily().length; i++) {
      f.getFamily()[i] = new Person(name[i], age[i]);
      
    }
    
  //확인
    for(int i = 0; i < f.getFamily().length;i++) {
      System.out.println((i+1) + "번째 가족 이름 : " + f.getFamily()[i].getName());
      System.out.println((i+1) + "번째 가족 나이 : " + f.getFamily()[i].getAge());
    }
    
  }
  
  public static void ex03() {
    
    //ex01 리팩토링  맡은 업무가 개발이면 리팩토링 안 하는 것이 좋음 
    
    Family f = new Family(3);
     
    String[] name = {"나", "엄마", "아빠"};
    int[] age = {20, 40, 43};
    
    Person[] family = f.getFamily();    
    

    for(int i = 0; i < family.length;i++) {
      
     family[i] = new Person(); //디폴트 생성자를 이용해서 배열 요소를 저장해 둔다. 
     
      family[i].setName( name[i]); //setter를 이용해서 이름을 저장한다.  
      family[i].setAge( age[i]); //setter 을 이용해서 나이를 저장한다. 
    }
    
    //확인
    for(int i = 0; i < family.length;i++) {
      System.out.println((i+1) + "번째 가족 이름 : " + family[i].getName());
      System.out.println((i+1) + "번째 가족 나이 : " + family[i].getAge());
           
    }
    for(Person p : family) {
      if(p != null) {
      System.out.println("가족 이름: " +p.getName());
      System.out.println("가족 나이: " +p.getAge());
      }
    }
        
  }
  
  public static void ex04() {
    //ex02() 리팩토링
  //person이 3명인 Family 객체 생성
    
    Family f = new Family(3);
    
    //가족의 이름 3개 나이 3개 
    String[] name = {"나", "엄마", "아빠"};
    int[] age = {20, 40, 43};
    
    Person[] family = f.getFamily();
    
    
    //파라미터가 2개인 생성자
    for(int i = 0; i < family.length; i++) {
      family[i] = new Person(name[i], age[i]);
      
    }
    
  //확인
    for(int i = 0; i < family.length;i++) {
      System.out.println((i+1) + "번째 가족 이름 : " + family[i].getName());
      System.out.println((i+1) + "번째 가족 나이 : " + family[i].getAge());
    }
    for(Person p : family) {  //향상 for문 사용시 주의점  null 값이 있으면 동작을 안한다. 
      if( p != null) {
      System.out.println("가족 이름: " +p.getName());
      System.out.println("가족 나이: " +p.getAge());
      }
    }
  }
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ex03();
    
    
  }

}
