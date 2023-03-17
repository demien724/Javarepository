<%@page import="multi.SongDAO"%>
<%@page import="multi.SongVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.SongVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />

<%
	SongDAO DAO = new SongDAO();
int result = DAO.update(bag);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>곡 ID</td>
			<td>곡 이름</td>
			<td>가수</td>
			<td>장르</td>
			<td>이미지</td>
			<td>
				<input name="id">
			</td>
		</tr>
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getName()%></td>
			<td><%=bag.getSinger()%></td>
			<td><%=bag.getGerne()%>
			<td>
				<img src="/web00/Image/<%=bag.getAlbum()%>">
			</td>
		</tr>


	</table>
</body>
</html>