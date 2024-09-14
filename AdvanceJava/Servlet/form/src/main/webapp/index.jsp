<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<div class="root">
		<nav>
			<a href="./table.jsp">helloWorld</a>
		</nav>
		<h1>Welcome admin</h1>
		
		<form>
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="phonenumber">Phone Number</label>
            <input type="tel" id="phonenumber" name="phonenumber" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="id">ID</label>
            <input type="text" id="id" name="id" required>
        </div>
        <div class="form-group">
            <label for="age">Age</label>
            <input type="number" id="age" name="age" required>
        </div>
        <div class="form-group">
            <button type="submit">Submit</button>
        </div>
    </form>
	</div>
</body>
</html>