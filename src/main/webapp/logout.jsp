<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    session.invalidate();
    response.sendRedirect("login.jsp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout </title>
</head>
<body>

<p>Create a new an account? <a href="registration.jsp">Register here</a></p>

</body>
</html>