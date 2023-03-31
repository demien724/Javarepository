<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<% if(session.getAttribute("id") == null) { %>
	<!-- 로그인의 판단 여부는 Session을 가지고 합니다. -->
	<h3>로그인 화면 입니다</h3>
	<hr color="red">
	<form action="login" method="get">
		ID 		 <input name="id"> <br>
		Password <input name="pw"> <br>
		<button type="submit">Login</button>
	</form>
	
<% } else { %>
	<a href="news.jsp">뉴스</a>
	<a href="cafe.jsp">카페</a>
 <% } %>
	
	
</body>
</html>