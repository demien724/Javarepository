<%@page import="multi.SongDAO"%>
<%@page import="multi.SongVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <jsp:useBean id="bag" class=multi.SongVO></jsp:useBean>
   <jsp:setProperty property="*" name="bag"/>
    
    <%
    
    	SongDAO DAO = new SongDAO();
		int result = DAO.update(bag);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 	if(result == 1) { %>
		해당 곡 삭제 성공
	<% } else { %>
		해당 곡 삭제 실패
	<% } %>	
</body>
</html>