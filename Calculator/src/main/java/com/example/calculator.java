package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/calculate")
public class calculator extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Simple Calculator</h1>");
        out.println("<form action='calculate' method='POST'>");
        out.println("First Number: <input type='text' name='num1'><br>");
        out.println("Second Number: <input type='text' name='num2'><br>");
        out.println("<input type='submit' value='Add'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Simple Calculator</h1>");

        if (num1 != null && num2 != null) {
            try {
                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                out.println("<h2>Result: " + result + "</h2>");
            } catch (NumberFormatException e) {
                out.println("<h2>Please enter valid numbers.</h2>");
            }
        } else {
            out.println("<h2>Please enter both numbers.</h2>");
        }
        out.println("</body></html>");
    }
}
