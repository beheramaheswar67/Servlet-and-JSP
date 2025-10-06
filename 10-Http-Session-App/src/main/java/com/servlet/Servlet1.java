package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>Name: "+name+"</h1>");
		
		HttpSession session = req.getSession(); //It will automatically destroy input value if you close your Browser.
		session.setAttribute("username", name);
		
		out.print("<form action='servlet2'>");
		out.print("<button type='submit'>Click</button>");
		out.print("</form>");
	}

}
