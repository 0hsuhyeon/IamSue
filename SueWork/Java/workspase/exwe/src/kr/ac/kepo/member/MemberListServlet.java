package kr.ac.kepo.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//브라우저 주소창에
//http://localhost:8000/exwe/member/list.do
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/member/list.do")

// 회원목록 화면에 '회원추가'링크를 추가하고
// 링크를 클릭하면 http://localhost:8000/exwe/member/addform.do 로 이동
public class MemberListServlet extends HttpServlet{
	
	MemberDaoJdbc memberDao = new MemberDaoJdbc();		
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<MemberVo> list = memberDao.selectMemberList();
		
		req.setAttribute("memList", list); // 요청객체에 'memlist'라는 이름으로 list 데이터를 저장
		
		// "/WEB-INF/jsp/member/memlist.jsp" 파일로 이동
		
		//RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/jsp/member/memList.jsp");
		//rd.forward(req,resp); // 현재 요청객체체와 응답객체를 전달해주면서 이동
		req.getRequestDispatcher("/WEB-INF/jsp/member/memList.jsp").forward(req,resp); // 윗줄 2개와 같은 의미
		
		
	}

	

}


