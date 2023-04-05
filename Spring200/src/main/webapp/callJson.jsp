<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- content delivery network : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function(){
			$.ajax({
				url : "json.jsp",		// 파일 위치 확인
				dataType: "json",	// 해당 파일의 타입을 명시
				success : function(json){
					$('#result').append(json.id)
				}
			})
		})
		
		$('#b2').click(function(){
			$.ajax({
				url : "json2.jsp",
				datatype : "json",
				success : function(json){
					$('#result').append(json)
				}
			})
		})
		
		$('#b3').click(function(){
			$.ajax({
				url : "json3.jsp",
				datatype : "json",
				success : function(json){
					$('#result').append(json.afternoon)
				}
			})
		})
		
		$('#b4').click(function(){
			$.ajax({
				url : "json4.jsp",
				datatype : "json",
				success : function(json){
					$('#result').append(json)
				}
			})
		})
	})
</script>
<title></title>
</head>
<body>
	<button id="b1">JSON 받아오기</button>
	<button id="b2">JSON Array 받아오기</button>
	<button id="b3">JSON 날씨 받아오기</button>
	<button id="b4">JSON 주가 받아오기</button>
	
	<hr color="gray">
	
	<div id="result"></div>
</body>
</html>