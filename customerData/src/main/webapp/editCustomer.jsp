<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix= "d"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="updateCustomer" method="get">

<input type="number" name="id" placeholder="id" value="${cus.id }"><br><br>
<input type="text" name="first_name" required="required" placeholder="First name" value="${cus.first_name}">
<input type="text" name="last_name" required="required" placeholder="Last name" value="${cus.last_name}"><br><br>
<input type="text" name="street" placeholder="Street" value= "${cus.street}">
<input type="text" name="address" placeholder="Address" value="${cus.address}"><br><br>
<input type="text" name="city" placeholder="City" value="${cus.city}">
<input type="text" name="state" placeholder="State" value="${cus.state}"><br><br>
<input type="text" name="email" placeholder="Email" value="${cus.email}">
<input type="text" name="phone" placeholder="Phone" value="${cus.phone}"><br><br>

<input type="submit" name="submit"><br><br>
</form>

</body>
</html>