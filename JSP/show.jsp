<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="contentType" content="text/html; charset= UTF-8">
<title>Yahooo 1111111 froom jsp</title>
</head>
<body>
    My Username is #{username} <br>
    Password : #{password} <br>
    Name : #{Name} <br>
    Phone number : #{phno} <br>
    Address : #{address} <br>
    DOB : #{DOB} <br>
    <form action="/logout.do" method="GET"></form>
    <input type="submit" value="logout">
</form>
</body>
</html>
