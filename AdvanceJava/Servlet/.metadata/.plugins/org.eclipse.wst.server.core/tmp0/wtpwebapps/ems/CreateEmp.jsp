<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./style0.css">
<link rel="stylesheet" href="./style2.css">
</head>
<body>
	<h1 style="text-align:center">Employee Form</h1>
	<div class="formContainer">
		<div class="container">
		<form action="insert" method="post">
				<div class="fieldset">
                      <label>id  </label>
                      <label>:</label>
                      <input
                        type="number"
                        name="id"
                        min="0"
                        placeholder="Enter User id" required>
                </div>
                <div class="fieldset">
                      <label>Name  </label>
                      <label>:</label>
                      <input
                        type="text"
                        name="name"
                        placeholder="Enter User Name" required>
                </div>
                
                <div class="fieldset">
                      <label>Dept.id  </label>
                      <label>:</label>
                      <input
                        type="number"
                        name="deptid"
                        min="0"
                    
                        placeholder="Enter Dept id" required>
                </div>
                <div class="fieldset">
                      <label>salary </label>
                      <label>:</label>
                      <input
                        type="text"
                        name="sal"
                        placeholder="Enter User Salary" required>
                </div>
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
                        name="pass"
                        placeholder="Enter User password" required>
                </div>
                <div class="fieldset">
                      <label>Confirm Password  </label>
                      <label>:</label>
                      <input
                        type="text"
                        name="passw"
                        placeholder="Enter Confirm Password" required>
            
                </div>
                    <input type="submit" value="Register" />
            </form>
            </div>
	</div>
</body>
</html>