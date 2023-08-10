<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
<body>
    <h1>Dashboard</h1>
    <a href="/users/create">Create User</a>
    <a href="/donations/create">Add Donation</a>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Donation name</th>
      <th scope="col">Quantity</th>
      <th scope="col">Donor name</th>
      <th scope="col">action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allDonations}" var="donation">
    <tr>
			<td><c:out value="${donation.id}"/></td>
			<td><c:out value="${donation.donationName}"/></td>
			<td><c:out value="${donation.quantity}"/></td>
			<td><c:out value="${donation.donor.userName}"/></td>
			<td>
				<a href="/donations/edit/m/${donation.id}" class="btn btn-outline-warning">Edit</a>
				
				<form action="/donations/${donation.id}" method="post" >
					<input type="hidden" value="delete" name="_method"/>
					<input type="submit" value="delete" class="btn btn-outline-danger"/>
				</form>
				
			</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
<h1>All users from database</h1>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">userName</th>
      <th scope="col">Email</th>
      <th scope="col">Number of Donations</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allUsers}" var="user">
    <tr>
			<td><c:out value="${user.id}"/></td>
			<td><a href="/users/${user.id}"><c:out value="${user.userName}"/></a></td>
			<td><c:out value="${user.email}"/></td>
			<td><c:out value="${user.donations.size()}"/></td>
    </tr>
	</c:forEach>
  </tbody>
</table>
<body>
</body>
</html>