<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- JSTL이나 커스텀 태그 등 태그 라이브러리를 JSP에서 사용할 때 접두사를 지정하기 위해 사용함 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>글쓴이</td>
		</tr>
	<c:forEach items="${list2}" var="bag" begin="0" end="10" step="2">
		<tr>
			<td>${bag.no}</td>
			<td>${bag.title}</td>
			<td>${bag.content}</td>
			<td>${bag.writer}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>