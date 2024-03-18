<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	body
	{
	
	font-family:Arial,sans-serif;
	background-color:#f4f4f4;
	margin:0;
	padding:0;
	text-align:center;
	}
	
	p
	{
	font-size:18px;
	color:#4caf50;
	}
	
	.welcome-message{
	font-size:24px;
	font-weight:bold;
	margin-top:10px;
	}
	
</style>
</head>
<body>

<%@ page import="jspmvcdemo.LoginBean" %>
	<p>You are successfully logged in!</p>
	<% LoginBean bean=(LoginBean)request.getAttribute("bean");
	%>
		<div class="welcome-message">
	Welcome,<%=bean.getName() %>
</div>


</body>
</html>