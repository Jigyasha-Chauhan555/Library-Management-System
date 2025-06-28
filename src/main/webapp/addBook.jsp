<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<link rel="stylesheet" href="registration.css">
</head>
<body>

<div class="container">
	<h1>Add Book</h1>
    <form action="books" method="post">
        BookId: <input type="number" name="bookId" required><br>
        BookName: <input type="text" name="bookName" required><br>
        Author: <input type="text" name="author" required><br>
        <input type="submit" value="Add Book">
    </form>
    <a href="index.jsp">Back to Home</a>
    </div>
    
    <%
    String succMsg = (String) session.getAttribute("succMsg");
    String failedMsg = (String) session.getAttribute("failedMsg");

    if (succMsg != null) {
%>
    <p style="color: green;"><%= succMsg %></p>
<%
        session.removeAttribute("succMsg"); // Remove after showing
    }

    if (failedMsg != null) {
%>
    <p style="color: red;"><%= failedMsg %></p>
<%
        session.removeAttribute("failedMsg");
    }
%>
</body>
</html>