package com.servlets;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstProgram implements Servlet{
	
	ServletConfig con;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method is called");
		
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method is called");
		con=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method is called");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();	
		out.println("Welcome to Servlet");
		out.println("Today :"+new Date().toString());
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
	}
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My First Program";
	}

}
