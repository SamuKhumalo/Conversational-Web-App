/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StartSession extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
                HttpSession session= request.getSession(true);
                String name = request.getParameter("name");
                
                initializeSession(session,name);
                
                RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
                disp.forward(request, response);
    }

    public void initializeSession(HttpSession session, String name) {
        List<Integer>q_asked = new ArrayList<>();
        Integer answer=0;
        Integer correctAns=0;
        Integer wrongAns=0;
        
        session.setAttribute("name", name);
        session.setAttribute("q_asked", q_asked);
        session.setAttribute("answer", answer);
        session.setAttribute("correctAns", correctAns);
        session.setAttribute("wrongAns", wrongAns);
    }


}
