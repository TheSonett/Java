package com.alien.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import com.alien.dao.AlienDao;
import com.alien.models.Alien;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/AlienServlet")
public class AlienServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		AlienDao dao = new AlienDao();
		Alien alien = dao.getAlien(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("alien", alien);
		
		//RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		//rd.forward(request, response);
		response.sendRedirect("display.jsp");
	}
}
