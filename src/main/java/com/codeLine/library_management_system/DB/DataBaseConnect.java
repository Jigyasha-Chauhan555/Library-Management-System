package com.codeLine.library_management_system.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnect {

private  static Connection conn;
    
	public static Connection getConn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/library-project";
			String user = "root";
			String pass = "root123";
			
		 conn=DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return conn;
	}
}
