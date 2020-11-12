package Action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	
	private String userID;
	private String password;
	
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String execute() {
		
		if (getUserID().equals("user") && getPassword().equals("password")) {
			
			return SUCCESS;
		}
		
		return NONE;	
		
	}

}
