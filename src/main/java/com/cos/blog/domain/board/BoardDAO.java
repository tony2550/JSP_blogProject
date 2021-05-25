package com.cos.blog.domain.board;

import java.util.List;

import com.cos.blog.web.dto.BoardDetailDTO;

// 이것도 공식이다 외워라 임마
//1. 공통적인 기능을 먼저 구현 CRUD
public class BoardDAO {
	// 상세보기시 Board정보와 User정보를 조인해서 가져올 함수 --> 일반적이지 않으니까 적어놓는다
	public BoardDetailDTO mDetails(int id) { // 완전 새롭게 구현하는 기능 mDetails() 예시다 id를 받아서 join 해서 
		return null;
	}
	
	//get
	public Board findById(int id) { // WHERE 절의 id 1건받기 어떤 프로그램에도 1건찾기는 무조건잇
		return null;
	}
	//get
	public List<Board> findAll() { // 이것도 무조건있다  
		return null;
	}
	//post
	public int save(Board board) { // 모든 파라메터 받으면 힘들잖아 오브젝트로 받아라
		return -1;
	}
	//post
	public int update(Board board) {
		return -1;
	}
	//post
	public int deleteById(int id) {
		return -1;
	}
}
