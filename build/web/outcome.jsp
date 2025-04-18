<%-- 
    Document   : outcome
    Created on : 16 Mar 2025, 10:50:18 AM
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
        <h1>Start Page</h1>
        
        <%
        String name = (String)session.getAttribute("name");
        
        %>
        
        Hi <%=name%>
        <p>
            There are 5 questions to be asked.Click <a href="startTest.jsp"> here</a> to start.
        </p>
    </body>
</html>
