package com.codeLine.library_management_system.service;

import com.codeLine.library_management_system.Dao.UserDao;
import com.codeLine.library_management_system.entity.User;

public class UserService {

	UserDao userDao = new UserDao();
	public User registerUserService(User user){
		return userDao.registerUser(user);
	}
	
	public User loginUserService(String email, String password) {
		return userDao.loginUser(email, password);
	}

	
	}

