<%-- 
    Document   : multiply_outcome
    Created on : 16 Mar 2025, 11:34:34 AM
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
        <h1>Multiply Outcome</h1>
        
        <%
         Integer num1 =(Integer)session.getAttribute("num1");
        Integer num2 =(Integer)session.getAttribute("num2");
        Integer mult =(Integer)session.getAttribute("mult");
        String resultMul = (String)session.getAttribute("resultMul");
        
        %>
        
        <p>
            The multiplication of <%=num1%> and <%=num2%> is <b><%=mult%></b><br>
             Your answer is: <%=resultMul%>
        </p>
        
          <form action ="DivideServlet.do" method ="POST">
                <table>
                     <table>
                 <table>
                <tr>

                    <td>1225 / 35 =</td>
                    <td> <input type="text" name="value4"</td>


                <tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" name="DIVIDE"/> </td>
                </tr>
                </table>
            </form>
    </body>
</html>
