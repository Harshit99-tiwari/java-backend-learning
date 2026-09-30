package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServelet extends HttpServlet
{
      public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
          System.out.println("hello world");
          res.setContentType("text/html");
          PrintWriter out = res.getWriter();

          out.println("<h2>Hello, World!</h2>");
      }
}
