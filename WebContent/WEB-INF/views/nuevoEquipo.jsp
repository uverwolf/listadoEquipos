<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Titulo</title>
</head>
<body>
<h1>Crear un equipo</h1>
<form action="Equipos" method="post">
<input type="text" name="nombre">
</form>

<a href="<c:url value = "/Home"/>">home</a>
</body>
</html>