<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JDBC-Serv-JSP-CRUD</title>
<script type="text/javascript">
function readAll() 
{
	        document.forms[0].action = "ReadAll";
	        document.forms[0].submit();
}
function insertNew() 
{
	 		document.forms[0].action = "Insert";
	        document.forms[0].submit();
}
function searchUser() 
{
	        document.forms[0].action = "Search";
	        document.forms[0].submit();
}
function updateUser() 
{
	        document.forms[0].action = "Update";
	        document.forms[0].submit();
}
function deleteUser() 
{
	        document.forms[0].action = "Delete";
	        document.forms[0].submit();
}
function logoutUser() 
{
	        document.forms[0].action = "Logout";
	        document.forms[0].submit();
}

</script>



</head>
<body>
	<%@ page import = "model.*" %>
	
	
	<br/>
	<H3>THIS PAGE IS TO PERFORM CRUD OPERATIONS ON LOGIN TABLE IN AOOPDB DATABASE</H3>
<br/>
<br/>
<%String uname=(String)session.getAttribute("name");   %>
<H4>Welcome <%=uname %>!</H4>
	
<form method ="get">
	
	Username: <input type= "text" name = "dun" size = 20 />
	<br/><br/>
	Password: <input type= "text" name = "dpwd" size = 20 />
	<br/><br/>
	<input type="button" value = "READ ALL" size = 10  onclick= "return readAll()"/>
	<input type="button" value = "INSERT" size = 10 onclick= "return insertNew()" />
	<input type="button" value = "SEARCH" size = 10  onclick="return searchUser()"/>
	<input type="button" value = "UPDATE" size = 10 onclick="return updateUser()"/>
	<input type="button" value = "DELETE" size = 10  onclick="return deleteUser()"/>
	<input type="reset" value = "CLEAR TEXTBOX VALUES" size = 15 />
	<br/>
	<input type="button" value = "LOGOUT" size = 10  onclick="return logoutUser()"/>
	
	</form>
	
</body>
</html>