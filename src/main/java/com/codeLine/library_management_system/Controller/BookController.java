package com.codeLine.library_management_system.Controller;
import java.io.IOException;
import com.codeLine.library_management_system.entity.Book;
import com.codeLine.library_management_system.service.BookService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/books")
@MultipartConfig
public class BookController extends HttpServlet{

//	private static final BookService service = null;
	BookService bookService = new BookService();
	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		try {
			String bookId = req.getParameter("bookId");
			String bookName = req.getParameter("bookName");
			String author = req.getParameter("author");
			
			Book book = new Book();

			book.setBookId(Integer.parseInt(bookId));
	        book.setBookName(bookName);
	        book.setAuthor(author);
	            
			HttpSession session = req.getSession();
                bookService.BookAddService(book);
                
			if (book != null) {
				
				session.setAttribute("succMsg", "Book Add Successfully...");
				res.sendRedirect("addBook.jsp");
			} else {
				session.setAttribute("failedMsg", "Something wrong on server");
				res.sendRedirect("addBook.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
