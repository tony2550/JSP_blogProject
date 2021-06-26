package com.cos.blog.domain.board;

import java.util.List;

import com.cos.blog.domain.CrudDAO;
import com.cos.blog.web.dto.BoardDetailDTO;

// 이것도 공식이다 외워라 임마
//1. 공통적인 기능을 먼저 구현 CRUD
public class BoardDAO implements CrudDAO<Board>{

	// 상세보기시 Board정보와 User정보를 조인해서 가져올 함수 --> 일반적이지 않으니까 적어놓는다
	public BoardDetailDTO mDetails(int id) { // 완전 새롭게 구현하는 기능 mDetails() 예시다 id를 받아서 join 해서 
		return null;
	}
	
	@Override
	public Board findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
