<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1 style="color:red;text-align:center">Failure</h1>
<% 
   Object failure=request.getAttribute("failure");
   out.println("<h1 style='color:red;text-align:center'>"+failure+"</h1>");
%>
<br/><br/>
<a href="cwReg">Home</a>