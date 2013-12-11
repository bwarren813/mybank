<%-- 
    Document   : transferfunds
    Created on : Nov 5, 2013, 3:53:08 PM
    Author     : Darryl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank - Transfer Funds</title>
    </head>
    <body>
        
        <form name="transferForm" method="post" action="">
            <br/>
            <table width="400px" border="0">
                <tr>
                    <td colspan="2"><h2>Transfer Funds</h2></td>
                </tr>
                
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="acctNumber" value=""></td>
                </tr>
                
                <tr>
                    <td>Transfer From</td>
                    <td>
                        <select name="transferType">
                            <option value="-1">Select</option>
                            <option value="Account 1">Account 1</option>
                            <option value="Account 2">Account 2</option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td>Transfer To</td>
                    <td>
                        <select name="transferType">
                            <option value="-1">Select</option>
                            <option value="Account 1">Account 1</option>
                            <option value="Account 2">Account 2</option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td>Amount</td>
                    <td><input type="text" name="amount"></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" name="Submit" value="Submit"></td>
                </tr>
                
                
            </table>
        </form>
    
        <br/><a href="Welcome.jsp">Back To Main Page</a> <a href="Logout.jsp">Log Out</a>
    </body>
</html>
