package ex02_insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
    
    //User 정보 입력
    Scanner sc = new Scanner(System.in);
    System.out.println("USER_ID >>> ");
    String user_id = sc.next();
    sc.nextLine();
    System.out.println("USER_NAME >>> ");
    String user_name = sc.nextLine();
    sc.close();
    //UserDto 생성
    UserDto user = new UserDto();
    user.setUser_id(user_id);
    user.setUser_name(user_name);
    
    // Connection 객체 선언 (DB 접속)
    Connection con = null;
   
    // preparedStatement 객체 선언(쿼리문 실행)
    PreparedStatement ps = null;
    
    try {
      // Connection 객체 생성(DB_Connection 클래스의 getConnection 메소드로부터 받아오기 )
      con = DB_Connect.getConnection();
      
      // 쿼리문
      String sql = "";
      sql += "INSERT INTO USER_T (USER_NO,USER_ID,USER_NAME,JOINED_AT) ";
      sql += "VALUES(USER_SEQ.NEXTVAL, ?, ?, SYSDATE)";  //변수 들어가는 자리는 ? 들어간다.
      
      //PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      //쿼리문에 변수 넣기 
      ps.setString(1, user.getUser_id()); //1번째 물음표에 user_id 전달
      ps.setString(2, user.getUser_name()); //2번째 물음표에 user_name 전달
      
      
      //쿼리문 실행 : insert된 행의 개수가 반환된다.
      int insertResult = ps.executeUpdate();  // 1이 반환된다. 
      
      // 결과 
      System.out.println(insertResult + "개의 행이 삽입되었습니다. ");      
      
      // 커밋? 안한다. 
      // con.setAutoCommit(true); <- 기본값으로 사용되고 있다. 
      
    } catch(Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(ps != null) ps.close();
        if(con != null)con.close();
      }catch(Exception e) {
        e.printStackTrace();
        
      }
    }
    
    
    

  }

}
