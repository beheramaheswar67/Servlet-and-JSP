package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//out.print("<form action='servlet2' ><input type='hidden' name='user' value='"+name+"'><br><button type='submit'>Click</button></form>");
		
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.print("<title>Form with Hidden Input</title>");
		out.print("<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
		out.print("</head>");
		out.print("<body class='bg-light'>");

		out.print("<div class='container d-flex justify-content-center align-items-center min-vh-100'>");
		out.print("<div class='card shadow-lg p-4 w-50'>");
		out.print("<h2 class='text-center mb-4'>Data input by User</h2>");
		out.print("<form action='servlet2'>");
		out.print("<h2 class='text-center'>");
		out.print("<input  type='hidden' name='user' value='" + name + "'>");
		out.print("</h2>");
		out.print("<button type='submit' class='btn btn-success btn-block'>Go to Servlet2</button>");
		out.print("</form>");
		out.print("</div>");
		out.print("</div>");

		out.print("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
		out.print("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js'></script>");
		out.print("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
		out.print("</body>");
		out.print("</html>");

	}
	
	

}
