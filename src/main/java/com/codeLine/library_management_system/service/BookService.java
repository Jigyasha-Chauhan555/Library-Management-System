package com.codeLine.library_management_system.service;

import com.codeLine.library_management_system.Dao.BookDao;
import com.codeLine.library_management_system.entity.Book;

public class BookService {
  
	BookDao bookDao = new BookDao();
	
	public Book BookAddService(Book book) {
		return bookDao.BookAddDao(book);
	}
	
	public Book getBooksByIdServlate(int id){
		return bookDao.getBooksById(id);
	}
	
	public Book bookUpdateServlate(Book book) {
		return bookDao.bookUpdate(book);
	}
	
	public int deleteBookByIdServlate(int id) {
		return bookDao.deleteBookById(id);
	}
}
