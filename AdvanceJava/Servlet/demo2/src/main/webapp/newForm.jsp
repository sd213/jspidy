<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="newform.css"/>
</head>
<body>
	<h1>New Form</h1>
	<form action="PrintData" method="post">
		<label for="fname">First Name : </label>
		<input type="text" name="fname">
		<label for="lname">Last Name : </label>
		<input type="text" name="lname">
		<label for="place">Place : </label>
		<input type="text" name="place">
		<label for="email">Email : </label>
		<input type="email" name="email">
		<label for="phonnum">PhoneNumber : </label>
		<input type="text" name="phonnum">
		<label for="setPass">New Password :</label>
		<input type="password" name="pass1">
		<label for="confirmPass">Confirm Password : </label>
		<input type="text" name="pass2">
	
		<input type="submit" value="SUBMIT" >
	</form>
</body>
</html>