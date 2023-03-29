<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
hr {
	margin-bottom: 15px;
	margin-top: 15px;
}
</style>
</head>
<body>
	<h3>북마크 등록</h3>
	<form action="bookInsert">
		Name <input name="name" type="text"><br> URL <input
			name="url" type="text"><br> Image <input name="img"
			type="file"><br>
		<button type="submit">등록</button>
	</form>

	<hr>
	<h3>북마크 삭제</h3>
	<form action="bookDelete">
		Name <input name="name" type="text"><br>
		<button type="submit">삭제</button>
	</form>

	<h3>북마크 검색</h3>
	<form action="bookSearch">
		Name <input name="name" type="text"><br>
		<button type="submit">검색</button>
	</form>

	<h3>북마크 업데이트</h3>
	<form action="bookUpdate">
		Name <input name="name" type="text"><br> URL <input
			name="url" type="text"><br>
		<button type="submit">검색</button>
	</form>
</body>
</html>