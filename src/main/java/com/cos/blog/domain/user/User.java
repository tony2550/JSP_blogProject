package com.cos.blog.domain.user;

import java.sql.Timestamp;

public class User { // N , 1
	
	private Integer id; // Primary Key, Sequence
	private String username; // 유저네임
	private String password;
	private String email;
	private String address;
	private Timestamp created; // 회원가입 날짜 , + 업데이트 날짜


	public User() {
	
	}


	public User(Integer id, String username, String password, String email, String address, Timestamp created) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.created = created;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Timestamp getCreated() {
		return created;
	}


	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	
	
}