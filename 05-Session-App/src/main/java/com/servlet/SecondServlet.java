package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("nm");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		Cookie[] ck = req.getCookies();
		
		// out.print("<h2>"+"Welcome to Servlet2:  " + name + "</h2>");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<title>Welcome to Servlet1</title>");
		out.print("<style>");
		out.print("body { font-family: 'Arial', sans-serif; background-color: #f4f7fc; text-align: center; padding: 50px; }");
		out.print("h2 { color: #333; font-size: 24px; margin-bottom: 20px; }");
		out.print("a { font-size: 18px; color: #4CAF50; text-decoration: none; border: 1px solid #4CAF50; padding: 10px 20px; border-radius: 5px; transition: background-color 0.3s ease; }");
		out.print("a:hover { background-color: #45a049; }");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>Welcome to Servlet2, Name:  " + ck[0].getValue() + "</h2>");
		out.print("<br>");
		out.print("</body>");
		out.print("</html>");

		
	}
	
	

}
