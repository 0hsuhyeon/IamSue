package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exchange.do") 
public class ExchangeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("exchange");
		
		//POST방식으로 전송된 파라미터 값의 인코딩 설정
		req.setCharacterEncoding("UTF-8");
		//"name"이라는 이름의 파라미터 값을 가져오기
		String m = req.getParameter("dollar");
		double n = Double.valueOf(m).doubleValue();
		double x= (n * 1216.90);
		
		
				//한글이 아닐 경우 출력하지 않아도 된다
		resp.setContentType("text/html");//응답내용이 text/html임을 알리도록 설정
		resp.setCharacterEncoding("UTF-8"); //응답내용의 문자 인코딩 설정
		
		PrintWriter out = resp.getWriter(); //응답객체에 출력할 수 있는 스트림 가져오기
	
		
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>                           ");
		out.print("<meta charset='UTF-8'>           ");
		out.print("<title>Login</title> ");
		out.print("</head>                          ");
		out.print("<body>                           ");

		out.print( m + "달러=" + x + "원");	
					
		out.print("</body>                          ");
		out.print("</html>                          ");
	}
	
}