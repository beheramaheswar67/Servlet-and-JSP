<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Function Tag</title>
</head>
<body>
<h1>JSTL Function Tag Example</h1>
<hr>
<c:set var="channelName" value="Welcome to BeCoder         "></c:set>
<%-- <c:if test="${fn:containsIgnoreCase(channelName, 'becoder') }">
<h4>Found BeCoder</h4>
</c:if>

<c:if test="${fn:contains(channelName, 'BeCoderAlart') }">
<h4>Found</h4>
</c:if> --%>

<%-- <c:if test="${fn:endsWith(channelName, 'BeCoder') }">
<h4>BeCoder</h4>
</c:if> --%>

<%-- <h1>String Index Of : ${fn:indexOf(channelName,'to') }</h1> --%>

<%-- <h1>String Length without Trim of : ${fn:length(channelName) }</h1>
<c:set value="${fn:trim(channelName)}" var="str2" ></c:set>
<h1>String Length with Trim Of : ${fn:length(str2)}</h1> --%>

<%-- <c:if test="${fn:startsWith(channelName,'Welcome') }">
<h4>Found welcome</h4>
</c:if> --%>

<c:set var="str1" value="Welcome to BeCoder"></c:set>
<%-- <c:set var="str2" value="${fn:split(str1,' ') }"></c:set>
<c:set var="str3" value="${fn:join(str2,'-') }"></c:set>
${str3 }
<br>
${fn:toLowerCase(str1) }
<br>
${fn:toUpperCase(str1) } --%>
<%-- ${fn:substring(str1, 4,6) } --%>

<%-- ${fn:substringAfter(str1, 'to') }
${fn:substringBefore(str1, 'to') } --%>

${fn:replace(str1,"BeCoder","Hello") }
</body>
</html>