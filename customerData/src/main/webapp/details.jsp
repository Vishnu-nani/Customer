<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

<h1 align="center">Customer Details</h1>
<div align="center">
<form action="addCustomers" method="post">
<input type="text" name="first_name" required="required" placeholder="First name" value=${customer.first_name }>
<input type="text" name="last_name" required="required" placeholder="Last name" value= ${customer.last_name }><br><br>
<input type="text" name="street" placeholder="Street" value= ${customer.street }>
<input type="text" name="address" placeholder="Address" value=${customer.address }><br><br>
<input type="text" name="city" placeholder="City" value=${customer.city }>
<input type="text" name="state" placeholder="State" value=${customer.state }><br><br>
<input type="text" name="email" placeholder="Email" value=${customer.email }>
<input type="text" name="phone" placeholder="Phone" value=${customer.phone }><br><br>
<input type="submit" name="submit"><br><br>
<button><a href="getCustomers">Customer List</a></button>



</form>
</div>

</body>
</html>