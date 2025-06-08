package com.example;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletEx extends GenericServlet {


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        servletResponse.setContentType("text/html");
//        PrintWriter out= servletResponse.getWriter();
//        out.println("<h1>hello buddy..</h1>");
        PrintWriter out= servletResponse.getWriter();
        out.println("hello buddy..");


    }
}
