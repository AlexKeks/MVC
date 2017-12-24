<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN</title>
<style type="text/css">
b {
	font-size: 50px;
	font-family: Constantia, Courier, monospace;
	color: #3E1400;
}

body {
	background: url(Images/reciption.jpg) no-repeat center center fixed;
	background-size: 100%;
	color: #fff;
}
</style>

 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
</head>
<body>
	<b><center>Hello ${userName}!</center></b>
	<br>
	<center>
		<input type="button" value="Close session" onclick=location.href="/BookBDWeb2/Controller?command=close"><br><br>
		<input type="button" value="Back to authorization" onclick=location.href="/BookBDWeb2">
	</center>
</body>
</html>