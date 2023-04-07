<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}" var="bag">
		${bag.id } <br>
		${bag.name } <br>
		${bag.url } <br>
		${bag.img } <hr>
	</c:forEach>
</body>
</html>