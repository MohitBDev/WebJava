<%@page import="com.app.pojos.Student" import="pojos.Course "  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Student stud2=(Student)request.getAttribute("stud_det");
if(stud2.isAdmitted()){
%>
<h3> Congrats :${param.fn} Course :${param.corse} </h3>
<%}
else{
%>
<h4>Sorry :${param.fn} Course :${param.corse}</h4>
<%} %>
</body>
</html>