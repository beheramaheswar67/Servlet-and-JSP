<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//String name = config.getInitParameter("username");
//String cnf = application.getInitParameter("username");
//out.print(name);
//out.print(cnf);
%>
<% String name = (String)session.getAttribute("myname"); 
out.print(name);
%>
<br>
<a href="next.jsp">Remove Session</a>
</body>
</html>