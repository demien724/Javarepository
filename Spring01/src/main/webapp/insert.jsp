<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    /* 
		1. 브라우저에서 넘어오는 값 서버에서 받습니다.
			넘어오는 값 제어해주는 코드(자바코드)
			Controller(자바코드)
    */
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name =  request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	/* 
				    	
    	*/
    	
    	/* 
    		2. DAO에 데이터값을 주면서 Insert 요청
    		DAO(JDBC단계에 의해 코딩이 됨. 항상 방법은 같다)
    		Model(자바코드)

    		3. 결과를 HTML에 담아서 클라이언트로 전송
    		보여주는 부분(HTML)
    		View(Html)
    		
    		*/		
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	사용자 ID <%= id %>	<br>
	사용자 Password <%= pw %> <br>
	사용자 실명 <%= name %> <br>
	사용자 전화번호 <%= tel %> <br>
</body>
</html>