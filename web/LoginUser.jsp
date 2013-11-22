<%-- 
    Document   : Login
    Created on : Nov 8, 2013, 1:38:19 AM
    Author     : guestpc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank - Login</title>
    </head>
    <body>
        
        <h1>Please login to your account</h1>
        <form method="post" action="CheckLogin.jsp">
            <br/>Username: <input type="text" name="username">
            <br/>Password: <input type="password" name="password">
            <br/><input type="submit" value="Submit">
            
        </form>
    </body>
</html>
