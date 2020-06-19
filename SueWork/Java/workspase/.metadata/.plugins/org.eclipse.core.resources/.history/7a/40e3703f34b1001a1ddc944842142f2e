<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu</title>
</head>
<body>
	<!-- 링크가 동작하도록 구현 -->
	<a href = '${pageContext.request.contextPath}/member/edit.do?memId=${loginUser.memId}'> [회원관리] </a>
	<a href = '${pageContext.request.contextPath}/bbs/list.do'> [게시판] </a>
	<a href = '${pageContext.request.contextPath}/student/list.do'> [학생관리] </a>
	
	<c:if test="${loginUser == null}">
	<!-- 로그인 하지 않은 경우 -->
	<a href = '${pageContext.request.contextPath}/member/login.do'> [로그인] </a>
	</c:if>
	<c:if test="${loginUser != null}">
	<!-- 로그인 한 경우 -->
	${loginUser.memName} 님
	<a href = '${pageContext.request.contextPath}/member/logout.do'> [로그아웃] </a>
	</c:if>
</body>
</html>