<%@page import="multi.SongVO"%>
<%@page import="multi.SongDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="bag" class="multi.SongVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />

<%
	SongDAO DAO = new SongDAO();
	int result = DAO.insert(bag);
%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css"> img{width: 200px; height :  200px; }"</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>이름</td>
			<td>가수</td>
			<td>장르</td>
			<td>커버</td>
		<tr>
			<%
				if ( result == 1) {
			%>
		
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getName()%></td>
			<td><%=bag.getSinger()%></td>
			<td><%=bag.getGerne()%></td>
			<td>
				<img src="/web00/Image/<%= bag.getAlbum() %>">
			</td>
		</tr>
		<%
			} else {
		%>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>