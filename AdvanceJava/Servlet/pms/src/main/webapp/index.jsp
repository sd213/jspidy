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
	
	<a href="viewAll"><button>View All Products</button></a>
	<a href="create"><button>Insert Products</button></a>
<!-- 	<a href="update"><button>Update</button></a>
	<a href="delete"><button>Delete</button></a> -->

	<% 
		ResultSet rs = (ResultSet) request.getAttribute("rset");
		if(rs!=null){
	%>
			<table border=2>
				<thead>
					<th>ID</th>
					<th>Name</th>
					<th>Details</th>
					<th>Catagory</th>
					<th>Price</th>
					<th colspan="2">Operations</th>
				</thead>
				<tbody>
		<%
			while(rs.next()){
				
		%>
				<tr>
					<td><%=rs.getInt(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td>
					<td><%=rs.getDouble(5) %></td>
					<td><a href="update?id=<%=rs.getInt(1)%>"><button>Update</button></a></td>
					<td><a href="delete?id=<%=rs.getInt(1)%>"><button>Delete</button></a></td>
				</tr>
		<%
			}
		%>
			</tbody>
		</table>
	<%
		}
	%>
</body>
</html>