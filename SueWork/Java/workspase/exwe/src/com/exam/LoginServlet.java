package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do") 
public class LoginServlet extends HttpServlet {
	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("login");
			
			//POST방식으로 전송된 파라미터 값의 인코딩 설정
			req.setCharacterEncoding("UTF-8");
			//"name"이라는 이름의 파라미터 값을 가져오기
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			//요청으로 보낸 웹브라우저에게 출력하기 위해서는
			//인자로 받은 응답객체에 출력해야 한다.
			
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
						if (id.equals("a001") ) {
							if ( pw.equals("1234") ) {
								out.println("로그인 성공");			
							}else {
								out.println("로그인 실패");
								
							}
							
							
						}else {
							out.println("존재하지 않는 ID입니다.");
							
						}
						
			out.print("</body>                          ");
			out.print("</html>                          ");
		}
	}
 
