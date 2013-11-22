<%-- 
    Document   : Logout
    Created on : Nov 8, 2013, 2:02:48 AM
    Author     : guestpc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.removeAttribute("username");
            session.removeAttribute("password");
            session.invalidate();
        %>
        <h2>Logout was done successfully</h2>
    </body>
</html>
