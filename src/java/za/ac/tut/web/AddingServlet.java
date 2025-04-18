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
import za.ac.tut.moodel.AddInterface;
import za.ac.tut.moodel.Adding;

/**
 *
 * @author samuk
 */
public class AddingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        int num1 = 30;
        int num2 = 20;
        Integer value1 = Integer.parseInt(request.getParameter("value1"));
        System.out.println(value1);

        AddInterface ad = new Adding();
        Integer sum = ad.add(num1, num2);
        int correctAnswer=(Integer)session.getAttribute("correctAns");
        int wrongAnswer=(Integer)session.getAttribute("correctAns");

        String resultAdd = " ";
        if (value1 == sum) {
            resultAdd = "correct";
            correctAnswer++;

        } else {
            resultAdd = "wrong";
            wrongAnswer++;
        }

        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("sum", sum);
        session.setAttribute("resultAdd", resultAdd);
        session.setAttribute("correctAns", correctAnswer);
        session.setAttribute("wrongAns", wrongAnswer);

        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
    }

}
