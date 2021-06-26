package com.cos.blog.util;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Dont Repeat Yourself
public class ValidationHandler {
	
	public int validation(List<String> keys, HttpServletRequest request, HttpServletResponse response) {
		Enumeration<String> e = request.getParameterNames();
		// 핸들러 밖에 함수를 만들어서 내부에서 체크하게 만들기
		//키값이 널인지 검증 개수 
		for(int i=0; i<keys.size(); i++) {
			if (request.getParameter(keys.get(i)) == null) {
				System.out.println(keys.get(i) + "값이 null입니다.");
				return -1;
			}
		}
		// 키값이 공백인지 검증
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			
				if (request.getParameter(key).equals("")) {
				System.out.println(key + "값이 공백입니다.");
				return -1;
			}
		}
		return 1;
	}
}
