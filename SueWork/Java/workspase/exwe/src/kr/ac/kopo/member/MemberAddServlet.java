package kr.ac.kopo.member;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/member/add.do") //원래 이 주소를 요청받으면 service메소드가 실행되야함  
public class MemberAddServlet extends HttpServlet {
	
	MemberDaoJdbc memberDao= new MemberDaoJdbc();
	
	// 요청을 받으면, 요청방식에 상관없이 싱행되는 메소드 : service()
	// 주소가 똑같아도 요청방식이 틀릴 수 있음(parm.html참고)
	// 특정 요청방식으로 요청이 온 경우에만 실행되는 메서드 : do요청방식()
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/member/memAddForm.jsp").forward(req,resp); // 왔다가 돌아와야하면 includ? 가기만 하면 되면 forward
		
	}	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); // post 방식으로 전송된 파라미터값의 인코딩 설정
		String memId = req.getParameter("memId");
		String memPass = req.getParameter("memPass");
		String memName = req.getParameter("memName");
		int memPoint = Integer.parseInt(req.getParameter("memPoint"));
		
		
		MemberVo vo = new MemberVo();
		vo.setMemId(memId);
		vo.setMemPass(memPass);
		vo.setMemName(memName);
		vo.setMemPoint(memPoint);
		
		
		
		int num = memberDao.insertMember(vo);
		System.out.println(num + "개의 레코드 추가");
		
		// resp.sendRedirect("URL주소 또는 경로") : 지정된 주소 또는 경로로 이동하라는 명령을 담은 응답을 브라우저에게 전송 
		resp.sendRedirect(req.getContextPath()+"/member/list.do");
		
	}
}
	

