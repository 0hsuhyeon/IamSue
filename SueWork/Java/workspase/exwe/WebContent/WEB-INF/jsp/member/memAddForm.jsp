<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<!DOCTYPE html>				
		<html>						
		<head>                         
		<meta charset="UTF-8">         
		<title>회원관리</title> 		
		</head>                        
		<body align="center">        
		    <jsp:include page="/WEB-INF/jsp/comm/menu.jsp"></jsp:include>
			<h1>회원 추가</h1>    
			   	
		     
			<form action="${pageContext.request.contextPath}/member/add.do" method="post">      
			<fieldset>      								
		
			<label for="memId">신규 아이디 </label>     
			<input type="text" name="memId"><br/>      	
		
			<label for="memPass">비밀번호 </label>     
			<input type="text" name="memPass"> <br/>    
		
			<label for="mamName">이름 </label>     	
			<input type="text" name="memName"> <br/>    
		
			<label for="mamPoint">포인트 </label>     
			<input type="text" name="memPoint"> <br/>   
		
		 <input type="submit" value="저장">			


			</fieldset>     								
			</form>     									
		</body>                         					
		</html>

