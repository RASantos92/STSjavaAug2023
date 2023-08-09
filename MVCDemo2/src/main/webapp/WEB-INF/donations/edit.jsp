<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/donations/process/edit/m/${donation.id}" method="patch" modelAttribute="donation">
	
    <div class="form-group">
        <label>Donation Name</label>
        <form:input type="text" path="donationName" class="form-control" />
        <form:errors path="donationName"/>
    </div>
    <div class="form-group">
        <label>Quantity</label>
        <form:input type="number" path="quantity" class="form-control" />
        <form:errors path="quantity"/>
    </div>
    <div class="form-group">
        <label>Donor</label>
        <form:input type="text" path="donor" class="form-control" />
        <form:errors path="donor"/>
    </div>
    <input type="submit" value="Update Donation" class="btn btn-primary" />
</form:form>
</body>
</html>