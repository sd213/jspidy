<%@page import="java.sql.ResultSet"%>
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
	<% ResultSet rs = (ResultSet) request.getAttribute("resultset");
		if(rs!=null){
			if(rs.next()){
	%>			
		
	<div class="formContainer">
		<div class="container">
		<form action="UPDATE" method="post">
				<div class="fieldset">
                      <label>id  </label>
                      <label>:</label>
                      <input
                        type="number"
                        name="id"
                        min="0"
                        value=<%= rs.getInt(1) %>
                        placeholder="Enter User id " required>
                </div>
                <div class="fieldset">
                      <label>Name  </label>
                      <label>:</label>
                      <input
                        type="text"
                        name="name"
                        value=<%= rs.getString(2) %>
                        placeholder= "Enter Name " required>
                </div>
                
                <div class="fieldset">
                      <label>Dept.id  </label>
                      <label>:</label>
                      <input
                        type="number"
                        name="deptid"
                        min="0"
                    	value=<%= rs.getInt(5) %>
                        placeholder= "Enter Dept.ID " required>
                </div>
                <div class="fieldset">
                      <label>salary </label>
                      <label>:</label>
                      <input
                        type="text"
                        name="sal"
                        value = <%= rs.getDouble(6) %>
                        placeholder="Enter Salary " required>
                </div>
                <div class="fieldset">
                      <label>Email  </label>
                      <label>:</label>
                      <input
                        type="email"
                        name="email"
                        value=<%= rs.getString(3) %>
                        placeholder= "Enter Email "  required>
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
	<%   }
		}
	%>
</body>
</html>