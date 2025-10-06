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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int fn = Integer.parseInt(req.getParameter("num1"));
		int sn = Integer.parseInt(req.getParameter("num2"));
		
		int sum = (int)req.getAttribute("s"); //Attribute get here
		
		int mul = fn*sn;
		
		int div = fn/sn;
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		 // Output the results using Bootstrap for styling
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calculator Results</title>");
        // Add Bootstrap CSS link
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("<style>");
        out.println("body { background-color: #f8f9fa; padding-top: 50px; }");
        out.println(".container { max-width: 600px; background-color: #ffffff; padding: 30px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }");
        out.println(".result { margin-top: 20px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<div class='container'>");
        out.println("<h2 class='text-center'>Calculator Results</h2>");
        
        // Display sum and multiplication with Bootstrap classes
        out.println("<div class='result alert alert-success'>");
        out.println("<strong>Sum: </strong> " + sum);
        out.println("</div>");
        
        out.println("<div class='result alert alert-info'>");
        out.println("<strong>Multiplication: </strong> " + mul);
        out.println("</div>");
        
        out.println("<div class='result alert alert-danger'>");
        out.println("<strong>Division: </strong> " + div);
        out.println("</div>");
        
        out.println("<div class='text-center'>");
        out.println("<a href='index.html' class='btn btn-primary'>Go Back</a>");
        out.println("</div>");
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
		
		
	}
	

}
