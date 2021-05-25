package com.cos.blog.domain.user;

import java.util.List;

import com.cos.blog.domain.board.Board;

public class UserDAO {
	
		public User findByUsernameAndPassword(String username, String password) {
			return null;
		}
	
		// 모든 모델의 디폴트
		//get
		public User findById(int id) { // WHERE 절의 id 1건받기 어떤 프로그램에도 1건찾기는 무조건잇
			return null;
		}
		//get
		public List<User> findAll() { // 이것도 무조건있다  
			return null;
		}
		//post
		public int save() { // 모든 파라메터 받으면 힘들잖아 오브젝트로 받아라
			return -1;
		}
		//post
		public int update(User user) {
			return -1;
		}
		//post
		public int deleteById(int id) {
			return -1;
		}
}
