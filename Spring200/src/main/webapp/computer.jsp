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
		$('#b2').click(function() {
			$.ajax({
				url : "computer",
				data : {
					com : $('#com').val(),
					comPrice : $('#comPrice').val(),
					mouse : $('#mouse').val(),
					mousePrice : $('#mousePrice').val()
				},
				success : function(x) {
					alert('computer요청 성공!')
					alert(x)
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
	컴퓨터 종류 :
	<input id="com">
	<br> 컴퓨터 가격 :
	<input id="comPrice" type="number">
	<br> 마우스 종류 :
	<input id="mouse">
	<br> 마우스 가격 :
	<input id="mousePrice" type="number">
	<br>
	<input id="b2" type="button" value="컴퓨터 구매 항목 확인">
	<br>
	<hr color="gray">
	<div id="result"></div>
</body>
</html>