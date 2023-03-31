<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>안녕?
	<c:forEach items="${list}" var="bag" begin="0" end="10" step="2">
		${bag.id} <br>
	</c:forEach>	
</body>
</html>