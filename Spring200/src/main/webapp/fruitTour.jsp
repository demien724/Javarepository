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
		$('#tour').click(function() {
			$.ajax({
				url : "tour",
				success : function(x) {
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('Movie 요청 실패!')
				} //error
			}) //ajax
		})//tour
		
		
		$('#fruit').click(function() {
			$.ajax({
				url : "fruit",
				success : function(x) {
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('Movie 요청 실패!')
				} //error
			}) //ajax
		})//tour
	}) //$
</script>
<title>Insert title here</title>
</head>
<body>
	<button id="tour">여행 목록 가져오기</button>
	<button id="fruit">과일 목록 가져오기</button>
	<hr color="gray">
	<div id="result"></div>
</body>
</html>