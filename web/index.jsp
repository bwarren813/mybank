<%@page import="com.spcollege.titanbank.dal.AccountRepository"%>
<%@page import="com.spcollege.titanbank.bll.Account"%>
<%@page import="com.spcollege.titanbank.dal.UserRepository"%>
<%@page import="com.spcollege.titanbank.bll.User"%>
<%@page import="com.spcollege.titanbank.bll.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
    </head>

    <body>
        <h1>Welcome to Titan Bank</h1>
        <br/><a href="LoginUser.jsp">Login</a>
        <br/><a href="SaveCustomer.jsp">Register</a>
        
        <%
           User user = UserRepository.findByUsername("bwarren813");
           Account account = AccountRepository.findByAccountNumber();
            
        %>
        
        <%= user.getUsername()%>
        <%= account.getAcctNumber()%>
        
        <%= account.getCustomer().getAddress().getStreetAddress()%>
            
        
    </body>
</html>
