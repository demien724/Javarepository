<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 화면 입니다</h3>
	<hr color="red">
	<form action="login" method="get">
		ID <input name="id"> <br>
		Password <input name="pw"> <br>
		<button type="submit">Login</button>
	</form>

	<h3 style="color: red;">JSP Test</h3>
	<hr color="red">

	<form action="insert" method="get">
		ID <input name="id"> <br>
		Password <input name="pw"> <br>
		Name <input name="name"> <br>
		Tel <input name="tel"> <br>
		<button type="submit">Insert</button>
	</form>



	<h3>회원수정 화면입니다.</h3>
	<hr color="red">
	<form action="update" method="get">
		id : <input name="id" value="apple"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">



	<h3>회원탈퇴 화면입니다.</h3>
	<hr color="red">
	<form action="delete" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">



	<h3>회원검색 화면입니다.</h3>
	<hr color="red">
	<form action="one" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	
	
	<a href="list">모든 회원 정보 갖고오기</a>
	
	
</body>
</html>