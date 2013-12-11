<%-- 
    Document   : account
    Created on : Nov 5, 2013, 3:52:53 PM
    Author     : Darryl
--%>
<%@page import="com.spcollege.titanbank.bll.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
                <th>Account ID</th>
                <th>Account Number</th>
                <th>Checking</th>
                <th>Savings</th>
            </tr>
            <tr valign="top">    
            <c:forEach var="item" items="${account.items}">
                <td><c:out value="${account.accountId}" /></td>
                <td><c:out value="${account.acctNumber}" /></td>
                <td><c:out value="${account.checking}" /></td>
                <td><c:out value="${account.savings}"/></td>
            </c:forEach>
            </tr>    
        </table>

            
        <br/><a href="Welcome.jsp">Back To Main Page</a> <a href="Logout.jsp">Log Out</a>
    
    </body>
</html>
