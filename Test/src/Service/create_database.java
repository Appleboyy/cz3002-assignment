package Service;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class create_database {
	
	 public void createdb(){
		   
		 String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   String DB_URL = "jdbc:mysql://localhost/";

		   //  Database credentials
		   String USER = "root";
		   String PASS = "Kingkhong12";
		   
		   
		   Connection conn = null;
		   java.sql.Statement stmt = null;
		   
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		  
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);

		      //STEP 4: Execute a query
		
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE DATABASE hope";
		      stmt.executeUpdate(sql);
		
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		
		}//end main
	   
	
	

}
