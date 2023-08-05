package com.saha;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		
//		int sum = a + b;
//		
//		PrintWriter out = res.getWriter();
//		out.println("The sum is: " + sum);
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		//PrintWriter out = res.getWriter();
		//out.println("The sum is: " + sum);
		

		// setting the sum value to request object
		//req.setAttribute("square", sum);
		
		// calling another servlet
		//RequestDispatcher rd = req.getRequestDispatcher("square");
		//rd.forward(req, res);
		
		
		// by send Redirect
		//res.sendRedirect("square?sum=" + sum); // URL Rewriting method
		
		
		// by session
		//HttpSession session = req.getSession();
		//session.setAttribute("square", sum);
		
		// by cookie
		Cookie cookie = new Cookie("square", sum + "");
		res.addCookie(cookie);
		
		res.sendRedirect("square");
	}
}
