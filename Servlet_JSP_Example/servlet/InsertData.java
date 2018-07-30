package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@webServlet("/add");
public class InsertData extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String id=req.getParameter("id");
	int uid=Integer.parseInt(id);
	String name = req.getParameter("name");
	String pass = req.getParameter("password");
try
{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jspdb", "postgres", "root");
		Statement st=con.createStatement();
		
		int i=st.executeUpdate("insert into jsp.student(stud_id,stud_name,password) values("+uid+",'"+name+"','"+pass+"')");
		
		pw.println("inserted rows are="+i);
		if(i==1)
		{
		pw.println("<br/>you have successfully inserted data");
		}
		else
		{
		pw.println("your data is not inserted");
		}
		st.close();
		con.close();
		
}

catch(Exception e){System.out.println(e);}
}

}
