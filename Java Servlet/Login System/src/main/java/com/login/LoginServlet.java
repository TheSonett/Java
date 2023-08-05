package com.login;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// login validation
		if(username.equals("root") && password.equals("root")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("login.jsp");			
		}
		
	}
}
