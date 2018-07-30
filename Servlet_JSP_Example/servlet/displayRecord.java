package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student;
@WebServlet("/display")
public class displayRecord extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String query="select * from jsp.student";
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jspdb", "postgres", "root");
			Statement st = con.createStatement();
			ResultSet rst=st.executeQuery(query);
			ArrayList<Student> studentList = new ArrayList<>();
			pw.println("\tID \tName  \t password");
			  while (rst.next()) {
				  
				  Student student = new Student(rst.getInt("stud_id"), rst.getString("stud_name"), rst.getString("password"));
			        studentList.add(student);
			    }
			req.setAttribute("studentrecord",studentList);
			RequestDispatcher RequetsDispatcherObj =req.getRequestDispatcher("/showrecord.jsp");
			RequetsDispatcherObj.forward(req, res);
			rst.close();
			st.close();
			con.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}


