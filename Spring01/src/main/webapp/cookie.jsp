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
// 	1. 쿠기 생성, 브라우저에 저장할 정보 1개당 쿠키 1개
	Cookie c1 = new Cookie("name","hong-gil-dong");
	Cookie c2 = new Cookie("age","100");
	
//	2. 쿠키를 서버에 보낸다.
	response.addCookie(c1);
	response.addCookie(c2);
%>
<hr>브라우저에 쿠키를 심었음
<a href="cookiesInfo.jsp">쿠키 리스트 갖고오기</a>

</body>
</html>