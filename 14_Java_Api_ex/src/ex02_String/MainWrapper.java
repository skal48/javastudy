package ex02_String;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class MainWrapper {

  // 문제1. 다음 주소를 아래와 같이 분석하여 분리하시오.
  // String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
  // String requestURI = "https://comic.naver.com/webtoon/detail";  // 물음표(?) 이전 문자열만 추출
  // String param = "titleId=758037&no=112&weekday=mon";            // 물음표(?) 이후 문자열만 추출
  public static void ex01() {
    String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
    String requestURI = "";
    String param = "";
    
    requestURI = url.substring(0,url.indexOf("?"));
    param = url.substring(url.indexOf("?") + 1);
    
    System.out.println(requestURI);
    System.out.println(param);
  }

  // 문제2. 다음 파일명을 분석하여 파일명과 확장자를 분리하시오.
  // String fullName = "apple.jpg";
  // String fileName = "apple";
  // String extName = "jpg";
  public static void ex02() {
    String fullName = "apple.jpg";
    String fileName = "";
    String extName = "";
    
    fileName = fullName.substring(0, fullName.indexOf("."));
    extName = fullName.substring(fullName.indexOf(".") + 1);
    
    System.out.println(fileName);
    System.out.println(extName);
  }

  // 문제3. 다음 기준에 따라서 파일명을 변환하시오.
  // 사용자로부터 공백이 포함되어 있지 않은 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
  // 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
  // 실행예시)
  // 변환 전 파일명 >>> happy.jpg
  // 변환 후 파일명 = happy_1658792128410.jpg
  public static void ex03() {
    String beforeName = "";  // 변환 전 파일명
    String afterName = "";   // 변환 후 파일명
    
    Scanner sc = new Scanner(System.in);
    System.out.println("변환전 파일명 >>> ");

    beforeName = sc.next();
    
    afterName = beforeName.substring(0,beforeName.indexOf(".")) + "_" + System.currentTimeMillis() + beforeName.substring(beforeName.indexOf("."));
        //replace(".", "_" + System.currentTimeMillis());
    
    System.out.println(afterName);
    
    
    
    
    
  }
  
  // 문제4. 주어진 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
  // 나이 : 현재년도 - 태어난년도 (생일이 지났는지 여부는 따지지 않습니다.)
  // 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
  // 실행예시)
  // 9살 남자입니다.
  public static void ex04() {
    String personalId = "141212-3345678";
    char no = personalId.charAt(7);
    
    if(no == '3' || no == '1') {
      System.out.println("남자");
    }else if( no == '2' || no == '4') {
      System.out.println("여자");
    }
    
  }
  
  // 문제5. 사용자로부터 입력 받은 문자열을 거꾸로 읽어도 원래 문자열과 동일한지 여부를 파악하는 프로그램을 구현하시오.
  // 실행예시1)
  //   문자열 입력 >>> 메롱
  //   메롱 : 거꾸로 읽으면 메롱과 다릅니다.
  // 실행예시2)
  //   문자열 입력 >>> 역삼역
  //   역삼역 : 거꾸로 읽어도 역삼역입니다.
  public static void ex05() {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 입력 >>> ");
    String name = sc.next();
    int lenght = name.length();
    boolean[] tr = new boolean[lenght];
    for(int i = 0; i < lenght; i++) {     
      tr[i] = name.charAt(i) == name.charAt(name.length() - 1 - i);
    }
    for(int i = 0; i < lenght; i++) {
        if (tr[i] = false) {
          System.out.println(name + " : 거꾸로 읽으면 " + name + "과 다릅니다.");          
          
      } else{
        System.out.println(name + " : 거꾸로 읽어도 " + name + "입니다.");
        
      }
    }
    
    
    
    
    
  }
  
  public static void main(String[] args) {
    //ex01();
    //ex02();
    ex03();
    //ex04();
    //ex05();
  }

}
