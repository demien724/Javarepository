<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  computer호출했을 때 결과담는 곳!
-->
<table border=1>
<tr>
	<td>항목명</td>
	<td>가격</td>
</tr>
<tr>
	<td>${vo.com}</td>
	<td>${vo.comPrice}</td>
</tr>
<tr>
	<td>${vo.mouse }</td>
	<td>${vo.mousePrice}</td>
</tr>
<tr>
	<td>총 합계</td>
	<td>${vo.sum }</td>
</tr>
</table>