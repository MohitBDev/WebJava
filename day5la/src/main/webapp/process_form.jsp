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
<h4>Process form</h4>
<%
String fname=request.getParameter("fn");
String lname=request.getParameter("ln");
int score=Integer.parseInt(request.getParameter("score"));
Course course = Course.valueOf(request.getParameter("corse"));
 Student stud=new Student(fname,lname,score,course);
 if(score>course.getMinScore())
	 stud.setAdmitted(true);
 //server pull:forward
 //
	request.setAttribute("stud_det", stud) ;
	RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
	rd.forward(request, response);
	System.out.println("came back");
%>

</body>
</html>