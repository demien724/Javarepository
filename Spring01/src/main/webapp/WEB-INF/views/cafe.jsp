<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="news">내용</div>
	
	<%
		if (session.getAttribute("id") != null) {
	%>
	<div class="reply">
		<form action="aaa">
			댓글 : <input type="text" name="replay">
			<button type="submit">등록</button>
		</form>
	</div>
	<%
		}
	%>
</body>
</html>