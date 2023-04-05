<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://dapi.kakao.com/v2/maps/sdk.js?appkey=9dfbfbc8086831f6947caac052425234"></script>
 <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#b1').click(function(){
			no = $('#vo-no').val()
			
			$.ajax({
				url : "jsonResponse3",
				data : {
					no : no
				},
				dataType : "json",
				success : function(json){
					result = "<table><tr>"
			 	+	"<td>번호</td> <td>제목</td> <td>내용</td> <td>글쓴이</td> </tr>"			 	
				+	"<tr><td>" + json.no + "</td>"
				+	"<td>" + json.title + "</td>"
				+	"<td>" + json.content + "</td>"
				+	"<td>" + json.writer + "</td></tr></table>"
				
					$('#result').append(result)
				}	// success							
			}) // Ajax
		})	// Button 01
		
		$('#b2').click(function(){
			$.ajax({
				url : "jsonResponse4",
				dataType : "json",
				success : function(json){
					$('#result').empty()	// result 값들 제거
					
					result = "<ul>"
					
					for (var i = 0; i < json.length; i++) {
						result += "<li>"
						
						result += json[i].no + ", " + json[i].title + ", " + json[i].content + ", "  + json[i].writer
						
						result += "</li>"
					}
					
					result += "</ul>"
					
					$('#result').append(result)
				}	// success							
			}) // Ajax
		})	// Button 02
		
		$('#b3').click(function(){
			$.ajax({
				url : "jsonResponse4",
				dataType : "json",
				success : function(json){
					$('#result').empty()	// result 값들 제거
					
					result = "<table>"
					for (var i = 0; i < json.length; i++) {
						result += "<tr>"			
						result += "<td>" + json[i].no + "</td>"
						result += "<td>" + json[i].title + "</td>"
						result += "<td>" + json[i].content + "</td>"
						result += "<td>" + json[i].writer + "</td>"
						result += "</tr>"
					}
					result += "</table>"
					
					$('#result').append(result)
				}	// success							
			}) // Ajax
		})	// Button 03
		
		// 좌표 이동
		$('#b4').click(function(){
			$.ajax({
				url : "jsonResponse5",
				dataType : "json",
				success : function(json){
					lat = json.lat
					lon = json.lon
					
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
				    mapOption = { 
				        center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
				        level: 3 // 지도의 확대 레벨
				    };
	
					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
	
					var markerPosition = new kakao.maps.LatLng(lat,lon)
					
					var marker = new kakao.maps.Marker({
						position : markerPosition
					})
					
					marker.setMap(map)
					
				}	// success					
			}) // Ajax
		})	// Button 04
		
		$('#b5').click(function(){
			count = $('#things-to-do').val()
			
			$('#count').empty()
			for (var i = 0; i < count; i++) {
				
				$('#count').append(( i+1) + "번째로 하고싶은 할 일 <input type='text'"+  +"></input><br>")
			}
		})	// Button 05
		
		
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판 번호 임력
	<input type="number" id="vo-no">
	<button id="b1">출력</button>
	<br>

	<button id="b2">게시판 가지고오기(리스트)</button>
	<button id="b3">게시판 가지고오기(테이블)</button>
	<br>
	<hr color="gray">
	<button id="b4">지도</button>
	<button id="b5">하고 싶은 일 개수</button>
	<input type="number" id="things-to-do">
	<div id="count"></div>

	<hr color="gray">
	<div id="result"></div>
	<div id="map" style="width:100%;height : 350px;"></div>


</body>
</html>