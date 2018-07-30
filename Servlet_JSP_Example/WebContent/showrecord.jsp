<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>welcome</p>
  <table border="2">
    <tr><th>id</th>
      <th>Name</th>
      <th>Password</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
  <c:forEach var="dto"  items="${studentrecord}">
    <tr>
      <td>${dto.id}</td>
      <td>${dto.username}</td>
      <td>${dto.password}</td>
      <td><a href="edit.jsp?id=${dto.id}"><button type="button">edit </button></a></td>
      <td><a href="delete.jsp?id=${dto.id}"><button type="button">delete </button></a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
