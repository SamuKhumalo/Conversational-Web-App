/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.moodel.Multiply;
import za.ac.tut.moodel.MultiplyInterface;

/**
 *
 * @author samuk
 */
public class MultiplyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
          Integer num1 =5;
        Integer num2 =10;
        Integer value3 = Integer.parseInt(request.getParameter("value3"));
        
        MultiplyInterface mi = new Multiply();
        Integer mult = mi.multiply(num1, num2);
        
          String resultMul=" ";
        if(value3 == mult){
           resultMul="correct";
        }else{
            resultMul="wrong";
        }
        
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("mult", mult);
        session.setAttribute("resultMul", resultMul);
        
        RequestDispatcher disp = request.getRequestDispatcher("multiply_outcome.jsp");
        disp.forward(request, response);
    }

   
}
