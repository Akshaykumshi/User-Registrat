<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="contentType" content="text/html; charset= UTF-8">
<title>Yahooo 1111111 froom jsp</title>
</head>
<body>
	My First JSP ${name} and password is ${password} 
<form action="/login.do" method="GET">
${errormessage }
Enter your name : <input type="text" name="username"><br>
password : <input type="password" name="password"><br>
Phone Number :<input type="number" name="Phone number"><br>
Name : <input type="text" name="Name"><br>
Date of Birth : <input type="date" name="DOB"><br>
Address : <input type="text" name="Address"><br>
<input type="submit" value="login">
</form>
</body>
</html>
