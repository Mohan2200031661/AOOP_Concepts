<%@page import="entity.DBEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>MVC READ ALL</title>
	</head>
	<body>
		<%@ include file="dashboard.jsp" %>
		<br/>
		<%@ page import ="model.*,java.util.*" %>
		<table border="1">
			<tr>
				<th>UserName</th>
				<th>Password</th>
			</tr>
		<% 
		@SuppressWarnings("unchecked")
		List<DBEntity> LD = (List<DBEntity>)request.getAttribute("res2");
 
	    for(DBEntity B : LD)
	    {%>
	        <tr>
	        	<td><%= B.getUsername() %></td>
	        	<td><%= B.getPassword() %></td>
	        	
	        </tr>
	    <%}%>
	</table>
</body>
</html>