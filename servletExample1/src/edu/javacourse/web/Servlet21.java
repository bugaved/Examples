package edu.javacourse.web;

import java.io.IOException;

/**
 * Created by bugav on 05.07.2017.
 */
public class Servlet21 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
response.getWriter().append("Hello, World");
    }
}
