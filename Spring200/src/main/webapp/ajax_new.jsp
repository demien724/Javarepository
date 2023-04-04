<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "list2",
			success : function(x) {
				$('#result').append(x)
			} // Success
		}) // Result Ajax

		$('#b1').click(function() {
			var1 = $('#no').val()
			var2 = $('#content').val()
		
			$.ajax({
				url : 'update3.multi',
				data : {
					no : var1,
					content : var2
				},
				success : function() {
					$('#result').empty()
					$.ajax({
						url : "list2",
						success : function(x) {
							$('#result').append(x)
						} // Success
					}) // Result Ajax
				}
			}) // Button 01 Ajax
		}) // Button 01
		
		$('#b2').click(function() {
			var1 = $('#no2').val()

			$.ajax({
				url : 'delete2.multi',
				data : {
					no : var1
				},
				success : function() {
					$('#result').empty()
					$.ajax({
						url : "list2",
						success : function(x) {
							$('#result').append(x)
						} 
					}) // Result Ajax
				} // Success
			}) // Button 01 Ajax
		}) // Button 01
		
		
		$('#b3').click(function(){
			$.ajax({
				crossOrigin: true,
				url : 'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=1783c4cf9a32bd64c7f9a90190501b5f',
				datatype : 'json',
				success : function(x){
					$('#result').empty()
					
					console.log(x);
					$('#result').html("위치"+x.name+"<br>"+
							"날씨"+x.weather[0].description+"<br>"+
							"풍속"+x.wind.speed+"<br>"+
							"최고 기온"+x.main.temp_max+"<br>"+
							"최저 기온"+x.main.temp_min+"<br>"+
							"체감 온도"+x.main.feels_like+"<br>"+
							"구름"+x.clouds.all+"<br>")
				}
			})
		})
	}) // Function
	
</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="result"></div>
	<hr color="gray">
	내용 수정
	<br> 번호
	<input type="number" id="no">
	<br> 내용
	<input type="text" id="content">
	<br>
	<button id="b1" type="submit">업데이트</button>

	<hr>
	내용 삭제
	<br> 번호
	<input type="number" id="no2">
	<br>
	<button id="b2" type="submit">삭제</button>
	
	<hr>
	<button id="b3">날씨</button>

</body>
</html>