package kr.ac.kepo.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student/editform.do")
public class StudentEditFormServlet extends HttpServlet {
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
		out.print("<html>							");
		out.print("<head>                           ");
		out.print("<meta charset='UTF-8'>           ");
		out.print("<title>학생관리</title> 			");
		out.print("</head>                          ");
		out.print("<body align=\"center\">          ");
		out.print("	<h1>학생정보 변경</h1>       		");
		
		String no = req.getParameter("stuNo");
		String sql ="SELECT stu_no, stu_name, stu_score FROM student WHERE stu_no = ?";
			try (
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				
				pstmt.setString(1,no);
				try (ResultSet rs = pstmt.executeQuery();){
					if(rs.next()){
						String stuNo = rs.getString("stu_no"); 						
						String stuName = rs.getString("stu_name");
						int stuScore = rs.getInt("stu_score");
						
						
						out.print("	<form action='"+req.getContextPath()+"/student/edit.do' method='post'>      ");
						out.print("	<fieldset>   ");
						
						out.print("	<label for=\"stuNo\">학번 </label>     ");
						out.print("	<input type=\"text\" name=\"stuNo\" value='" + stuNo + "' readonly><br/>      ");
						
						out.print("	<label for=\"stuName\">이름 </label>     ");
						out.print("	<input type=\"text\" name=\"stuName\"value='" + stuName + "'> <br/>      ");
						
						out.print("	<label for=\"stuScore\">성적 </label>     ");
						out.print("	<input type=\"text\" name=\"stuScore\"value='" + stuScore + "'> <br/>      ");
						
						out.print(" <input type=\"submit\" value=\"수정\">");


						out.print("	</fieldset>  ");
						out.print("	</form>      ");
					}
			
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
	
		out.print("</body>       ");
		out.print("</html>       ");
	}
			catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
}
