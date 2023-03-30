<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
	.title { 
		font-size : 30px;
		
		text-align : center;
	}	
	
	.menu {
		background-color: aqua;
		text-align : center;
	}
	
	.category-button {
		min-width: 100px;
	}
	

</style>

<title>음악 검색</title>
</head>
<body>
	<div id="header">
		<div class="account"></div>

		<div class="title">
			<h3>음악의 중심</h3>
		</div>

		<div class="menu">
			<a href=""><button class="category-button">Empty 1</button></a> 
			<a href=""><button class="category-button">Empty 2</button></a>
			<a href=""><button class="category-button">Empty 3</button></a> 
			<a href=""><button class="category-button">Empty 4</button></a>
		</div>
		<hr>
	</div>

	<div id="main">
		<form action="one.Music">
			뮤직 아이디를 입력해주세요 <br>
			<input type="text" name="id"> <button type="submit">검색</button>
		</form>
		<hr>
	</div>

	<div id="footer">
	</div>


</body>
</html>