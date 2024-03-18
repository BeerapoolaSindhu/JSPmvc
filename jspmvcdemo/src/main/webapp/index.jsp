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
	}

	form
	{
	background-color:#fff;
	padding:20px;
	width:300px;
	font-size:20px;
	}
	
	input
	{
	width:100%;
	padding:10px;
	margin-bottom:15px;
	}
	
	input[type="submit"]
	{
	background-color:#4caf50;
	color:white;
	cursor:pointer;
	}

	input[type="submit"]:hover
	{
	background-color:#45a049;
	}
</style>
</head>
<body>

<form action="ControllerServlet" method="post">
Name:<input type="text" name="name"><br>
Password:<input type="password" name="password"><br>
<input type="submit" value="login">

</form>

</body>
</html>