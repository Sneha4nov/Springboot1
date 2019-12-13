<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

below enter detail to ADD data <br>

<form action="addA">
<input type="text" name="aid"> <br>
<input type="text" name="aname"> <br>
<input type="text" name="tech"> <br>
<input type="submit"> <br>
</form>

<br><br>
below enter id to SEARCH data<br> <br>
<form action="getA">
<input type="text" name="aid"> <br>

<input type="submit"> <br>
</form>


<br><br>
below enter id to DELETE data<br> <br>
<form action="deleteA">
<input type="text" name="aid"> <br>

<button type="submit">delete </button> <br>
</form>




</body>
</html>