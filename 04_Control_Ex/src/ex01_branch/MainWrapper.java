package ex01_branch;

public class MainWrapper {
  
  public static void ex01() {
  //점수에 따른 학점(if문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    if(score >= 90) {
      grade = 'A';
      } else if(score >= 80){
        grade = 'B';
      } else if(score >= 70) {
        grade = 'c';
      } else if(score >= 60){
        grade = 'D';
      } else {
        grade = 'F';
      }
      
    System.out.println(score + "점은 " + grade + "학점입니다.");
   } 
  
    public static void ex02() {
    //점수에 따른 학점(switch문)
    int score = 78;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    switch (score / 10) {
    case 10:
      grade = 'A';
      break;
    case 9:
      grade = 'A';
      break;
    case 8:
      grade = 'B';
      break;
    case 7:
      grade = 'C';
      break;
    case 6:
      grade = 'D';
      break;
      default:
      grade = 'E';   
    }
    
    System.out.println(score + "점은 " + grade + "학점입니다.");
    
}  
    
    public static void ex03() {
    //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 80; // 점수
    int scYear = 4;  // 학년
    String pass;  // "합격", "불합격"
    
    if(scYear <= 3) {
      if(score >= 60) {
        pass = "합격";
      } else { 
        pass = "불합격";
      }
    } else {
      if(score >= 70) {
        pass = "합격";
      } else {
        pass = "불합격";
      }
    }
    
    System.out.println(pass);
    
    }
    
    public static void ex03_2() {
      //점수와 학년에 따른 학점
      //1~3학년 : 60점 이상 합격, 아니면 불합격
      //4~6학년 : 70점 이상 합격, 아니면 불합격
      int score = 80; // 점수
      int scYear = 4;  // 학년
      String pass;  // "합격", "불합격"
      int passScore; //합격의 최소 점수 
      
      if(scYear <= 3) {
        passScore = 60;
      } else {
        passScore = 70;
      }
      if(score >= passScore) {
        pass = "합격";
      } else { 
        pass = "불합격";
      }
      System.out.println(pass);
      
    }
    
  public static void ex04() {
    //메뉴에 따른 가격
    //아메리카노 : 2000
    //카페라떼 : 2500
    //밀크티 : 3000
    //기타 : 5000
    String order = "아메리카노";
    int price;
    
    switch(order) {
    case "아메리카노":
      price = 2000;
      break;
    case "카페라떼":
      price = 2500;
      break;
    case "밀크티":
      price = 3000;
      break;
    default:
      price = 5000; 
    }
    System.out.println("주문하신 " + order + "은 " + price + "입니다.");
  } 
  
  public static void ex05() {
    //월에 따른 계절
    //3 ~ 5 : 봄
    //6 ~ 8 : 여름
    //9 ~ 11: 가을
    //12 ~ 2: 겨울
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    
    switch(month / 3) {
    case 1:
      season = "봄";
     break;
    case 2:
      season = "여름";
      break;
    case 3:
      season = "가을";
      break;
    default:
      season = "겨울";       
    }
    
    System.out.println(month + "월은 " + season + "입니다.");
    
    
    if(month >= 3 && month <= 5) {
      season = "봄";
    } else if(month >= 6 && month <= 8) {
      season = "여름";
    } else if(month >= 9 && month <= 11) {
      season = "가을";
    } else {
      season = "겨울";
    }
    System.out.println(month + "월은 " + season + "입니다.");
    
    int mod = month % 12; 
    
    
    if(mod <= 2) {
      season = "겨울";
    } else if(mod <= 5) {
      season = "봄";
    } else if(mod <= 8) {
      season = "여름";
    } else {
      season = "가을";
    }
    System.out.println(month + "월은 " + season + "입니다.");
    
  } 
  public static void ex06() {
    //월에 따른 분기
    //1 ~ 3 : 1분기
    //4 ~ 6 : 2분기
    //7 ~ 9 : 3분기
    //10 ~ 12 : 4분기
    int m = 7;
    
    if(m <= 3) {
      System.out.println("1분기");
     }else if(m <= 6) {
      System.out.println("2분기");
     }else if(m <= 9) {
       System.out.println("3분기");
     }else {
       System.out.println("4분기");      
     }
    
    //if 없이 
    String b;
    b = (m <= 3 ? "1분기" : m <= 6 ? "2분기" : m <= 9 ? "3분기" : "4분기");
    System.out.println(b);
       
    System.out.println((m-1) / 3 + 1 + "분기");
    
    
  }
  
  public static void ex07() { 
    //10일 후 요일은?
    int day = 13;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일"
    
    switch((day += nDay) % 7) {
    case 1:
      weekname = "토";
      break;
    case 2:
      weekname = "일";
      break;
    case 3:
      weekname = "월";
      break;
    case 4:
      weekname = "화";
      break;
    case 5:
      weekname = "수";
      break;
    case 6:
      weekname = "목";
      break;
    default:
      weekname = "금";
    }     //0 부터 시작하면 스위치가 필요없고 배열만 필요하다. 
    
    System.out.println(day + "일은 " + weekname + "입니다.");
  }
  
  public static void ex08() {
    
      // 대소문자 변환 (구글링으로 아스키코드 검색 후 참고)
      char ch = 'A';  // 임의의 대문자 또는 소문자
    
      if(ch >= 65 && ch <= 90) {
        ch += 32;
      } else if(ch >= 97 && ch <= 122) {   //'A' == 65
        ch -= 32;
      }
      System.out.println(ch);
      
      if(ch >= 'A' && ch <= 'Z') {
        ch += 32;
      } else if(ch >= 'a' && ch <= 'z') {   // 조금 더 직관적으로   
        ch -= 32;
      }
      System.out.println(ch);
      
  }
   
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ex01();
    ex02();
    ex03();
    ex03_2();
    ex04();
    ex05();
    ex06();
    ex07();
    ex08();
    
  }

}
