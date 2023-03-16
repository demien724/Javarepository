<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--     <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
 --%>
 
	<% 
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	String price = request.getParameter("price");
	String company = request.getParameter("company");
	String img= request.getParameter("img");

	ProductDAO dao = new ProductDAO();
	ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(Integer.parseInt(price));
	bag.setCompany(company);
	bag.setImg(img);
	
	dao.insert(bag);
	
    %>
    
    <!-- 브라우저에게 결과를 알려주기 위한 HTML코드가 미리 들어가있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	상품 등록 완료 <br>
	
	ID : <%= id %>;	<br>
	Iamge : <%= bag.getImg().toString() %>
	<img src="/web00/WebContent/Image/<%= bag.getImg() %>"   width=200  height=200>
	
</body>
</html>