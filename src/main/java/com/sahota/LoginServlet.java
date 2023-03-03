package com.sahota;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //Creating objects  
		Dao dao=new Dao();
	    GetSet gs=new GetSet();
	    //Establishing Connection to database
	    dao.getConnection();
	    //Getting values from ForntEnd
	    String uname=gs.getUsername();
	    String pass=gs.getPassword();
	    //
	    PreparedStatement ps;
		try {
			ps = dao.con.prepareStatement("select username from gmart username=? and passwors=?");
			   ps.setString(1, uname);
			   ps.setString(2, pass);
			   
			    
			    
			    
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 
	    
	 
	    
		
	}

}
