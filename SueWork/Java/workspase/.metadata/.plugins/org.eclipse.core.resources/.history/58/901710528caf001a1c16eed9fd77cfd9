<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
	<style>
	body{
            background-color:#F2E0F7;
        }
	</style>

</head>
<body align="center">
	<h1>🎵글 목록🎵</h1>
	
	<a href='${pageContext.request.contextPath}/bbs/add.do'><button>새글쓰기</button></a><br/><br/>
	<table align="center" border="1">
		<thead>
			<tr><th>글번호</th><th>제목</th><th>작성자</th><th>등록일</th><th>조회수</th></tr>	
		</thead>
		<tbody>
<%-- 		${bbsList.get(0).bbs뫄뫄} 를 써야하는데 forEach를 해서 간단하게 만들었다 --%>
			<c:forEach var="vo" items= "${bbsList}">
				<tr>
				<td>${vo.bbsNo}</td>
				<td><a href="${pageContext.request.contextPath}/bbs/edit.do?bbsNo=${vo.bbsNo}">${vo.bbsTitle}</a></td>
				<td>${vo.bbsWriter}</td>
				<td>${vo.bbsRegDate}</td>
				<td>${vo.bbsCount}</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
</body>
</html>