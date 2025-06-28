<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link rel="stylesheet" href="registration.css">
</head>
<body>
<div class="container">
	<h1>Login</h1>
    <form action="UserController" method="post">
        <input type="hidden" name="action" value="login">
        Email: <input type="email" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        <button type="submit">Login</button>
    </form>
    <p>Don't have an account? <a href="registration.jsp">Register here</a></p>
    </div>
    
</body>
</html>