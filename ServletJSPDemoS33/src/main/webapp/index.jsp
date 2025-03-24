<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Arithmetic Operations</title>
			<script type="text/javascript">
			function clkAdd() 
			{
				        document.forms[0].action = "ServAdd";
				        document.forms[0].submit();
			}
			function clkSub() 
			{
				        document.forms[0].action = "ServSub";
				        document.forms[0].submit();
			}
			function clkMul() 
			{
				        document.forms[0].action = "ServMul";
				        document.forms[0].submit();
			}
			function clkDiv() 
			{
				        document.forms[0].action = "ServDiv";
				        document.forms[0].submit();
			}		
			</script>
	</head>
	<body>
		<h1>BASIC ARITHMETIC OPERATIONS</h1>
		<br/>
		<form action = "" method = "GET">
			Value A : <input type = "text" name ="va"><br/>
			Value B : <input type = "text" name ="vb"><br/><br/>
			<button type ="button" onclick="return clkAdd()"> + </button><br/>
			<button type ="button" onclick="return clkSub()"> - </button><br/>
			<button type ="button" onclick="return clkMul()"> * </button><br/>
			<button type ="button" onclick="return clkDiv()"> / </button><br/>
			<button type ="reset"> Reset </button><br/>
		</form>
	</body>
</html>