package com.codeLine.library_management_system.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codeLine.library_management_system.DB.DataBaseConnect;
import com.codeLine.library_management_system.entity.User;

public class UserDao {
	
	DataBaseConnect connect =  new DataBaseConnect();
	@SuppressWarnings("static-access")
	Connection connection = connect.getConn();
	
	//Register User
	public User registerUser(User user){
		String Query = "INSERT INTO user(name, email,password, phno, adress) VALUES(?,?,?,?,?)";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(Query);
			
			preparedStatement.setString(1 , user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());  
	        preparedStatement.setString(4, user.getPhno()); 
			preparedStatement.setString(5, user.getAdress());
			
			 int rowsInserted = preparedStatement.executeUpdate();
		        if (rowsInserted > 0) {
		            return user; // Registration successful
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return null; // Registration failed
		}
	
	//Login User
	
public User loginUser(String email, String password) {
		
		User user = new User();
		String Query = "select * from user where email = ? and password = ?";
		
		try {
			PreparedStatement ps= connection.prepareStatement(Query);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setEmail(resultSet.getString(3));
				user.setPhno(resultSet.getString(4));
				user.setPassword(resultSet.getString(5));
				user.setAdress(resultSet.getString(6));
}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
}
}

