<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">

게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
<div id="result">
	<% int i = 1;%>
	<table>
	
		<tr>
			
			<td>번호</td>
			<td>글쓴이</td>
			<td>내용</td>
		</tr>
		<c:forEach items="${list}" var='bag2'>
			<tr>
				<td><%= i++ %></td>
				<td>${bag2.writer}</td>
				<td>${bag2.content}</td>
			</tr>
		</c:forEach>
	
	</table>
</div>
</body>
</html>