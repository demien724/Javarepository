<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String won = request.getParameter("won");
	int process = Integer.parseInt(won);
	double result = process / 1234;
%><%=result%>