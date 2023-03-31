<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	
	/* 다운 캐스팅 */
	int count = (Integer) session.getAttribute("count");
	count++;
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	조회수 : <%= count %>

</body>
</html>