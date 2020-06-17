<%@page import="java.util.concurrent.atomic.AtomicInteger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
// 	JSP에서는 기본객체들을 변수선언 없이 사용 가능
// 	요청객체: request, 세션객체: session, 서블릿 컨텍스트객체: application

// 	1. 처음 접속한 사람의 경우, 이름을 입력할 수 있는 폼을 보여주고, 
//     이름을 입력한 후 전송버튼을 누르면 다시 현재 JSP파일로 접속
	String nickParam = request.getParameter("nick");
	String nickSession = (String)session.getAttribute("userNick");

	if (nickParam!=null && nickSession == null){
		session.setAttribute("userNick", nickParam);
		AtomicInteger totalVal = (AtomicInteger)application.getAttribute("total");
		if (totalVal == null){
			totalVal = new AtomicInteger(0);
			application.setAttribute("total", totalVal);
		}
		totalVal.incrementAndGet();
	}
// 	2. 이름을 입력한 사람의 경우, "입력한 이름님,안녕하세요.라는 메세지 출력
// 	3. 현재까지 접속한 모든 사용자의 수를 "총 사용자 : 00명"이라고 출력

// 사용자가 이름을 입력하여 전송한 경우, 그 이름을 세션객체에 "userNick"이라고 이름으로 저장
// 서블릿컨텍스트객체에 "total"이라는 이름으로 세션 객체에 이름을 저장할 때마다 1씩 증가
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>속성 저장 연습</title>
</head>
<body align = "center">

	
<%-- 	<c:if test="${sessionScope.userNick == null }"> --%>
		<c:if test="${userNick == null }">
		
			<form action="${pageContext.request.contextPath}/attr.jsp">
				이름 : <input type="text" name="nick"/>
					 <input type="submit"/>
			</form>
		
		</c:if>
		<c:if test="${userNick != null}"> <!-- 닉네임을 입력했던 경우  -->
	
			<form>
			<h1> ${userNick}님, 안녕하세요!</h1>
			</form>
	
		</c:if>
	
	<!-- 	모든 사용자에게 다음을 출력 -->
		
		<h1> 총 사용자: ${total}명</h1>
</body>
</html>