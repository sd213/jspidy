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
<table border='5' cellspacing="3px">
		<thead cellpadding="5px">
			<th>id</th>
			<th>name</th>
			<th>sal</th>
			<th>dept</th>
		</thead>
		<tbody cellpadding="5px">
<% ResultSet rs = (ResultSet)request.getAttribute("resultset");
	while(rs.next()){
%>
	<!-- h1>hello</h1> -->
	
			<tr cellpadding="5px">
				<td><%= rs.getInt(1) %></td>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getDouble(3) %></td>
				<td><%= rs.getInt(4) %></td>
			</tr>
		
<%} %>
</tbody>
	</table>
</body>
</html>