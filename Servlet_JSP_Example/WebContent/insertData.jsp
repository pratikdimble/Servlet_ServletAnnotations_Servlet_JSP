<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> data Insert</title>
</head>
<body>
<form action="showrecord"  method="post">  
<button type="submit">view record</button>
</form>
<a href="${pageContext.request.contextPath}/showrecord" > display all record</a>

  
<h1>Add New User</h1>  
<form action="add"  method="post">  
<table>  
<tr><td>ID:</td><td><input type="text" name="id"/></td></tr> 
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password"/></td></tr>  

<tr><td colspan="2"><input type="submit" value="Add User"/></td></tr>  
</table>  
</form>  


</body>
</html>
