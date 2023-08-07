<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/search">
		<h1>
			Search:
			<input type="text" name="keyword"/>
		</h1>
		<input type="submit" value="Search"/>
	</form>
	
	<h1>You searched for <c:out value="${searched}"/> </h1>
</body>
</html>