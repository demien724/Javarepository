<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 특정 Session을 등록합니다. ("이름",값)의 형식을 갖고 있습니다. -->
	<% session.setAttribute("count", 100); %>
	
	<!-- 특정 Session 속성의 값을 가지고 옵니다. -->
	시작 현재 카운트 <%= session.getAttribute("count") %>,	${count} <br>
	
	
	<a href="session속성갖고오기2.jsp">session속성가지고오기</a>
</body>
</html>