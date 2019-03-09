<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1 style="color:red;text-align:center">Case worker Registration Form</h1>
  <form:form action="cwReg" method="POST" modelAttribute="cwModel" >
      <table>
         <tr>
            <td>First Name</td>
            <td><form:input path="firstName"/></td>
         </tr>
         <tr>
            <td>Last Name</td>
            <td><form:input path="lastName"/></td>
         </tr>
         <tr>
            <td>Password</td>
            <td><form:password path="password"/></td>
         </tr>
         <tr>
            <td>Date of Birth</td>
            <td><form:input path="dob"/></td>
         </tr>
         <tr>
            <td>Email id</td>
            <td><form:input path="email"/></td>
         </tr>
         <tr>
            <td>Social Security Number</td>
            <td><form:input path="ssn"/></td>
         </tr>
         <tr>
            <td>Phone Number</td>
            <td><form:input path="phoneNumber"/></td>
         </tr>
         <tr>
            <td>Gender</td>
            <td><form:radiobutton value="M" path="gender"/>Male</td>
            <td><form:radiobutton value="F" path="gender"/>Fe-male</td>
         </tr>
         <tr>
           <td><input type="reset" value="Reset"></td>
           <td><input type="submit" value="Register"></td>
         </tr>
      </table>
  </form:form>
</body>
</html>