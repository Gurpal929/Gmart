package com.sahota;



public class GetSet {
	String username;
	String password;
	
	public  GetSet(String uname, String pass) {
		super();
		this.username = uname;
		this.password = pass;
	}
	
	
	//Getters Setters to validate data entered by user
	
	public GetSet() {
		
	}

	public String getUsername() {
		
		if(username==null) {
			System.out.println("Please enter user name");
		}
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		if(password==null) {
			System.out.println("Please enter password");
		}
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
