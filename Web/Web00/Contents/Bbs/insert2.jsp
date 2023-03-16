<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	BbsVO bag = new BbsVO();

String no = request.getParameter("no");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);

BbsDAO dao = new BbsDAO();
dao.insert(bag);
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
	작성한 글 번호 =
	<%=no%> <br>
	작성한 글 제목 =
	<%=title%>	<br>
	작성한 글 내용 =
	<%=content%> <br>
	작성한 글쓴이 =
	<%=writer%> <br>
</body>
</html>