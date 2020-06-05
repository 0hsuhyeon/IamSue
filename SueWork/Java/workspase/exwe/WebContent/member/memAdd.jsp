<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<%! 
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
%>	
<% 
		request.setCharacterEncoding("UTF-8"); // post 방식으로 전송된 파라미터값의 인코딩 설정 // 요청객체 세팅
		String memId = request.getParameter("memId");
		String memPass = request.getParameter("memPass");
		String memName = request.getParameter("memName");
		int memPoint = Integer.parseInt(request.getParameter("memPoint"));
		
		{
			//SQL문에서 변화하는 값은 ?로 표시
			String sql ="INSERT INTO MEMBER(mem_id, mem_pass, mem_name, mem_point)" 
						+ "VALUES(?,?,?,?)";
					
					
			try (
						
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
						
				pstmt.setString(1,memId);//pstmt에 들어있는 SQL문의 1번째 ?에 id값을 주입
				pstmt.setString(2,memPass);
				pstmt.setString(3,memName);
				pstmt.setInt(4,memPoint);
						
				int num = pstmt.executeUpdate();
				System.out.println(num + "개의 레코드 추가");
						
			 } catch (SQLException e) {
				e.printStackTrace();
			 	}
		}
		
		// resp.sendRedirect("URL주소 또는 경로") : 지정된 주소 또는 경로로 이동하라는 명령을 담은 응답을 브라우저에게 전송 
		response.sendRedirect(request.getContextPath()+"/member/memList.jsp");
%>		
		

