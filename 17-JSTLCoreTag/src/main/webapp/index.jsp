<%@ page contentType="text/html; charset=UTF-8" %>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core Tag</title>
</head>
<body>
<h1>JSTL CORE TAGS EXAMPLE</h1>
<hr>
<c:out value="Becoder"></c:out> <!-- Normally used to print on the browser -->

<c:import url="navbar.jsp" var="data"></c:import>
<h1><c:out value="${data}"></c:out></h1>
<hr>
<%-- <c:set var="result" value="${400*3}" scope="session"></c:set> 
Before: 
<c:out value="${result}"></c:out>
<c:remove var="result"/>
<br>
After: 
<c:out value="${result}"></c:out> --%>

<%-- <c:catch var="exception"> --%>

<%
// String name =null;
// name.toUpperCase();
%>

<%-- </c:catch> --%>
<%-- <c:if test="${exception!=null}"> --%>
<%-- <p>${exception}</p> --%>
<%-- <p>${expection.message}</p> --%>
<%-- </c:if> --%>

<c:set value="${30}" var="age"></c:set>

<%-- <c:if test="${age>18}">
<h1>Adult</h1>
</c:if> --%>

<%-- <c:choose>

<c:when test="${age>18}">
<h1>Adult</h1>
</c:when>

<c:when test="${age<18}">
<h1>Child</h1>
</c:when>

<c:otherwise>
<h1>Invalid Age</h1>
</c:otherwise>

</c:choose> --%>

<%-- <c:forEach var="num" begin="1" end="10"> <!-- It is use for loop purpose -->
<c:out value="${num}"></c:out>
</c:forEach> --%>

<%-- <c:forTokens items="Be-Coder-Programmer" delims="-" var="newString"> <!-- delims="-" it is basically used for separation -->
<c:out value="${newString}"></c:out><p>
</c:forTokens> --%>

<%-- <c:url value="/index.jsp" var="pageUrl">
<c:param name="em" value="demo@gmail.com"></c:param>
<c:param name="ps" value="demo"></c:param>
</c:url>

${pageUrl} --%>

<c:redirect url="https://google.com/">

</c:redirect>

</body>
</html>