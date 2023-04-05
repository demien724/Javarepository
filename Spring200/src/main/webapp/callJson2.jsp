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
				url : "json1",		// 파일 위치 확인
				dataType: "json",	// 해당 파일의 타입을 명시
				success : function(json){
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					$('#result').append(id + ', ' + pw + ', ' + name + ', ' + tel)
				}
			})
		})
		
		$('#b11').click(function(){
			$.ajax({
				url : "json1",		// 파일 위치 확인
				dataType: "json",	// 해당 파일의 타입을 명시
				success : function(json){
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
					
					$('#result').append(table)
				}
			})
		})
		
		$('#b111').click(function(){
			$.ajax({
				url : "json1",		// 파일 위치 확인
				dataType: "json",	// 해당 파일의 타입을 명시
				success : function(json){
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					
					table = "<table style='text-align : center; color:red'><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
					
					$('#result').append(table)
				}
			})
		}) // Button 111
		
		$('#b2').click(function(){
			$.ajax({
				url : "json2",
				datatype : "json",
				success : function(json){
					$('#result').empty()
					// ArrayList 이기 때문에 Index는 0 에서 시작합니다.
					$('#result').append(json[1].id + json[1].name)
					
				}
			})
		})
		
		$('#b3').click(function(){
			$.ajax({
				url : "json3",
				datatype : "json",
				success : function(json){
					table = "<table><tr><td>" + json.id + "</td></tr>"
						+ "<tr><td>" + json.pw + "</td></tr>"
						+ "<tr><td>" + json.name + "</td></tr>"
						+ "<tr><td>" + json.tel + "</td></tr></table>"
					$('#result').append(table)
				}
			})
		})
		
		
		
		$('#b4').click(function(){
			$.ajax({
				url : "json4",
				datatype : "json",
				success : function(json){
					$('#result').empty();
					$('#result').append(json[0].id + " " + json[1].id + "<br>") 
					$('#result').append(json[0].pw + " " + json[1].pw  + "<br>")
					$('#result').append(json[0].name + " " + json[1].name  + "<br>")
					$('#result').append(json[0].tel + " " + json[1].tel + "<br>")
				}
			})
		})
	})
</script>
<title></title>
</head>
<body>
	<button id="b1">컨트롤러에서 JSON 받아오기</button>
	<button id="b11">컨트롤러에서 JSON 테이블로 받아오기</button>
	<button id="b111">컨트롤러에서 JSON 테이블로 받아오기 2</button>
	<button id="b2">컨트롤러에서 JSON Array 받아오기</button>
	
	<hr color="blue">
	<button id="b3">컨트롤러에서 JSON 임의로 정한 값 받아오기</button>
	<button id="b4">컨트롤러에서 JSON 임의로 정한 값들 ArrayList로 받아오기</button>
	
	<hr color="gray">
	
	<div id="result"></div>
</body>
</html>