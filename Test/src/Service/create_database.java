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
	
	
	
	private String USER = "root"; //change the user accordingly
    private String PASS = "Kingkhong12"; //change the password of the user
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private String DB_URL = "jdbc:mysql://localhost/";	
	private String schema = "CZ3002_Teo_Wee_Ren"; //schema name can change if want to
	

	public String getSchema() {
		return schema;
	}

	public String getUSER() {
		return USER;
	}
	
	public String getPASS() {
		return PASS;
	}

	public String getJDBC_DRIVER() {
		return JDBC_DRIVER;
	}

	public String getDB_URL() {
		return DB_URL;
	}

	
	 public void createdb(){   
		   
		   Connection conn = null;
		   java.sql.Statement stmt = null;
		   
		   try{
			  
			  //connect to the database
		      Class.forName("com.mysql.jdbc.Driver");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);

		      //Execute a query
		
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE DATABASE " + schema;
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
		            stmt.close();
		      }catch(SQLException se2){
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
