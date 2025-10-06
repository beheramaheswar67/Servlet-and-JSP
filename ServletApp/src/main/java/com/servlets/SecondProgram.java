package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondProgram extends GenericServlet{ //Here we can use only one Method 

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Generic Servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Date :"+new Date().toString());
		
	}

}
