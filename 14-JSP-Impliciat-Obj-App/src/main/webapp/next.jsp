<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% //response.sendRedirect("https://www.google.com"); %>
<% //String name=request.getParameter("nm");
   //out.print("<h1>"+name+"</h1>"); 
   %>
   
   <% session.removeAttribute("myname");
   String name = (String)session.getAttribute("myname");
   out.print(name);
   %>
  
</body>
</html>