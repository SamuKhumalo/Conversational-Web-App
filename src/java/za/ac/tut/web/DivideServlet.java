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
import za.ac.tut.moodel.Divide;
import za.ac.tut.moodel.DivideInterface;

/**
 *
 * @author samuk
 */
public class DivideServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession(true);
          Integer num1 =1225;
        Integer num2 =35;
        Integer value4 = Integer.parseInt(request.getParameter("value4"));
        System.out.println(value4);
        
        DivideInterface di = new Divide();
        Integer div = di.divide(num1, num2);
        
            String resultDiv=" ";
        if(value4 == div){
           resultDiv="correct";
        }else{
            resultDiv="wrong";
        }
        
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("div", div);
        session.setAttribute("resultDiv", resultDiv);
        
        RequestDispatcher disp = request.getRequestDispatcher("divide_outcome.jsp");
        disp.forward(request, response);
        
    }

   
}
