<%-- 
    Document   : Login
    Created on : Nov 8, 2013, 1:38:19 AM
    Author     : guestpc
--%>

<%@page import="com.spcollege.titanbank.bll.User"%>
<%@page import="com.spcollege.titanbank.dal.UserRepository"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank - Login</title>
    </head>
    <body>
        
        <h1>Please login to your account</h1>
        <form name="loginForm" action="LoginUser" method="post">
            <table>
                <tr><td><b>Username: </b></td><td><input type="text" name="username" /></td></tr>
                <tr><td><b>Password: </b></td><td><input type="password" name="password" /></td></tr>
                <tr><td colspan="2" align="center"><input type="submit" value="submit"> </td></tr>
            </table>
        </form>
        
        
        
    </body>
</html>
