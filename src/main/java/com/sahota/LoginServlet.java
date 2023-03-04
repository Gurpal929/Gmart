package com.sahota;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
	    
	   //Creating objects  to access its data
		Dao dao=new Dao();
	    
		
		
	     try {
	    	//Getting username and password from user input
		   String u=request.getParameter("username");
		   String p=request.getParameter("password");
		  
		   //sending username and password to GetSet class for data validation
		   GetSet getset=new GetSet(u,p);
		 
		   //Calling login method of Dao class to Login User with valid data(tested by getters and setters)
		  dao.login(getset.getUsername(),getset.getPassword());
		   if(dao.RS.next()) {
			   RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
			   rd.forward(request,response);
			   
			  }else{
				System.out.println("<font color=red size=18>LOgin Failed!!!<br>");
				System.out.println("<a href=Login.jps>Try Again</a>");
				  
			  }
		 } 
	   catch (Exception e) {
			e.printStackTrace();
		}
	 
	    
	 
	    
		
	}

}
