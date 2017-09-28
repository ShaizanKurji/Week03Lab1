<%-- 
    Document   : loginjsp
    Created on : Sep 21, 2017, 6:51:12 PM
    Author     : 715060
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action ="loginpage" method = "post" >
            Username: <input type ="text" name ="username" value=${username}>
        <br>
        Password: <input type="text" name ="password" value = ${password}>
        <br>
         <input type="submit" value ="Login">
        </form>
        ${validateMessage}
        <br>
        ${logout}     
    </body>
</html>
