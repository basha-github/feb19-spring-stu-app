package com.stpeters.stu.marks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myusers")
public class StuUsers {
	
	@Id
	String email;
	String password;
	public StuUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuUsers(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "StuUsers [email=" + email + ", password=" + password + "]";
	}
	
	
	

}
