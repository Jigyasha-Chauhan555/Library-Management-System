<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    // Only get session if it exists
    jakarta.servlet.http.HttpSession currentSession = request.getSession(false);

    if (currentSession != null) {
        currentSession.invalidate(); // safe invalidate
    }

    response.sendRedirect("login.jsp");
%>