package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (UserDatabase.users.containsKey(username)) {
            request.setAttribute("error", "User already exists.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            UserDatabase.users.put(username, password);
            response.sendRedirect("login.jsp");
        }
    }
}
