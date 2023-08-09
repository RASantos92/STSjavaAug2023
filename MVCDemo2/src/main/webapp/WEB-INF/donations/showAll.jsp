<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="/donations" method="post" modelAttribute="donation">
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
    <input type="submit" value="Add Donation" class="btn btn-primary" />
</form:form>

<form action="/dashboard" >
	<input type="search" name="search"/>
	<input type="submit" value="Search"/>
</form>
<table>
	<thead> 
        <tr> 
            <th> Donation </th>
            <th> Quantity </th>
            <th> Donor </th>
            <th> actions </th>
        </tr>
    </thead>
	<tbody>
		<c:forEach var="donation" items="${allDonations}">
			<tr>
                <td><a href="/donations/${donation.id}"><c:out value="${donation.donationName}"/></a></td>
                <td><c:out value="${donation.quantity}"/></td>
                <td><c:out value="${donation.donor}"/></td>
                <td>
                <form action="/donations/${donation.id}" method="post">
                	<input type="hidden" name="_method" value="delete"/>
                	<input type="submit" value="Delete"/>
                	
                </form>
                </td>
            </tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>