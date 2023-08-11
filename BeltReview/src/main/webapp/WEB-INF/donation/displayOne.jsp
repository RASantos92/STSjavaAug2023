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
	<h1>Donation info</h1>
	<h2>Donation name: <c:out value="${donation.donationName }" /></h2>
	<h2>Donation quantity: <c:out value="${donation.quantity }" /></h2>
	<h2>Donor Name: <c:out value="${donation.donor.userName }" /></h2>
</body>
</html>