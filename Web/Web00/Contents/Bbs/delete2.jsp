<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    
    BbsDAO dao = new BbsDAO();
    
   	String no = request.getParameter("no");      
   	
   	dao.delete(Integer.parseInt(no));
   	
   	
    
    %>
    
    <!-- 브라우저에게 결과를 알려주기 위한 HTML코드가 미리 들어가있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete documents here</title>

</head>
<body>
		글 삭제가 처리 되었습니다 <%= no %><br>
</body>
</html>