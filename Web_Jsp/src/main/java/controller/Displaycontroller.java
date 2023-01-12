package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Student;

@WebServlet("/display")
public class Displaycontroller extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		StudentDao std = new StudentDao();
		ArrayList<Student> al =  std.getallstudent();
		
		req.setAttribute("data", al);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		
	}
}
