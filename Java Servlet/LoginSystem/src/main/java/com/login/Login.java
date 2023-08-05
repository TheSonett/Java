package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("uname").toString();
		String password = request.getParameter("upass").toString();
		
		// login successful
		if(username.equals("root") && password.equals("root")) {
			response.sendRedirect("index.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("login falied!! :(");
		}
	}

}
