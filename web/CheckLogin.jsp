<%-- 
    Document   : CheckLogin
    Created on : Nov 8, 2013, 1:59:30 AM
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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if ((username.equals("brandon") && password.equals("admin"))) {
                session.setAttribute("username", username);
                response.sendRedirect("Welcome.jsp");
            }
            else
                response.sendRedirect("LoginUser.jsp");
               
        %>
        
    </body>
</html>
