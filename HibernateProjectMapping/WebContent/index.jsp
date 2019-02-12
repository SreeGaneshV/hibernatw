<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<form action="Info" method="post">
<br>UserName:<br>
<input type="text" name="name" >
<br>Email:<br>
<input type="text" name="email" >
<br>MobileNo:<br>
<input type="text" name="mobileno">
<br>BankName:<br>
<select name="bankname">
<option value="ICICI">HDFC</option>
<option value="SBI">SBI</option>
</select>
<br>Account: &nbsp; <input type="radio" name="account"value="SavingsAccount">SavingsAccount &nbsp;
<input type="radio" name="account"value="CurrentAccount">CurrentAccount<br>
<input type="submit" value="Submit">
</form>
</body>
</html>