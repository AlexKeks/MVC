<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>DEVELOPMENT</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
        a {
            font-size: 22px;
            font-family: Constantia, Courier, monospace;
            color: #81DAF5;
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

        /* body {
             background-repeat: no-repeat;
             background-position: center;
             background-image: url('../../../images/hotel.jpg');
        !*
             background-color: #c7b39b;
        *!
             background-attachment: fixed;
             background-size: 110%;
            color: #fff;
           }*/
        body {
            background: url(../../../Images/hotel.jpg) no-repeat center center fixed;
            background-size: 100%;
            color: #fff;
        }

    </style>
</head>
<body style="background-image:url('Images/hotel.jpg')">


<b>Welcom to start page hotel</b>

<form action='/hotel/10' method="post">
    <input type='hidden' name='command' value='login'/>
    <div class="container">
        <form>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input id="email" type="text" class="form-control" name="email" placeholder="Email">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <input id="password" type="password" class="form-control" name="password" placeholder="Password">
            </div>
            <br>
        </form>

        <button type="submit" class="btn btn-primary">Primary</button>
    </div>


    <!-- <c>Login like guest</c><br>
    <d>Your name <input type='text' name='guest' /></d> <br>
    <input type='submit' value='enter' />
     -->
</form>

</body>
</html>