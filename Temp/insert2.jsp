<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
		String no = request.getParameter("no");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
		작성한 no = <%= no %>
		작성한 title = <%= title %>
		작성한 content = <%= content %>
		작성한 writer = <%= writer %>
</body>
</html>