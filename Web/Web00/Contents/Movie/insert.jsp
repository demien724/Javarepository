<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>		
    <!-- Java Resource/src 부분에 있는 multi 패키지의 MovieMO 클래스를 bag이라는 이름으로 객체 선언한다 -->
    
    <jsp:setProperty property="*" name="bag"/>
    
 
	<% 
		MovieDAO dao = new MovieDAO();
		dao.insert(bag);
    %>
    
    <!-- 브라우저에게 결과를 알려주기 위한 HTML코드가 미리 들어가있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%= bag.getId() %>
</head>
<body>
</body>
</html>