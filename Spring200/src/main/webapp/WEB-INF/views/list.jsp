<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${list }" var="bag">
	${bag.id }, ${bag.pw } ${bag.name }, ${bag.tel } <br>
</c:forEach>