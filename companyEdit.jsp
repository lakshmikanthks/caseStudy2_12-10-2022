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
<h3 style="color:orange">
<u><i>Share Price Updation </i></u></h3>
<form:form method="post" action="edit-share-price" modelAttribute="companyRecord">
<h2>
Company Id<form:input type="text" path="companyId" readonly="true"/>
<br><br> 
Company Name: <form:input type="text" path="companyName" readonly="true"/>
<br><br>
Enter New Share Price: <form:input type="text" path="sharePrice"/>
<button type="submit">Submit</button>	
</h2>
</form:form>
</div>
</body>
</html>