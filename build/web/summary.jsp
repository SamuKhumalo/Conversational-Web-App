<%-- 
    Document   : summary
    Created on : 16 Mar 2025, 12:29:23 PM
    Author     : samuk
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Summary Page!</h1>



        <%
            int correct = 0;
            int wrong = 0;

            String resultAdd = (String) session.getAttribute("resultAdd");
            String resultSub = (String) session.getAttribute("resultSub");
            String resultMul = (String) session.getAttribute("resultMul");
            String resultDiv = (String) session.getAttribute("resultDiv");

         Integer correctAns=(Integer)session.getAttribute("correctAns");

           
                
            
%> 



Number of correct answers <%=correctAns%><br>
        
        <%=resultAdd%>
        <%=resultSub%>
        <%=resultMul%>
        <%=resultDiv%><br>
        Correct Answers: <%=correct%><br>
        Wrong Answers:<%=wrong%><br>
        Click <a href="EndSessionServlet.do"> here</a> to end the session.
    </body>
</html>
