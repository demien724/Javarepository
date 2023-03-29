<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header {
	text-align: center;
}

.foodInput {
	margin: 5px;
}
</style>
</head>

<body>
	<header> <h3>Food</h3> <hr></header>

	<form action="food">
		졸아하는 음식<input type="text" name="like" class="foodInput"><br>
		싫어하는 음식<input type="text" name="dislike" class="foodInput"><br>
		<input type="submit" value="음식 결과 요청">
	</form>
	
</body>
</html>