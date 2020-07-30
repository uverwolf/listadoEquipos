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
<h1>Nuevo jugador</h1>
<form action="Jugadores" method="post">
	<div>
        <label>Primer nombre</label>
        <input type="text" name="nombre">
    </div>
    <div>
        <label for="">Apellido</label>
        <input type="text" name="apellido">
    </div>
    <div>
        <label for="">Edad</label>
        <input type="text" name="edad">
    </div>
	<input type="submit">
</form>
</body>
</html>