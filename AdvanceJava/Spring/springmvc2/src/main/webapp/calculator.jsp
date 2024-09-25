<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator Page</title>
</head>
<body>
	
	<h1>Sample Calculator</h1>
	<fieldset>
		<legend>Addition</legend>
		<form action="addition" method="post">
	
		<label>Num1</label>
		<input type="number" name="num1" placeholder="Enter Number 1 ">
		<br>
		<label>Num2</label>
		<input type="number" name="num2" placeholder="Enter Number 2 ">
		<br>
		<button type="submit">add</button>
	</form>
	</fieldset>
	<fieldset>
		<legend>multiplication</legend>
		<form action="multiply" method="post">
	
		<label>Num1</label>
		<input type="number" name="num1" placeholder="Enter Number 1 ">
		<br>
		<label>Num2</label>
		<input type="number" name="num2" placeholder="Enter Number 2 ">
		<br>
		<button type="submit">multiply</button>
	</form>
	</fieldset>
	
	<fieldset>
		<legend>Substract</legend>
		<form action="substract" method="post">
	
		<label>Num1</label>
		<input type="number" name="num1" placeholder="Enter Number 1 ">
		<br>
		<label>Num2</label>
		<input type="number" name="num2" placeholder="Enter Number 2 ">
		<br>
		<button type="submit">substract</button>
	</form>
	</fieldset>
	
	<fieldset>
		<legend>Division</legend>
		<form action="divide" method="post">
	
		<label>Num1</label>
		<input type="number" name="num1" placeholder="Enter Number 1 ">
		<br>
		<label>Num2</label>
		<input type="number" name="num2" placeholder="Enter Number 2 ">
		<br>
		<button type="submit">divide</button>
		
	</form>
	
	</fieldset>
	<h1 style="text-align:center">${operation} is ${total}</h1>
</body>
</html>