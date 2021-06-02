import com.squareup.okhttp.OkHttpClient;
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahooo 1</title>
</head>
<body>
   
<form action="/verify.do" method="GET">
    OTP Sent Successfully ! <br>
  Enter the otp    : <input type="text" name="OTP"><br>
    <input type="submit" value="verify">
</form>
</body>
</html>
