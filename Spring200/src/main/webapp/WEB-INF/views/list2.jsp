<%@page import="com.multi.mvc200.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td {
	width: 100px;
	text-align: center;
}

.top {
	background: gray;
	color: white;
}

.down {
	background: white;
	
	color : black;
	
	text-decoration : none;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td class="top">번호</td>
			<td class="top">제목</td>
			<td class="top">내용</td>
			<td class="top">글쓴이</td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

<tr>
				<td class="down">${bag.no}</td>
				<td class="down"><a href="one2.multi?no=${bag.no}">${bag.title}</a>
				</td>
				<td class="down">${bag.content}</td>
				<td class="down">${bag.writer}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>