package com.joy;

import java.io.IOException;
import java.util.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String name = "Joy";
		
		List<Student> students = Arrays.asList(
				new Student("Joy", 5), 
				new Student("Sonett", 2),
				new Student("Kohli", 18),
				new Student("Dhoni", 7)
		);
		
		request.setAttribute("name", name);
		request.setAttribute("students", students);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
}
