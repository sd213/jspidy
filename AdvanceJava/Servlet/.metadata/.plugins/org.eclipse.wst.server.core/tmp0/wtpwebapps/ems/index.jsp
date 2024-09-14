<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./style0.css" >
<title>Insert title here</title>
</head>
<body>

	    <div class="formContainer">
            <form action="login" method="post">
                <div class="fieldset">
                      <label>Email  </label>
                      <label>:</label>
                      <input
                        type="email"
                        name="email"
                        placeholder="Enter User Email" required>
                    </div>
                <div class="fieldset">
                      <label>Password  </label>
                      <label>:</label>
                      <input
                        type="password"
                        name="passw"
                        placeholder="Enter Password" required>
            
                </div>
                    <input type="submit" value="submit" />
            </form>
            
    </div>
</body>
</html>