<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
a {
	font-size: 22px;
	font-family: Constantia, Courier, monospace;
	color: 	#81DAF5;
}

b {
	font-size: 40px;
	font-family: Brush script mt, Courier, monospace;
	color: #FFD700;
}
c {
	font-size: 30px;
	font-family: Constantia, Courier, monospace;
	color: #FFFAF0;
}
d {
	font-size: 22px;
	font-family: Constantia, Courier, monospace;
	color: #FFE4B5;
}
	
 body {
    background: #c7b39b url(Images/hotel.jpg) no-repeat center center fixed;
    background-size: 110%; 
    color: #fff; 
   }
 
</style>
</head>
<body>
<b>Welcome to start page</b>
	<form action='Controller' method="get">
		<ol>
			<li><a>Login<input type='text' name='login' /></a> <br></li>
			<li><a>Password<input type='password' name='password' /></a> <br></li>
		</ol>
		<input type='hidden' name='command' value='login'/>
		<input type='submit' value='set' /><br><br>
		<!-- <c>Login like guest</c><br>
		<d>Your name <input type='text' name='guest' /></d> <br>
		<input type='submit' value='enter' />
		 -->
	</form>
</body>
</html>