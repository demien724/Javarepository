<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("count", 0);
		session.setAttribute("user", "root");
	%>
	
	<hr color="red">
	<a href="session속성갖고오기.jsp">이동</a>
</body>
</html>