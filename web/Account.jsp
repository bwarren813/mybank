<%-- 
    Document   : account
    Created on : Nov 5, 2013, 3:52:53 PM
    Author     : Darryl
--%>
<%@page import="com.spcollege.titanbank.bll.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank - View Account Details</title>
    </head>
    <body>
        
        
        <h1>View Account Details</h1>
        <table border="1" cellpadding="5">
            <tr>
                <th>Account Number</th>
                <th>Account Type</th>
                <th>Date Opened</th>
                <th>Available Funds</th>
            </tr>
            
            <tr>
                <td><input type="text" value="${acctNumber}"/></td>
                <td><input type="text" value="${accountType}"/></td>
                <td><input type="text" value="${dateCreated}"/></td>
                <td><input type="text" value="${availableFunds}"/></td>
            </tr>
        </table>
        <br/><a href="Welcome.jsp">Back To Main Page</a> <a href="Logout.jsp">Log Out</a>
    
    </body>
</html>
