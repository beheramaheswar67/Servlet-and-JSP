package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Here we are used doGet coz in FirstServer we were used resp.sendRedirect
		
		String email = req.getParameter("em");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.print("<title>Welcome Page</title>");

		
		out.print("<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");

		out.print("</head>");
		out.print("<body class='bg-light'>");
		out.print(email);

		
		out.print("<div class='container text-center mt-5'>");
		out.print("<h1 class='display-3 text-primary'>Welcome to the Home Page</h1>");
		out.print("<p class='lead text-muted'>We are thrilled to have you here! Explore the features and enjoy your experience.</p>");
		out.print("<a href='/profile' class='btn btn-success btn-lg'>Go to Profile</a>");
		out.print("</div>");

		
		out.print("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
		out.print("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js'></script>");
		out.print("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");

		out.print("</body>");
		out.print("</html>");
		
	}
	

}
