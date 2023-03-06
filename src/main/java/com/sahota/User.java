package com.sahota;
//import com.sahota.InvalidUserException;
import java.sql.SQLException;

public class User {

	private String username;
	private String password;

	public  User(String uname, String pass) throws InvalidUserException {
       if(uname==null || pass==null){
    	throw new InvalidUserException("Invalid Username or Password");
       }
		this.username = uname;
		this.password = pass;
	}
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean exists() throws SQLException, ClassNotFoundException {
		Dao dao=new Dao();
		System.out.println("Dao object created ");
	
		 return dao.login(this);

		}
}


