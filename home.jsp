<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP page</title>
</head>
<body>

this is a new line <br>

<%
	
	try{
		int a=20;
		int c= a/0;
	}catch(Exception e ){
		out.println("oops something went wrong <br>");

		
		out.println("<h1> may be "+ e.getMessage() + "error  </h1>");
		
	}

out.println("this is jsp page");
%>

</body>
</html>