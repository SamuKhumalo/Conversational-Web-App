<%-- 
    Document   : subtract_outcome
    Created on : 16 Mar 2025, 11:15:22 AM
    Author     : samuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Subtract Outcome</h1>
        
        <%
        Integer num1 =(Integer)session.getAttribute("num1");
        Integer num2 =(Integer)session.getAttribute("num2");
        Integer minus =(Integer)session.getAttribute("minus");
        String resultSub = (String)session.getAttribute("resultSub");
        %>
        
        The subtraction of <%=num1%> and <%=num2%> is <b><%=minus%><br>
            Your answer is: <%=resultSub%>
            
            <form action ="MultiplyServlet.do" method ="POST">
                <table>
                     <table>
                 <table>
                <tr>

                    <td>5 * 10 =</td>
                    <td> <input type="text" name="value3"</td>


                <tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" name="MULTIPLY"/> </td>
                </tr>
                </table>
            </form>
    </body>
</html>
