package connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Connect {
  
  public static Connection getConnection() {
    
    Connection con = null;  
   
    
    try {
         BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"));
          
          Class.forName("oracle.jdbc.OracleDriver");
          //프로퍼티파일 -> 프로퍼티객체
          Properties p = new Properties();
          p.load(reader);
          
          //프로퍼티객체의 프로퍼티 가져오기 
          String url = p.getProperty("url");
          String user = p.getProperty("user");
          String password = p.getProperty("password");
          con = DriverManager.getConnection(url, user, password);
          
          
        }catch(Exception e) {
          e.printStackTrace();
        } 
          
        
    return con;
    
  }

  
}

