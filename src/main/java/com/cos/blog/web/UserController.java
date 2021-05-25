package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;
import com.cos.blog.service.user.JoinAction;
import com.cos.blog.service.user.JoinFormAction;

// http://localhost:8070/blog/user
@WebServlet("/user") // 모델이름으로 바꿔라 필터
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // 생성!
		
		if(request.getParameter("cmd") == null || request.getParameter("cmd").equals("")) {
			return;
		}
		
		String cmd = request.getParameter("cmd");
		Action action = router(cmd);
		if(action != null) {
			action.execute(request, response); // 동적바인딩
		}
	}
	// 이 라우터가 팩토리패턴인거에요! 라우터가 공장을 만들어서 리턴해주는 팩토리 패턴
	private Action router(String cmd) {
		if(cmd.equals("joinForm")) {
			return new JoinFormAction();
		} else if(cmd.equals("join")) {
			return new JoinAction();
		} else if(cmd.equals("loginForm")) {
			
		} else if(cmd.equals("login")) {
				
		} else if(cmd.equals("updateForm")) {
				
		} else if(cmd.equals("update")) {
				
		} else if(cmd.equals("logout")) {
				
		}
		return null;
	}

}
