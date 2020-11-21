package Action;

import Service.Password_service;

//This Action will try to get the user and password from the database through services

public class CheckUserInputAction {
	
	
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
		 
			Password_service pw = new Password_service();
			
			name = pw.checking(user, password);
			
			if (name==null) return "error";
			else return "success";
			
		}

}
