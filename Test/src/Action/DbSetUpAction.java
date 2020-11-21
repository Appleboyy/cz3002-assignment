package Action;

import Service.Create_database_service;
import Service.Create_table_service;
import Service.Insert_data_service;
import Service.Password_service;

import com.opensymphony.xwork2.Action;

//This action will create the database, table and populate it with data.

public class DbSetUpAction implements Action {
	 
	 private String user;
	 private String password;
	 private String name;

	 public String getUser() {
	      return user;
	   }

	 public void setUser(String user) {
	      this.user = user;
	   }

	 public String getPassword() {
	      return password;
	   }

	 public void setPassword(String password) {
	      this.password = password;
	   }

	 public String getName() {
	      return name;
	   }

	 public void setName(String name) {
	      this.name = name;
	   }
	
	
	 public String execute() {
		 
		//create database
		Create_database_service db = new Create_database_service();
		db.createdb();
		
		//create table
		Create_table_service table = new Create_table_service();
		table.createtable();
		
		//insert data into table
		Insert_data_service data = new Insert_data_service();
		data.insertrec();
		
		
		return "success";
		
	}

}
