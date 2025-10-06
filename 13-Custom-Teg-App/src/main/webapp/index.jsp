<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="/WEB-INF/mylib.tld" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Greet Message</h1>
<hr>
<t:greet msg="Good Afternoon  "></t:greet>
<hr>
<h1>Demo Tag</h1>
<hr>
<t:demo side="10"></t:demo>
</body>
</html>