<%//<%@=directive  name=page importing directrive %>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5 align="center">JSESSIONID : <%=session.getId() %></h5>
	<h5>
		Welcome 2 JSP @
		<%=LocalDateTime.now()%></h5>
	<h5>
		<a href="comments.jsp">Test Comments</a>
	</h5>
	<h5>
		<a href="login.jsp">Test Scriptlets n Expressions EL syntax</a>
	</h5>
	<h5>
		<a href="login2.jsp">User Login</a>
	</h5>
	<h5>
		<a href="test1.jsp">Centralized Error Handling in JSP</a>
	</h5>
</body>
</html>