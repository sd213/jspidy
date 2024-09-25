<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World</h1>
	<a href="hi">hi</a>
	<br>
	<br>
	<hr>
	<br>
	<form action="print">
		<input type="text" name="name" placeholder="Enter Name">
		<input type="text" name="place" placeholder="Enter Place">
		<button type="submit">Print</button>
	</form>
	<br>
	<br>
	<hr>
	<form action="print2">
		<input type="text" name="name" placeholder="Enter Name">
		<input type="text" name="email" placeholder ="Enter Email">
		<input type="number" name="phonenum" placeholder="Enter PhoneNumber">
		<input type="text" name="place" placeholder="Enter Place">
		<input type="password" name="passw" placeholder="Enter Password">
		
		<button type="submit">Print</button>
	</form>
	<br>
	<br>
	<a href="calculator"><button>Calculator</button></a>
</body>
</html>