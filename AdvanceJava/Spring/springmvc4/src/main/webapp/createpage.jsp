<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Page</title>
</head>
<body>
	<h2>${msg}</h2>
    <h1>Create Page</h1>
	<form action="save" method="post">
	
		<label>Name :</label><input type="text" name = "name" placeholder="Enter Name"><br>
		<label>Email :</label><input type="email" name="email" placeholder="Enter Email"><br>
		
		<label>Phone :</label><input type="tel" name="phone" placeholder="Enter PhoneNumber"><br>
		<label>Password :</label><input type="text" name ="password" placeholder="Enter Password"><br>
		<button type="submit">Save</button>
	</form>
</body>
</html>