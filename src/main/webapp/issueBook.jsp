<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Issue Book</title>
<link rel="stylesheet" href="registration.css">
</head>
<body>
<div class="container">
	<h2>Issue Book</h2>
    <form action="issuebook" method="post">
        ID: <input type="number" name="id" required><br>
        Book ID: <input type="number" name="bookId" required><br>
        Student ID: <input type="number" name="studentId" required><br>
        Issue Date: <input type="date" name="issueDate" required><br>
        Return Date: <input type="date" name="returnDate" required><br>
        Status: <input type="text" name="status" required><br>
        <input type="submit" value="Issue Book">
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