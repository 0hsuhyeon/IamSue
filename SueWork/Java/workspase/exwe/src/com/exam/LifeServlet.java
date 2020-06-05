package com.exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/life.do") // 예전에는 WebContent - WEB-INF - web.xml으로 설정가능했음
public class LifeServlet extends HttpServlet{

	
	@Override
	public void init() throws ServletException {
		// 이 서블릿 객체가 처음 생성된 후, 최초 1번만 실행 (톰캣이 호출)
		// 보통 서블릿 실행을 위한 초기화 작업들을 수행
		System.out.println("LifeServlet: init 실행");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 이 서블릿과 연결된 주소로 요청이 올때마다 1번씩 실행
		System.out.println("LifeServlet: service 실행");
	}
	
	@Override
	public void destroy() {
		// 이 서블릿 객체가 메모리에서 제거될 때 마지막으로 1번 실행
		// 보통 서블릿이 사용하던 자원(메모리, 소켓 등)을 반납하는 작업들을 수행
		System.out.println("LifeServlet: destroy 실행");
	}
	
}
