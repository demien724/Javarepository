<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String no = request.getParameter("no");
	String content = request.getParameter("contnet");
	int num = Integer.parseInt(no);

	BbsVO bag = new BbsVO();

	bag.setNo(num);
	bag.setContent(content);

BbsDAO dao = new BbsDAO();
dao.update(bag);
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
	<h3>	업데이트 완료</h3>
</body>
</html>