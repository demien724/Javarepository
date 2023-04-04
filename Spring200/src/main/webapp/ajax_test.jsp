<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()

			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				}
			}) // Ajax
		}) // button 01

		
		$('#b2').click(function() {
			$('#result').empty()

			$.ajax({
				url : "list6",
				data : {
					bbsno : 2
				},
				success : function(x) {
					$('#result').append(x)
				}
			}) // Ajax
		}) // button 02

		
		$('#b3').click(function() {
			$('#result').empty()

			$.ajax({
				url : "list6",
				data : {
					bbsno : 20
				},
				success : function(x) {
					$('#result').append(x)
				}
			}) // Ajax
		}) // button 02

		
		$('#b4').click(function() {
			$('#result').empty()

			$.ajax({
				url : "one5",
				data : {
					id : "apple2"
				},
				success : function(x) {
					$('#result').append(x)
				}
			}) // Ajax
		}) // button 04

		
		$('#b5').click(function() {
			$('#result').empty()

			$.ajax({
				url : "one6",
				data : {
					no : 2
				},
				success : function(x) {
					$('#result').append(x)
				}
			}) // Ajax
		}) // button 04

		
		$('#b6').click(function() {
			$('#result').empty()

			$.ajax({
				url : "list",
				success : function(x) {
					$('#result').append(x)
				}
			}) // Ajax
		}) // button 04

	}) // Document
</script>
<title>Ajax Test</title>
</head>
<body>
	<button id="b1">BBS 리스트 가지고 오기</button>
	<button id="b2">BBS번호 2번 Reply리스트 가지고오기</button>
	<button id="b3">BBS번호 20번 Reply리스트 가지고오기</button>
	<button id="b4">Member Id 가 apple2의 정보 가지고오기</button>
	<button id="b5">BBS번호 2번 게시물의 상세 정보 가지고 오기</button>
	<button id="b6">Meber의 모든 리스트 가지고 오기</button>
	<hr color="gray">
	<div id="result"></div>
</body>
</html>