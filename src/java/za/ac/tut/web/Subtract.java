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
import za.ac.tut.moodel.SubtractInterface;
import za.ac.tut.moodel.Subtracting;

/**
 *
 * @author samuk
 */
public class Subtract extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session =request.getSession(true);
         Integer num1 =60;
        Integer num2 =13;
        Integer value2 =Integer.parseInt( request.getParameter("value2"));
        System.out.println(value2);
        
        SubtractInterface si = new Subtracting();
        Integer minus = si.subtract(num1, num2);
        
         String resultSub=" ";
        if(value2 == minus){
           resultSub="correct";
        }else{
            resultSub="wrong";
        }
        
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("minus", minus);
        session.setAttribute("resultSub", resultSub);
        
        RequestDispatcher disp = request.getRequestDispatcher("subtract_outcome.jsp");
        disp.forward(request, response);
    }


}
