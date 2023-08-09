package ex04_delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("삭제할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.close();
    Connection con =null;
    PreparedStatement ps =null;
    ResultSet rs =null;
    
    try {
      con = DB_Connect.getConnection();
      
      String sql = "";
      sql += "DELETE";
      sql += "  FROM USER_T ";
      sql += " WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 넣기
      ps.setInt(1, user_no);   // 1번째 물음표 ← user_no
      
      // 쿼리문 실행 : delete 된 행의 개수가 반환된다.
      int deleteResult = ps.executeUpdate();
      
      // 결과
      System.out.println(deleteResult + "행이 삭제되었습니다.");
      
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null)con.close();        
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    
    

  }

}
