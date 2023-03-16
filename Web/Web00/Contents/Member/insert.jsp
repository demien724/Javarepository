<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- JSP임을 알려주는 코드, 절대 건드리지 말아야합니다. -->
    <!-- 브라우저가 보낸 데이터를 받아야 함 >> JAVA로 짜야합니다. -->
    <!-- 브러우저가 보낸 데이터를 받아야하는 부품이 필요함 -->
    
    <%
    // JAVA Code 넣는 부분
   	// HttpServletRequest request = new HttpServletRequest();
    // tomcat은 미리 request를 만들어서 내장시켜놨음
   	String id = request.getParameter("id");    
   	String pw = request.getParameter("pw");    
   	String name = request.getParameter("name");    
   	String tel = request.getParameter("tel");    
    
    MemberVO vo =new MemberVO();
    
    vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setTel(tel);
    
	MemberDAO3 dao = new MemberDAO3();
	
	dao.insert(vo);
	
	
    %>
    
    <!-- 브라우저에게 결과를 알려주기 위한 HTML코드가 미리 들어가있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	회원가입 요청되었음. <br>
		
	가입한 id : <%= id %> <br>
	가입한 pw : <%= pw %> <br>
	가입한 name : <%= name %> <br>
	가입한 tel : <%= tel %>	<br>
	
</body>
</html>