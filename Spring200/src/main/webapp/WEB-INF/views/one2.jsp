<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources\js\jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		/* 
			1. 화면을 이동하지 않고
				서버에 insert해달라고 요청 url
			2. 성공하면 result 아래에 append
				insert4?bbsno=?&content=?&writer=?
		*/
		
		$('#b1').click(function() {
			content = $('#reply').val()	// JSP 내의 특정 아이디 값을 가져오는 방법
			writer = "apple"
			
			$.ajax({
				url : "insertReply",
				data : {
					// key값은 vo의 변수 이름과 같아야합니다.
					bbsno : ${bag.no },	// model에서 넘어온 값
					content : content,	
					writer : writer
				},
				success : function() {
					alert("성공")
				}
			}) // ajax
		}) // b1
	}) // document
</script>
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
	<br> ${bag.no}, ${bag.title}, ${bag.content}, ${bag.writer}
	<div id="result">
		<%
			int i = 1;
		%>
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
		<input id="reply">
		<button id="b1">댓글달기</button>
		<hr>
	</div>
</body>
</html>