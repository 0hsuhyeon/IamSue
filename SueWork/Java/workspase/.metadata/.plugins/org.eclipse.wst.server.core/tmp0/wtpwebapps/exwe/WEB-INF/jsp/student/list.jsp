<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<!DOCTYPE html>  
	<html>          
	<head>          
	<meta charset='UTF-8'>
	<title>학생관리</title>
	
	<style> body	{background-color: rgba(147, 112, 216, 0.925);} 
			div		{ 
					background-color: lightpink; 
					width:90%;  /* 너비 */ 
					padding:15px;  /* 패딩 */
					border:1px solid black;  /* 테두리 */ 
					}
			.shadow {color: lightskyblue; text-shadow: 5px 5px 3px dodgerblue;}
	</style>
	
	</head>               
	<body align="center">                         
	
		<div>
		<h1 class='shadow'>학생 목록</h1>      
		<a href='${pageContext.request.contextPath}/student/add.do'><button>학생추가</button></a><br/>
			
		<c:forEach var="vo" items= "${stuList}">
			<a href='${pageContext.request.contextPath}/student/edit.do?stuNo=${vo.stuNo}'>${vo.stuNo}</a>
			: ${vo.stuName} :${vo.stuScore}
			<a href='${pageContext.request.contextPath}/student/del.do?stuNo=${vo.stuNo}'><button>삭제</button></a><br/>	
		</c:forEach>		
		</div>
		
	</body>
	</html>