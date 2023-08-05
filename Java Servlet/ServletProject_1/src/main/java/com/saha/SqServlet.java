package com.saha;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// getting the sum value from AddServlet
		//int sq = (int) req.getAttribute("square");
		
		// by send Redirect
		//int sq = Integer.parseInt(req.getParameter("sum"));
		
		// by session
		//HttpSession session = req.getSession();
		//int sq = (int) session.getAttribute("square");
		
		// by cookie
		int sq = 0;
		Cookie[] cookies = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("square")) {
				sq = Integer.parseInt(c.getValue());
			}
		}
		
		sq = sq * sq;
		
		PrintWriter out = res.getWriter();
		out.println("The square value is: " + sq);
	}
}
