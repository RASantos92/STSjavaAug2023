<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/sytle.css"/>
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 class="styleTest" >JSTL demo</h1>
	<h1 class="text-success">Displaying Variables</h1>
	<p>${name}</p>
	<p><c:out value="${ageFromController}"/></p>
	<p>${isHungry}<p>
	<p><c:out value="${test}"/></p>
	
	
	<h1>if-statement</h1>
	<c:if test="${isHungry}">
		<p><c:out value="${name}"/> is hungry </p>
	</c:if>
	
	
	
	
    <h1>if-else statement</h1>
    	<c:choose>
    		<c:when test="${ageFromController < 21}">
    			<p><c:out value="${name}"/> is above 21 <p>
    		</c:when>
    		<c:otherwise >
    			<p><c:out value="${name}"/>  is under 21 </p>
    		</c:otherwise>
    	</c:choose>
    

    <h1>for each</h1>
    	<c:forEach var="user" items="${users}">
    		<p><c:out value="${user}"/></p>
    	</c:forEach>
    
   
    
    
</body>
</html>