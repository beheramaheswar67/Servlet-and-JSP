package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("user");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		// out.print("<h1>Name: "+name+"</h1>");
		
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.print("<title>Display Name</title>");
		out.print("<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
		out.print("</head>");
		out.print("<body class='bg-light'>");

		out.print("<div class='container d-flex justify-content-center align-items-center min-vh-100'>");
		out.print("<div class='card shadow-lg p-4 w-50'>");

		// Displaying the name with Bootstrap styling
		out.print("<h1 class='text-center'>Name: " + name + "</h1>");

		out.print("</div>");
		out.print("</div>");

		out.print("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
		out.print("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js'></script>");
		out.print("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");

		out.print("</body>");
		out.print("</html>");

	}

	
}
