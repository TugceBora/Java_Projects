<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Profile</title>
</head>
<body>

<h2>Welcome the Dojo <c:out value="${dojo.name}" />! These are your ninjas: </h2>

<table>
<thead>
<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	


</tr> 
</thead>
<tbody>
	<c:forEach items="${dojo.ninjas}" var="ninja">
	<tr>
	<td><c:out value="${ninja.firstName}"/></td>
	<td><c:out value="${ninja.lastName}"/></td>
	<td><c:out value="${ninja.age}"/></td>
	
	</tr>
	</c:forEach>
</tbody>
</table>

</body>
</html>