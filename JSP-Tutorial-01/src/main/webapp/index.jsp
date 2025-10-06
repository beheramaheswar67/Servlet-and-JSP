<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.*"%> <!-- It is basically use for import package -->
<%@ page session="false" %>
<%@ page isELIgnored="false" %>
<%@ page errorPage="error.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #87CEFA;">

<%@include file="Header.jsp" %> <!-- Include Directory it is basically use for include some page in all page like HeaderPage -->

<h1>Hello World</h1>

<h1>Declaration Teg: </h1>
<%! int a=12; String name = "becoder"; %> <!-- It is use for Variable Declaration -->

<h1>Expression Teg: <%= a %> <%= name %></h1>  <!-- It is use for Print Data -->

<h1>Script line Teg: </h1> <!-- It is use for Write Java Code -->
<%
int a = 15;
int b = 5;
int sum = a+b;
// out.println("Addition Value is : "+sum);
int sub = a-b;
// out.println("Subtraction Value is : "+sub);
%>

<h1 style="color: red">Addition Value is : <%=sum %></h1>
<h1 style="color: green;">Subtraction Value is : <%=sub %></h1>


<h1> Time: <%= new Date().toString() %></h1>


</body>
</html>