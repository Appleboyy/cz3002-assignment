package Service;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;


public class insert_data {
	
	create_database db = new create_database();
	
	public void insertrec() {
		   
		 
		   String JDBC_DRIVER = db.getJDBC_DRIVER(); 
		   String DB_URL = db.getDB_URL() + db.getSchema();

		   //  Database credentials
		   String USER = db.getUSER();
		   String PASS = db.getPASS();
		   
		  
		   Connection conn = null;
		   java.sql.Statement stmt = null;
		   try{
		      
			  //connect database
		      Class.forName("com.mysql.jdbc.Driver");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		  
		      
		      //Execute a query
		     
		      stmt = conn.createStatement();
		      
		      //insert 2 set of data into the table
		      
		      String sql = "INSERT INTO login " +
		                   "VALUES ('user1', 'password', 'Wee Ren')";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO login " +
		                   "VALUES ('user2', 'password', 'Wayne')";
		      stmt.executeUpdate(sql);
		  

		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		  
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   
		}
}
