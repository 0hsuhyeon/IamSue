package kr.ac.kopo.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.member.MemberDaoJdbc;
import kr.ac.kopo.member.MemberVo;

@WebServlet("/student/add.do")
public class StudentAddServlet extends HttpServlet{
	
	StudentDaoJdbc studentDao = new StudentDaoJdbc();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/student/addform.jsp").forward(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8"); // post 방식으로 전송된 파라미터값의 인코딩 설정
		String stuNo = req.getParameter("stuNo");
		String stuName = req.getParameter("stuName");
		int stuScore = Integer.parseInt(req.getParameter("stuScore"));
		
		
		
		StudentVo vo = new StudentVo();
		vo.setStuNo(stuNo);
		vo.setStuName(stuName);
		vo.setStuScore(stuScore);
		
		
			int num = studentDao.insertStudent(vo);
			System.out.println(num + "개의 레코드 추가");
		
		resp.sendRedirect(req.getContextPath()+"/student/list.do");
	}

}
