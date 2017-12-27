package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet(
					name = "testServlet",
						urlPatterns = {"/anno3", "/anno2"},
							loadOnStartup = 1,
								initParams = {
												@WebInitParam(name="A", value="Pratik"),
													@WebInitParam(name="B", value="Rohit")
										}
				)
	
	public class TestServlet extends HttpServlet
	{
		static
		{
			System.out.println("Servlet Loading");
		}
		//default constructor
		public TestServlet()
		{
			System.out.println("Servlet Instatiation");
		}
		//initialize the servlet
		public void init() 
		{
				System.out.println("Servlet Initialization");
		}
		
		private static final long serialVersionUID = 1L;
		//doPost() method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Request Processing");
			response.setContentType("text/html");
				PrintWriter out = response.getWriter();
					ServletConfig config = getServletConfig();
						String lname = config.getServletName();
							String a = config.getInitParameter("A");
								String b = config.getInitParameter("B");

								out.println("<html>");
									out.println("<body>");
										out.println("<h1>");
											out.println("Logical Name :"+lname+"<br>");
												out.println("A----->"+a+"<br>");
													out.println("B----->"+b);
			}//doPost(-,-) close
	//servlet deinstantiation method
	public void destroy()
	{
		System.out.println("Servlet Deinstantiation");
	}

}//class close
