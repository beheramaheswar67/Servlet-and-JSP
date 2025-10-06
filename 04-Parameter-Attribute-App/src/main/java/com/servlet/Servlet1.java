package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int fn =Integer.parseInt(req.getParameter("num1"));
		int sn =Integer.parseInt(req.getParameter("num2"));
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int sum = fn+sn;
		
		req.setAttribute("s", sum);  //Attribute set here
		
		RequestDispatcher rd = req.getRequestDispatcher("/servlet2");
		rd.forward(req, resp);
	}
	

}
