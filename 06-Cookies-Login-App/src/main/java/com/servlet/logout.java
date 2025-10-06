package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class logout extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] ck = req.getCookies();
		
		ck[0].setMaxAge(0); // Here we are Destroy the cookie
		ck[1].setMaxAge(0); // Here we are Destroy the cookie
		
		resp.addCookie(ck[0]);
		resp.addCookie(ck[1]);
		
		resp.sendRedirect("index.html");
	}
	
	
	

}
