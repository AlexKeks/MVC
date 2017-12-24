<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER</title>
<style type="text/css">
b {
	font-size: 30px;
	font-family: Constantia, Courier, monospace;
	color: #FFD700;
}
</style>
</head>
<body>
<center><b>Hello ${userName}!</b></center><br>
<center><a href="/BookBDWeb2/Controller?command=close">Close session</a></center>
</body>
</html>