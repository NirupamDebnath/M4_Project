<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="store.obj" modelAttribute="emp" method="post">
Name : <form:input path="empName" /><form:errors path="empName"></form:errors><br>
City  : <form:input path="city" /><form:errors path="city"></form:errors><br>
Branch: <form:input path="branch" /><form:errors path="branch"></form:errors><br>
Mobile Number : <form:input path="mobile" /><form:errors path="mobile"></form:errors><br>
Dept   : <form:select path="dept">
		<form:option value="Select"></form:option>
		<form:options  items="${dList}" ></form:options>
		</form:select>
		
		<br>
<input type="submit" value="Store" />
</form:form>

</body>
</html>