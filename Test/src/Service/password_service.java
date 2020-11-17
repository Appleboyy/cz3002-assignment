package Service;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class password_service extends ActionSupport {
	

   public String checking(String user,String password) {
      String ret = null;
      Connection conn = null;
             
      try {
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hope", "root", "Kingkhong12"); //change Kingkhong12 to your own password
         String sql = "SELECT name FROM login WHERE";
         sql+=" user = ? AND password = ?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, password);
         ResultSet rs = ps.executeQuery();
   
         while (rs.next()) {
            ret = rs.getString(1);
       
         }
      } catch (Exception e) {
         ret = null;
      } finally {
         if (conn != null) {
            try { 	
               conn.close();
            } catch (Exception e) {
            }
         }
      }
      return ret;
   }
  
	
  }
   
   