<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/game/create/genre" method="post" modelAttribute="game">
		<form:input type="text" path="title"/>
		<form:input type="text" path="formGenres"/>
		<input type="submit" value="add game with genres"/>
	</form:form>

</body>
</html>