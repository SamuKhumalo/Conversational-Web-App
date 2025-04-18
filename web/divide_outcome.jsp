<%-- 
    Document   : divide_outcome
    Created on : 16 Mar 2025, 11:40:58 AM
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
        <h1>Division Outcome</h1>
        
        <%
         Integer num1 =(Integer)session.getAttribute("num1");
        Integer num2 =(Integer)session.getAttribute("num2");
        Integer div =(Integer)session.getAttribute("div");
        String resultDiv= (String) session.getAttribute("resultDiv");
        %>
        
        <p>
            The division of <%=num1%> and <%=num2%> is <b><%=div%></b>
            <br>
             Your answer is: <%=resultDiv%>
             
        <p>
            Click <a href="summary.jsp"> here</a> to go to the summary page.
        </p>
             
        </p>
    </body>
</html>
