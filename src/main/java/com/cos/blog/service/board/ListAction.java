package com.cos.blog.service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Http Body 데이터 유효성 검사
		
		// 2. Http Body 데이터 변수로 받아야 한다. 
								
		// 3. DAO 연결해서 findAll() 하기
								
		// 4. result 받아야 함
								
		// 5. 1일 때, 1이 아닐떄를 분기해서 1일때는 로그인 페이지로 보내기, 1이 아니면 joinForm 페이지로 보내
		
	}
	
}
