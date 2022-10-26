<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<meta charset="UTF-8">
<title>jdbc </title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/practice" user="root" password="Muz8867294668"/>
	<sql:query var="rs" dataSource="${db}"> select*from students </sql:query> 
	<c:forEach items="${rs.rows}" var="r">
	<c:out value="${r.id}"></c:out> :<c:out value="${r.name}"></c:out> : <c:out value="${r.marks}"></c:out> <br>
	</c:forEach>
</body>
</html>