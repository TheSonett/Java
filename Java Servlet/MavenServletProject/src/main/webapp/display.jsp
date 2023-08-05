<%@page import="com.alien.models.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgColor="cyan">
	<% 
		Alien alien = (Alien) session.getAttribute("alien");
		out.println(alien);
	%>
</body>
</html>