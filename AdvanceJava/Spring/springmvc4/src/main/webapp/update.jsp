<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${msg}</h2>
    <h1>Update Page</h1>
	<form action="update?id=${id}" method="post">
		<label>ID : </label>${id}
		<br>
		<label>Name :</label><input type="text" name = "name" placeholder="Enter Name" value=${name}><br>
		<label>Email :</label><input type="email" name="email" placeholder="Enter Email" value=${email}><br>
		
		<label>Phone :</label><input type="tel" name="phone" placeholder="Enter PhoneNumber" value=${phone}><br>
		<label>Password :</label><input type="password" name ="password1" placeholder="Enter Password"><br>
		<label>Confirm Password :</label><input type="text" name ="password2" placeholder="Enter Password"><br>
		
		<button type="submit">Update</button>
	</form>
</body>
</html>