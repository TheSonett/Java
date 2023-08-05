<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="DemoServlet">
		<input type=submit value="click">
	</form>
	
	Hello ${name} <br>
	
	<br>
	<core:forEach items="${students}" var="s">
		${s} <br>
	</core:forEach>
	<br>
	
	<form action="IDServlet">
		Enter ID: <input type="text" name="id"><br>
		Enter Name: <input type="text" name="name"><br>
		<input type="submit" value="click">
	</form>
	

</body>
</html>