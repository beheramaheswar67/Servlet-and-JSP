<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
// out.print("Hello World"); 
 --%>
 <%
 session.setAttribute("myname", "This is Maheswar");
 %>

<form action="welcome">
<input type="text" name="nm" placeholder="Enter Your Name">
<button type="submit">Submit</button>
</form>
</body>
</html>