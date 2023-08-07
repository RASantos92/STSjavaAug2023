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
 <h1> Review Form </h1>
    <form action="/review/form/process" method="post">
    	<input type="hidden" name="userName" value="Mark"/>
        <div>
            <label> Movie </label>
            <input type="text" name="movie"/>
        </div>
        <div>
            <label> Comment </label>
            <textarea name="comment"></textarea>
        </div>
        <p><c:out value="${ratingError }"/></p>
        <div>
            <label> Rating </label>
            <input type="number" name="rating"/>
        </div>
            <input type="submit" value="submit review"/>
    </form>
</body>
</html>