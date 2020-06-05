<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
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
	
	
		<!DOCTYPE html>				
		<html>						
		<head>                        
		<meta charset='UTF-8'>        
		<title>학생관리</title> 	
		</head>                       
		<body align="center">       
			<h1>학생정보변경</h1>     
<%
		PrintWriter outPrintWriter = response.getWriter(); //응답객체에 출력할 수 있는 스트림 가져오기
		String no = request.getParameter("stuNo");
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
%>						
						
						<form action='<%=request.getContextPath()%>/student/edit.jsp' method='post'>    
						<fieldset>  
						
						<label for="stuNo">학 번 </label>  
						<input type="text" name="stuNo" value='<%=stuNo%>' readonly><br/> 

						<label for="stuName">이 름 </label>    
						<input type="text" name="stuName"value='<%=stuName%>'> <br/>     
						
						<label for="stuScore">포인트 </label>     
						<input type="text" name="stuScore"value='<%=stuScore%>'> <br/>    
						
						<input type="submit" value="수정">
						<a href='<%=request.getContextPath()%>/student/del.jsp?stuNo=<%=stuNo%>'><button type='button'>삭제</button></a><br/>
						


						</fieldset>  
						</form>   
<%								
					}
			
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
	
%>		
		</body>       
		</html>       