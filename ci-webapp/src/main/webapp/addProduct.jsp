<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddProductServlet" method="post">
	Enter Id:<input type="number" name="id"/>
	Enter Name:<input type="text" name="name"/>
	Enter price:<input type="number" name="price"/>
	<button type="submit">Add</button>
</form>

</body>
</html>