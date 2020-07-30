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
<h1><c:out value="${nombreEquipo}" /></h1>

<h3><a href="<c:url value = "/Jugadores"/>">Registrar Jugador</a></h3>
<table>
<tr>
	<td>nombre</td>
	<td>apellido </td>
	<td>edad</td>
 </tr>
 
<c:forEach var="jugadores" items="${jugadoresArray}">
<c:if test="${jugadores.getEquipo().equals(nombreEquipo)}">
    <tr>
    <td><c:out value="${jugadores.getPrimerNombre()}" /></td>
  	<td><c:out value="${jugadores.getApellido()}" /></td>
  	<td><c:out value="${jugadores.getEdad()}" /></td>
  	<td><a href="<c:url value = "/EliminarJugador?nombre=${jugadores.getPrimerNombre()}"/>">Eliminar</a> </td>
    </tr>
    </c:if>
</c:forEach>
 
</table>
</body>
</html>