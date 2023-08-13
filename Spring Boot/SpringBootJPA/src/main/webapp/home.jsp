<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<form action="addUser">
		<input type="text" name="username" placeholder="Enter username"><br>
		<input type="text" name="tech" placeholder="Enter tech"><br>
		<input type="submit" value="submit">
	</form><br><br>
	<form action="getUser">
		<input type="text" name="id" placeholder="Enter id to fetch data.."><br>
		<input type="submit" value="submit">
	</form><br>
	<form action="getUsers">
		<input type="submit" value="get all users">
	</form>
</body>
</html>