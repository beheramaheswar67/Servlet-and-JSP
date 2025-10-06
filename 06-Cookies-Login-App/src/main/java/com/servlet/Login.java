package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("ml");
		String password = req.getParameter("ps");
		
		Cookie ck = new Cookie("em", email);
		Cookie ck2 = new Cookie("ps", password);
		
		
		resp.addCookie(ck);
		resp.addCookie(ck2);
		
		resp.sendRedirect("profile");
		
//		PrintWriter out = resp.getWriter();
//		resp.setContentType("text/html");
//		
//		if(email.equals("demo@gmail.com") && password.equals("demo")) {
//			
//		}
		
	}

}
