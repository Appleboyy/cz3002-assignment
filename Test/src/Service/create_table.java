package Service;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class create_table {
	
	create_database db = new create_database();

	public void createtable () {
		
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
		      
		      //create a table with 3 columns: user, password and name with user being the primary key
		      
		      String sql = "CREATE TABLE login " +
		                   "(user VARCHAR(255), " + 
		                   " password VARCHAR(255), " + 
		                   " name VARCHAR(255), "+
		                   " PRIMARY KEY ( user ))"; 

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
