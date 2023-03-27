<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: red;">JSP Test</h3>
	<hr color="red">
	
	<form action="insert.jsp" method="get">
		ID <input name="id"> <br>
		Password <input name="pw"> <br>
		Name <input name="name"> <br>
		Tel <input name="tel"> <br>
		<button type="submit">Insert</button>
	</form>
</body>
</html>