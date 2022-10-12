<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form:form method="post" action="company" modelAttribute="companyRecord">
<h2>
<form:input type="hidden" path="companyId" value="00"/>
<br><br> 
Enter Company Name: <form:input type="text" path="companyName"/>
<br><br>
Enter Company Share Price: <form:input type="text" path="sharePrice"/>
<button type="submit">Submit</button>	
</h2>
</form:form>
</div>
</body>
</html>