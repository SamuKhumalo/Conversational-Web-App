<%-- 
    Document   : startTest
    Created on : 16 Mar 2025, 10:56:32 AM
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
        <h1>List Of Tests</h1>

        <form action="AddingServlet.do" method="POST">
            <table>
                <tr>

                    <td>30 + 20 =</td>
                    <td> <input type="text" name="value1"</td>


                <tr>
                    <td></td>
                    <td><input type="submit" name="ADD"/> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
