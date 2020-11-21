package Action;

import Service.create_database;
import Service.create_table;
import Service.insert_data;
import Service.password_service;

import com.opensymphony.xwork2.Action;

//This action will create the database, table and populate it with data.

public class LoginAction implements Action {
	 
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
		create_database db = new create_database();
		db.createdb();
		
		//create table
		create_table table = new create_table();
		table.createtable();
		
		//insert data into table
		insert_data data = new insert_data();
		data.insertrec();
		
		
		return "success";
		
	}

}
