<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./style1.css">
</head>
<body>
	<h1 style="text-align:center">Home Page</h1>
	<div class="formContainer">
		<div class="container">
			<a href="CreateEmp.jsp" class="addEmp"><button class="operations create">Add Employee</button></a>
        <div class="tableContainer">
        	<table cellspacing="3px" cellpadding="50px" style="border-collapse: collapse;">
        	<thead>
                <tr>
                	<th>ID</th>
                	<th>NAME</th>
                	<th>EMAIL</th>
                	<th>PASSWORD</th>
                	<th>DEPTID</th>
                	<th>SAL</th>
                	<th colspan="2">Operations</th>
               		</tr>
            </thead>
            <tbody>
            	<% 
            		ResultSet rs = (ResultSet) request.getAttribute("resultset");
            		while(rs.next()){
            	%>
                	<tr>
						<td><%= rs.getInt(1) %></td>
						<td><%= rs.getString(2) %></td>
						<td><%= rs.getString(3) %></td>
						<td><%= rs.getString(4) %></td>
						<td><%= rs.getInt(5) %></td>
						<td><%= rs.getDouble(6) %></td>
						<td><a href="DELETE?id=<%= rs.getInt(1) %>" ><button class="operations delete">DELETE</button></a></td>
						<td><a href="UPDATE?id=<%= rs.getInt(1) %>" ><button class="operations update">UPDATE</button></a></td>
					</tr>
		
				<%} %>
            </tbody>
        </table>
        </div>
		</div>
    </div>
    
</body>
</html>