<html>
<head>
<title>CRUD DEMO LOGIN PAGE</title>
<script type="text/javascript">
function callValidate() 
{
	        document.forms[0].action = "LoginValidate";
	        document.forms[0].submit();
}

</script>
</head>
<body>
<h2>Welcome to LOGIN PAGE!!!!</h2>

	<form action="" method ="get">
		Enter the User Name and Password:
		<br/>
		<br/>
		User Name: <input type ="text" name ="lun" size = 20 />	
		<br/>
		<br/>
		Password <input type ="password" name ="lpw" size = 20 />	
		<br/>
		<br/>
	
		<input type = "button" onclick="return callValidate()" value = "Login" />
		<input type = "reset" value = "Reset" />
		
	</form>
</body>
</html>
