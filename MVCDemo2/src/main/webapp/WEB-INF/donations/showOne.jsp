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
	<h1>Donation: <c:out value="${oneDonation.donationName}"/></h1>
    <h4>Quantity: <c:out value="${oneDonation.quantity}"/></h4>
    <h4>Donor: <c:out value="${oneDonation.donor}"/></h4>
    <h4>Created at: <c:out value="${oneDonation.createdAt}"/></h4>
</body>
</html>