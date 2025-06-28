package com.codeLine.library_management_system.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.codeLine.library_management_system.DB.DataBaseConnect;
import com.codeLine.library_management_system.entity.IssueBook;

public class IssueBookDao {

DataBaseConnect connect = new DataBaseConnect();
	
	@SuppressWarnings("static-access")
	Connection connection = connect.getConn();
	
	public boolean issueBook(IssueBook issue) {
boolean f=false;
		
		String Query = "insert into issueBook(id, bookId , StudentId, issueDate , returnDate, status) Values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Query);
			
			preparedStatement.setInt(1, issue.getId());
			preparedStatement.setInt(2, issue.getBookId());
			preparedStatement.setInt(3, issue.getStudentId());
			preparedStatement.setDate(4, new java.sql.Date(issue.getIssueDate().getTime()));
			preparedStatement.setDate(5, issue.getReturnDate() != null ? new java.sql.Date(issue.getReturnDate().getTime()) : null);
			preparedStatement.setString(6, issue.getStatus());
			
			int i = preparedStatement.executeUpdate();
			
			if(i == 1)
				f = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
	
}
