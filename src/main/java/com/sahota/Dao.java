package com.sahota;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	   int status=0;
	   Connection con = null;
	   ResultSet RS;
	 
	   GetSet getset=new GetSet();
	   
	   //Creating method to connect to database
	    public  Connection getConnection() throws ClassNotFoundException, SQLException {
	    	 Connection con = null;
	        try {
	        	
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           
	            con = DriverManager.getConnection("jdbc:mysql://root:Root@localhost:3306/add_numbers");

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return con;
	    }
	    
	    //Method for logging in user
	    
	    public String login(String uname ,String pass) throws SQLException,ClassNotFoundException {
	    	
	    	//Starting connection
	    	getConnection();
	    	
    	//Creating SQL statement
	    	PreparedStatement ps=con.prepareStatement("select UserName form login where UserName=? pwd=?");
	   //Setting values to ps statement
	    	ps.setString(1,uname);
	    	ps.setString(2,pass);
	   //Executing query and storing in ResultSet
	        ResultSet rs=ps.executeQuery();
	      //checking if ResultSet have data with if condition
	        if(rs.next())
	        {
	        	//Sending control to Index.jsp
	           RS=rs;
	        }
	        else {
	        	//out.println("<font color=red size=18>LOgin Failed!!!<br>");
	        	//out.println("<a href=Login.jps>Try Again</a>");
	        }
	    	
	    	
	    	return toString();
	    	
	    }

}


