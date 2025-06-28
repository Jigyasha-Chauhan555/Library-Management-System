package com.codeLine.library_management_system.entity;

import java.util.Date;
import java.util.Objects;

public class IssueBook {

	private int id;
	private int bookId;
	private int studentId;
	private Date issueDate;
	private Date returnDate;
	private String status;
	
	public IssueBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IssueBook(int id, int bookId, int studentId, Date issueDate, Date returnDate, String status) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.studentId = studentId;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, id, issueDate, returnDate, status, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IssueBook other = (IssueBook) obj;
		return bookId == other.bookId && id == other.id && Objects.equals(issueDate, other.issueDate)
				&& Objects.equals(returnDate, other.returnDate) && Objects.equals(status, other.status)
				&& studentId == other.studentId;
	}

	@Override
	public String toString() {
		return "IssueBook [id=" + id + ", bookId=" + bookId + ", studentId=" + studentId + ", issueDate=" + issueDate
				+ ", returnDate=" + returnDate + ", status=" + status + "]";
	}
	
	
}
