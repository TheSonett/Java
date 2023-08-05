package com.joy;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebFilter("/IDServlet")
public class IDFilter extends HttpFilter implements Filter {
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		// write code here
		int id = Integer.parseInt(request.getParameter("id"));
		if(id > 0)
			chain.doFilter(request, response);
		else {
			PrintWriter out = response.getWriter();
			out.println("ID cannot be negative!!");
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
}
