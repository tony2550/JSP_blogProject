package com.cos.blog.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Script {
	// 버퍼를 달아서 통신을 하면 예외가 발생
	public static void back(String msg, HttpServletResponse response) throws IOException{
		// 응답할때는 응답하고싶은 컨텐트 타입을 해당 메소드에 지정하는 것이 맞다
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('"+msg+"');");
		out.println("history.back();");
		out.println("</script>");
	}
}
