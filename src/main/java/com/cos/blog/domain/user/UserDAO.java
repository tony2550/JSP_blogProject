package com.cos.blog.domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.cos.blog.config.DBConn;
import com.cos.blog.domain.CrudDAO;

public class UserDAO implements CrudDAO<User>{
	
	public User findByUsernameAndPassword(String username, String password) {
		return null;
	}
	
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User data) {
		String sql = "INSERT INTO users(id, username, password, email, address, created) VALUES(user_seq.nextval,?,?,?,?,sysdate)";
		
		try {
			Connection conn = DBConn.디비연결(); 
			PreparedStatement pstmt = conn.prepareStatement(sql); 
			User user = (User) data;
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress()); 
			
			return pstmt.executeUpdate(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int update(User data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
