package com.codeLine.library_management_system.service;

import com.codeLine.library_management_system.Dao.IssueBookDao;
import com.codeLine.library_management_system.entity.IssueBook;

public class IssueService {

	IssueBookDao issueDao = new IssueBookDao();
	
	public boolean issueBookService(IssueBook issue) {
		return issueDao.issueBook(issue);
	}
}
