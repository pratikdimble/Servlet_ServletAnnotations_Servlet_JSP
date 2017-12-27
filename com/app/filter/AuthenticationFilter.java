package com.app.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
//@WebFilter("/AuthenticationFilter")
@WebFilter(
			urlPatterns = {"/anno1", "/anno2"}
			)
	public class AuthenticationFilter implements Filter {
		public void destroy() {
		// TODO Auto-generated method stub
		}
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		if((uname != null && uname.equals("pratik")) && (upwd != null && upwd.equals("manager"))) {
		chain.doFilter(request, response);
		}else {
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("/loginform.html");
		reqDispatcher.forward(request, response);
		}
		}
		public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		}

		}
