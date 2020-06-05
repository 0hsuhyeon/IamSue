package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal.do")
public class CalcServlet extends HttpServlet {
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("calc");
		
		//POST방식으로 전송된 파라미터 값의 인코딩 설정
		req.setCharacterEncoding("UTF-8");
		//"name"이라는 이름의 파라미터 값을 가져오기
		String n1 = req.getParameter("x");
		String n2 = req.getParameter("y");
		String op = req.getParameter("op");
		

		double n3 = Double.valueOf(n1).doubleValue();
		double n4 = Double.valueOf(n2).doubleValue();
		
		double result = 0;
		String opOut="";
		
		
		//요청으로 보낸 웹브라우저에게 출력하기 위해서는
		//인자로 받은 응답객체에 출력해야 한다.
		
		//한글이 아닐 경우 출력하지 않아도 된다
		resp.setContentType("text/html");//응답내용이 text/html임을 알리도록 설정
		resp.setCharacterEncoding("UTF-8"); //응답내용의 문자 인코딩 설정
		
		PrintWriter out = resp.getWriter(); //응답객체에 출력할 수 있는 스트림 가져오기
	
		
	
		
					switch (op) {
					case "plu":
						opOut="+";
						result = n3 + n4;
						break;
					case "min":
						opOut="-";
						result = n3 - n4;
						break;	
					case "mul":
						opOut="*";
						result = n3 * n4;
						break;	
					case "div":
						opOut="/";
						result = n3 / n4;
						break;	
					default:
						out.println("알 수 없는 연산자");
						return;
				
					}
					
					out.println(n3 + op + n4 + "=" + result);
					
		
		
	}
}

