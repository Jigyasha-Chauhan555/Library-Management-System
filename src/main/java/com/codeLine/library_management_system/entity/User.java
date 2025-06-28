package com.codeLine.library_management_system.entity;

import java.util.Objects;

public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private String phno;
	private String adress;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email, String password, String phno, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phno = phno;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adress, email, id, name, password, phno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phno, other.phno);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phno=" + phno
				+ ", adress=" + adress + "]";
	}
	
	
	
}
