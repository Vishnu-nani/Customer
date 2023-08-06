<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix= "c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#div{
	width=80px;
	}
	
</style>

</head>
<body>
<button style="background-color: blue; color:white"><a href="/details.jsp"></a>Add Customer</button>
<div align="center" style=width:80>
<h1>Customer List</h1>
<form action="getCustomers">
<table border="1"> 
<thead>

<tr>
<td>First Name</td>
<td>Last Name</td>
<td>Street</td>
<td>Address </td>
<td>City</td>
<td>State</td>
<td>Email</td>
<td>Phone</td>
<td>Action</td>
</tr>
</thead>
<%--  skipping the table header; follow similar method to implement it 			--%> 
			<c:forEach var="customer" items="${allcustomers}">
			<tr>
				<td>${customer.first_name}</td>
				<td>${customer.last_name}</td>
				<td>${customer.street}</td>
				<td>${customer.address}</td>
				<td>${customer.city}</td>
				<td>${customer.state}</td>
				<td>${customer.email}</td>
				<td>${customer.phone}</td>
				<td><a href="getByName/${customer.id}">update</a><br><a href="deleteCustomer/${customer.id}">delete</a></td>
			</tr>
			</c:forEach>
</table> 
</form>
</div>

</body>
</html>