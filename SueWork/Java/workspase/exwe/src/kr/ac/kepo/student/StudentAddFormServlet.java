package kr.ac.kepo.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student/addform.do")
public class StudentAddFormServlet extends HttpServlet {
	Scanner s = new Scanner(System.in);
	
	{
		// 초기화 블럭
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String user ="com"; 
	String password ="com01"; 
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");//응답내용이 text/html임을 알리도록 설정
		resp.setCharacterEncoding("UTF-8"); //응답내용의 문자 인코딩 설정
		PrintWriter out = resp.getWriter(); //응답객체에 출력할 수 있는 스트림 가져오기
	

		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>                           ");
		out.print("<meta charset='UTF-8'>           ");
		out.print("<title>학생관리</title> ");
		out.print("</head>                          ");
		out.print("<body align=\"center\">                           ");
		out.print("	<h1>학생 추가</h1>       ");
		
		//ContextPath: 현재 웹 애플리케이션(프로젝트)의 고유 경로
		out.print("	<form action='"+req.getContextPath()+"/student/add.do' method='post'>      ");
		out.print("	<fieldset>      ");
		
		out.print("	<label for=\"stuNo\">신규 학번 </label>     ");
		out.print("	<input type=\"text\" name=\"stuNo\"><br/>      ");
		
		out.print("	<label for=\"stuName\">학생 이름</label>     ");
		out.print("	<input type=\"text\" name=\"stuName\"> <br/>      ");
		
		out.print("	<label for=\"stuScore\">학생 성적 </label>     ");
		out.print("	<input type=\"text\" name=\"stuScore\"> <br/>      ");
		
		out.print(" <input type=\"submit\" value=\"저장\">");


		out.print("	</fieldset>      ");
		out.print("	</form>      ");
		out.print("</body>                          ");
		out.print("</html>                          ");
	}
	
}
