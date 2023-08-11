<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Donation</h1>
	<form:form action="/donations/${donation.id}" method="patch" modelAttribute="donation">
	<form:hidden path="donor"/>
    <div class="form-group">
        <label>Donation Name</label>
        <form:input path="donationName" class="form-control" />
        <form:errors path="donationName" class="text-danger" />
    </div>
    <div class="form-group">
        <label>Quantity</label>
        <form:input path="quantity" class="form-control" />
        <form:errors path="quantity" class="text-danger" />
    </div>
    <input type="submit" value="Edit Donation" class="btn btn-primary" />
</form:form>
</body>
</html>