package com.sahota;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			// Getting username and password from user input
			String user = request.getParameter("username");
			String pass = request.getParameter("password");

			// sending username and password to User class for data validation in constructor and checking if user exists or not
			User u = new User(user, pass);
			// HttpSession hs=new HttpSession();
			if (u.exists()) {

				out.println("<font color=blue size=18>Login Successful!!!<br>");

			} else {
				out.print("Login Failed");

			}

			// TODO add something
			ServletContext a = request.getServletContext();
			System.out.print("context path" + a.getContextPath());

		} catch (InvalidUserException ex) {
            out.println("<font color=red size=18>Login Failed InvalidUserException!!!<br>");
		} catch (SQLException sq) {
			out.println("<font color=red size=18>LoginFailed SQL exception!!!<br>");
			sq.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			out.println("<font color=red size=18>Login Failed ClassNotFound!!!<br>");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}


