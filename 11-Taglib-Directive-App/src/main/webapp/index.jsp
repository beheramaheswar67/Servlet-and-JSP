<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Taglib Directive example</h1>
	<hr>

	<c:set var="name" value="Be Coder"></c:set>
	<c:out value="${name}"></c:out>
	<c:set var="name2" value="Sarat Sukla"></c:set>
	<c:out value="${name2}"></c:out>
</body>
</html>