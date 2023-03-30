<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>URL</th>
			<th>Image</th>
		</tr>
		<c:forEach items="${list}" var="bag" begin="0" end="10" step="2">
			<tr>
				<td>${bag.no}</td>
				<td>${bag.name}</td>
				<td>${bag.url}</td>
				<td>${bag.img}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>