<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome to welcome page</h1>
	<form method="POST" action="welcomeServlet">
		<label for="name" title="Enter the name">Name: </label> 
		<input type="text" id="txtName" name="name" value="<%= request.getParameter("name")%>"/><br>
		<input type="submit" value="Submit" /><br> 
	</form>
</body>
</html>