<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	table{
		margin:auto;
		font-size:30px;
		border-collapse:collapse;
		padding:30px;
	}
	body form{
		text-align:center
	}
	body form input{
		padding:10px 15px;
	}
	
</style>
</head>
<body>
	<h1>All Users :- </h1>
	<h1 id="msg">${msg}</h1>
	<h6>${users }`1</h6>
	<form action="search" >
		<input type="text" name="searchQuery" placeholder="Type Here to see">
		<input type="submit" value="Search">
	</form>
	<table border='3' style='border-collapse:collapse'>
		<thead>
			<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Password</th>
			<th colspan="2">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="u" items="${users}">
			<tr>
				<td>${u.getId() }</td>
				<td>${u.getName() }</td>
				<td>${u.getEmail() } </td>
				<td> ${u.getPhone() } </td>
				<td> ${u.getPassword() } </td>
				<td><a href="updatepage?id=${u.getId() }"><button>Update</button></a></td>
				<td><a href="delete?id=${u.getId() }"><button>Delete</button></a></td>
				
			</tr>
			</c:forEach> 
		
		</tbody>
		<a href="index.jsp"><button><= Go back </button></a>
	</table>
	<script type="text/javascript">
		const el = document.getElementById("msg");
		console.log(el);
		setTimeout(() => {
			el.style.display="none";
		}, 3000);
	</script>
</body>
</html>