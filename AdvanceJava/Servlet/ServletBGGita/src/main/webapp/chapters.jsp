<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bhagbat Gita</title>
    <link rel="stylesheet" href="style2.css">
</head>

<body>
    <h1 class="btname">Bhagbat Gita</h1>
    <!-- <a href="chapters.jsp" class="" >Chapter 1</a> -->
    <form action="chaps"  class="btns" method="get">
    	<h3>Chapters</h3>
        <button name="chapterwise" value="chapter1">Chapter 1</button>
        <button name="chapterwise" value="chapter2">Chapter 2</button>
        <button name="chapterwise" value="chapter3">Chapter 3</button>
        <button name="chapterwise" value="chapter4">Chapter 4</button>
        <button name="chapterwise" value="chapter5">Chapter 5</button>
        <button name="chapterwise" value="chapter6">Chapter 6</button>
        <button name="chapterwise" value="chapter7">Chapter 7</button>
        <button name="chapterwise" value="chapter8">Chapter 8</button>
        <button name="chapterwise" value="chapter9">Chapter 9</button>
        <button name="chapterwise" value="chapter10">Chapter 10</button>
        <button name="chapterwise" value="chapter11">Chapter 11</button>
        <button name="chapterwise" value="chapter12">Chapter 12</button>
        <button name="chapterwise" value="chapter13">Chapter 13</button>
        <button name="chapterwise" value="chapter14">Chapter 14</button>
        <button name="chapterwise" value="chapter15">Chapter 15</button>
        <button name="chapterwise" value="chapter16">Chapter 16</button>
        <button name="chapterwise" value="chapter17">Chapter 17</button>
        <button name="chapterwise" value="chapter18">Chapter 18</button>
    </form>
    
    	
    <div class="btns">
    	
        <%
			ResultSet rs = (ResultSet)request.getAttribute("resultset");
			if(rs!=null){
		%>
				<h3><%=  "Verses" %></h3>
		<%		
				
				while(rs.next()){
		%>		
				<form action="vers">
			    <input type="hidden" name="chapterwise" value=<%=rs.getInt(2)%>>
				<button name="versewise" value=<%=rs.getInt(1)%> >Verse <%= rs.getInt(1)%></button>
				</form>
		<%		
			}
		}
		%>
		
    </div>
    
    <div class="btns">
    	<%
			rs = (ResultSet)request.getAttribute("res");
			if(rs!=null){
		%>
		<%		
				while(rs.next()){
		%>		
		 	<h3><%=rs.getString(1)%></h3>
		 	<%-- <h3><%=rs.getString(2)%></h3> --%>
		 	<%-- <h3><%=rs.getString(3)%></h3> --%>
		<%		
			}
		}
		%>
    
    </div>
</body>

</html>