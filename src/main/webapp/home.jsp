<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="text-align: center;">
	<h1>Welcome to Spring MVC...</h1>

	<form action="addEmployee" method="Post">

		<input type="text" name="firstName" placeholder="First Name" /><br />
		<input type="text" name="lastName" placeholder="Last Name" /><br />
		<input type="text" name="email" placeholder="Email" /><br /> <input
			type="submit" value="Submit" /><br />

	</form>
</body>
</html>