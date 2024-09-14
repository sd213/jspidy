<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form onsubmit="create" method="post">
		<label>ID :</label>
		<input type="text" name="id">
		<br>
		<br>
		<label>Name :</label>
		<input type="text" name="name">
		<br>
		<br>
		<label>Details : </label>
		<input type="text" name="details">
		<br>
		<br>
		<label>Catagory : </label>
		<input type="text" name="catagory">
		<br>
		<br>
		<label>Price :</label>
		<input type="text" name="price">
		<br>
		<br>
		<input type="submit" value="submitting">
	</form>
</body>
</html>