<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="text-align:center;">
		<tr>
			<th>고유 ID</th>
			<th>음악 이름</th>
			<th>가수 이름</th>
			<th>장르</th>
			<th>앨범</th>
		</tr>
		<tr>
			<td>${result.id}</td>
			<td>${result.name}</td>
			<td>${result.singer}</td>
			<td>${result.genre}</td>
			<td>${result.album}</td>
		</tr>
	</table>

</body>
</html>