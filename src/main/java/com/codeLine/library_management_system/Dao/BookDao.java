package com.codeLine.library_management_system.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.codeLine.library_management_system.DB.DataBaseConnect;
import com.codeLine.library_management_system.entity.Book;

public class BookDao {

	DataBaseConnect connect = new DataBaseConnect();
	@SuppressWarnings("static-access")
	Connection connection = connect.getConn();
	

	public Book BookAddDao(Book book) {
		String Query = "insert into books(bookId,bookName,author) values(?,?,?) ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Query);

			preparedStatement.setInt(1, book.getBookId());
			preparedStatement.setString(2, book.getBookName());
			preparedStatement.setString(3, book.getAuthor());
      
		preparedStatement.executeUpdate();

		return book;

	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
	
	//Get all books
	public List<Book> getAllBooks(){
		 List<Book> list = new ArrayList<>();
		 
		 String Query = "select * from books";

			try {
				PreparedStatement ps = connection.prepareStatement(Query);

				ResultSet resultSet = ps.executeQuery();
				
				while (resultSet.next()) {
					Book book = new Book();
					book.setBookId(resultSet.getInt(1));
					book.setBookName(resultSet.getString(2));
					book.setAuthor(resultSet.getString(3));
					
					list.add(book);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;

	    }
	// Get book by Id
	
	public Book getBooksById(int id) {

		Book b = new Book();

		String Query = "select * from books where bookid = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(Query);
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				b = new Book();
				b.setBookId(resultSet.getInt(1));
				b.setBookName(resultSet.getString(2));
				b.setAuthor(resultSet.getString(3));
	
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}
	
	// Update book
	
	public Book bookUpdate(Book book) {
		String Query = "update books set bookName =?, author = ?, where bookId = ? ";

		try {
			PreparedStatement ps = connection.prepareStatement(Query);
			ps.setString(1, book.getBookName());
			ps.setString(2, book.getAuthor());
			ps.setInt(3, book.getBookId());

			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//Delete book
	
	public int deleteBookById(int id) {
		String Query = "delete from books where bookId = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Query);
			preparedStatement.setInt(1, id);
			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

}
