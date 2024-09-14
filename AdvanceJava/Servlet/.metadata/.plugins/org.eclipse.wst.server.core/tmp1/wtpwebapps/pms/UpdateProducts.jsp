<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		ResultSet rs = (ResultSet) request.getAttribute("rset");
		if(rs!=null){
			while(rs.next()){
	%>
	<form onsubmit="update" method="post">
		<!-- <label>ID :</label> -->
		<input type="hidden" name="id" value="<%=rs.getInt(1) %>">
		<br>
		<br>
		<label>Name :</label>
		<input type="text" name="name" value="<%=rs.getString(2) %>">
		<br>
		<br>
		<label>Details : </label>
		<input type="text" name="details" value="<%=rs.getString(3)%>">
		<br>
		<br>
		<label>Catagory : </label>
		<input type="text" name="catagory" value="<%= rs.getString(4)%>">
		<br>
		<br>
		<label>Price :</label>
		<input type="text" name="price" value="<%= rs.getDouble(5)%>">
		<br>
		<br>
		<input type="submit" value="submitting">
	</form>
	<%}
	} %>
</body>
</html>