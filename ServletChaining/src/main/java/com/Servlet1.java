package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>Hello, Servlet1</h1>");
		
		//req.getRequestDispatcher("index.jsp").forward(req, resp);
		//req.getRequestDispatcher("index.jsp").include(req, resp);
		resp.sendRedirect("index.jsp");
	}
}
