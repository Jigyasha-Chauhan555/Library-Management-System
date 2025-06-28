<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<link rel="stylesheet" href="registration.css">
</head>
<body>
<div class="container">
	<h1>Register New User</h1>
    <form action="UserController" method="post">
        <input type="hidden" name="action" value="register">
        Name: <input type="text" name="name" required><br>
        Email: <input type="email" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        Phone Number: <input type="number" name="phno" required><br>
        Address: <input type="text" name="address" required><br>
        <button type="submit">Register</button>
    </form>
    <p>Already have an account? <a href="login.jsp">Login here</a></p>
    </div>
</body>
</html>