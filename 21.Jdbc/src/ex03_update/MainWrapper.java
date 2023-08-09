package ex03_update;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

import connect.DB_Connect;


public class MainWrapper {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("수정할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.nextLine();
    System.out.print("수정할 USER_NAME >>> ");
    String user_name = sc.nextLine();
    sc.close();
    
    Connection con = null;
    PreparedStatement ps = null;
    
    
    try {
      con = DB_Connect.getConnection();
      
      String sql = "";
      sql += "UPDATE USER_T";
      sql += "   SET USER_NAME = ?";
      sql += " WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      
      ps.setString(1, user_name);
      ps.setInt(2, user_no);
      
      // 쿼리문 실행 : update 된 행의 개수가 반환된다.
      int updateResult = ps.executeUpdate();
      
      // 결과
      System.out.println(updateResult + "행이 수정되었습니다.");
      
    }catch (Exception e) {
      e.printStackTrace();
    }finally {
      try {        
        if(ps != null) ps.close();
        if(con != null) con.close();        
      }catch(Exception e) {
        e.printStackTrace();
      }
      
    }
    
    
    
    
    

  }

}
