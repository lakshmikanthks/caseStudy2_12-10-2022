<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2 style="color:orange">
<u><i>Company Share List </i></u></h2>
<br>
<h3>
<a href="company">Enlist a new Company</a>
</h2>
<h3>
<table border="2">
  <tr>
    <th>COMPANY ID</th>
    <th>COMPANY NAME</th>
    <th>SHARE PRICE</th>
    <th>Actions</th>
    </tr>
    <c:forEach  items="${companyList}" var="company">
      <tr>
      <td>${company.companyId}</td>
      <td>${company.companyName}</td>
      <td>${company.sharePrice}</td>
      <td><h3>
       	  <a href="edit-company/${company.companyId}">Edit Share Price</a>
       	  &nbsp;&nbsp; 
          <a href="delete-company/${company.companyId}">Delete Company</a>
      </h3><td>
      </tr>
     </c:forEach>
  </table>
</h3>
</div>
</body>
</html>