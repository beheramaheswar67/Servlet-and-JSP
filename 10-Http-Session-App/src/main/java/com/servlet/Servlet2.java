package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(); //Here we are requesting the Data 
		String name=(String)session.getAttribute("username"); //Here we store a data in a Variable and convert obj to String value
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<h2>Name: "+name+"</h2>");
	}
	
	

}
