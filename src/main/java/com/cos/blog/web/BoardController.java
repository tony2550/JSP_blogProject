package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;
import com.cos.blog.service.board.ListAction;

// http://localhost:8070/blog/board
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("cmd") == null || request.getParameter("cmd").equals("")) {
			return;
		}
		
		String cmd = request.getParameter("cmd");
		Action action = router(cmd);
		if(action != null) {
			action.execute(request, response);
		}
	}
	
	private Action router(String cmd) {
		// http://localhost:8070/blog/board?cmd=list
		if(cmd.equals("list")) {
			return new ListAction();
		} else if(cmd.equals("detail")) {
			
		} else if(cmd.equals("delete")) {
			
		} else if(cmd.equals("updateForm")) {
			
		} else if(cmd.equals("updateForm")) {
			
		} else if(cmd.equals("saveForm")) {
			
		} else if(cmd.equals("save")) {
			
		}
		return null;
	}
}
