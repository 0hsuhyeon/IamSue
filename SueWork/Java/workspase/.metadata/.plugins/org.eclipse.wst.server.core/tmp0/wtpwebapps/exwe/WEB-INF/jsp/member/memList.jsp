<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
		<!DOCTYPE html>			
		<html>					
		<head>                       
		<meta charset='UTF-8'>       
		<title>회원관리</title> 	
		</head>                      
		<body align="center">      
			<h1>회원 목록</h1>       
<%-- 		<a href='<%=request.getContextPath()%>/member/addform.do'><button>회원추가</button></a><br> --%>
			<a href='${pageContext.request.contextPath}/member/add.do'><button>회원추가</button></a><br>

			<c:forEach var="vo" items= "${memList}">
				<a href = '${pageContext.request.contextPath}/member/edit.do?memId=${vo.memId}'> ${vo.memId}</a>
				: ${vo.memPass} : ${vo.memName} : ${vo.memPoint} 
				<a href='${pageContext.request.contextPath}/member/del.do?memId=${vo.memId}'><button>삭제</button></a><br/>																		
			</c:forEach>				
			
		
		
		</body>        
		</html>        
		