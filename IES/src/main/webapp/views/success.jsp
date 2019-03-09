<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<h1 style="color:red;text-align:center">Result</h1>
<% 
   Object success=request.getAttribute("success");
   out.println("<h1 style='color:red;text-align:center'>"+success+"</h1>");
%>
<br/><br/>
<a href="cwReg">Home</a>