package com.codeLine.library_management_system.Controller;

import java.io.IOException;
import java.sql.Date;

import com.codeLine.library_management_system.entity.IssueBook;
import com.codeLine.library_management_system.service.IssueService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/issuebook")
@MultipartConfig
public class IssueBookController extends HttpServlet {
	
	IssueService issueService = new IssueService();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			int bookId = Integer.parseInt(req.getParameter("bookId"));
	        int studentId = Integer.parseInt(req.getParameter("studentId"));
	        Date issueDate = Date.valueOf(req.getParameter("issueDate")); // format: yyyy-mm-dd
	        Date returnDate = Date.valueOf(req.getParameter("returnDate"));
	        String status = req.getParameter("status");

	        IssueBook issueBook = new IssueBook();
	        
	        issueBook.setId(id);
	        issueBook.setBookId(bookId);
	        issueBook.setStudentId(studentId);
	        issueBook.setIssueDate(issueDate);
	        issueBook.setReturnDate(returnDate);
	        issueBook.setStatus(status);

	       
	            issueService.issueBookService(issueBook);
	            res.sendRedirect("issueBook.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            res.sendRedirect("issueBook.jsp");
	        }
	}

     }

