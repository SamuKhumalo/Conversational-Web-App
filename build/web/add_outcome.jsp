<%-- 
    Document   : add_outcome
    Created on : 16 Mar 2025, 11:07:03 AM
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
        <h1>Addition Results</h1>
        
        <%
        Integer num1 = (Integer)  session.getAttribute("num1");
        Integer num2 = (Integer)  session.getAttribute("num2");
        Integer sum = (Integer)  session.getAttribute("sum");
        String resultAdd = (String)session.getAttribute("resultAdd");
        Integer correctAns=(Integer)session.getAttribute("correctAns");
        
        %>
        
        <p>
            The sum of <%=num1%> and <%=num2%> is <b><%=sum%></b><br>
               Your answer is: <%=resultAdd%>
               
        </p>
        
        <form action="Subtract.do" method="POST">
            <table>
                <table>
                 <table>
                <tr>

                    <td>60-13 =</td>
                    <td> <input type="text" name="value2"</td>


                <tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" name="SUBTRACT"/> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
