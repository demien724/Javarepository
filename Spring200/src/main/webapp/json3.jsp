<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json01 = new JSONObject();
	json01.put("morning", "rain");
	json01.put("afternoon", "rain");
	json01.put("night", "clody");
	
%><%= json01.toJSONString() %>