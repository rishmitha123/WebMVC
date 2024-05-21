<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee</title>
</head>
<body>
	<h2>Employee</h2>
	<form:form method="post" action="register" modelAttribute="emp">
		ID : <form:input path="id"/><br><br>
		Name : <form:input path="name"/><br><br>
		Email : <form:input path="email"/><br><br>
		<input type="submit" value="Register">
		<input type="reset" value="Cancel">
	</form:form>
	
</body>
</html>