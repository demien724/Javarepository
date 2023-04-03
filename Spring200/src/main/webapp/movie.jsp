<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	
<%-- $ << document를 의미하며, 'body를 읽었을 때'를 연상하면 됩니다. --%>
	$(function() { 
		$('#b1').click(function() {
			$.ajax({
				url : "computer",
				data : {
					movieTitle : $('#movieTitle').val(),
					moviePrice : $('#moviePrice').val(),
				},
				success : function(x) {
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('computer요청 실패!')
				} //error
			}) //ajax
		})//b2
	}) //$
</script>
<title>Insert title here</title>
</head>
<body>
	영화제목 :
	<input id="movieTitle">
	<br> 
	영화 관람료:
	<input id="moviePrice" type="number">
	<button id="b1" value="영화 관람 확인">영화 관람 확인</button>
	<hr color="gray">
	<div id="result"></div>
</body>
</html>