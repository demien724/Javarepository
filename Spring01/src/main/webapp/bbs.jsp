<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: red;">글 등록</h3>
	<hr color="red">

	<form action="insert2.multi" method="get">
		Title <input name="title"> <br>
		Content <input name="content"> <br>
		Writer <input name="writer"> <br>
		<button type="submit">서버로 전송</button>
	</form>



	<h3>글 수정</h3>
	<hr color="red">
	<form action="update2.multi" method="get">
		No <input name="no" type="number"> <br>
		Content <input name="content"> <br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">



	<h3>글 삭제</h3>
	<hr color="red">
	<form action="delete2.multi" method="get">
		No <input name="no" type="number"> <br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">



	<h3>글 검색</h3>
	<hr color="red">
	<form action="one2.multi" method="get">
		No <input name="no" type="number"> <br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	
	<!-- BbsController의 list.multi와 연결 --> 
	<a href="list2.multi">모든 글 리스트 검색</a>
</body>
</html>