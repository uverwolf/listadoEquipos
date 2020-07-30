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

<h1>ddd <c:out value="${largo}" /></h1>
<a href="<c:url value = "/Equipos"/>">Crear Equipo</a>
<table>
    <tr>
        <th>nombre</th>
        <th>jugadores</th>
        <th>acciones</th>
    </tr>
    
<c:forEach var="tablaEquipos" items="${equipos}">
    <tr>
    <td><c:out value="${tablaEquipos.getNombre()}" /></td>
    <td></td>
  	<td> <a href="<c:url value = "/Equipos?nombre=${tablaEquipos.getNombre()}"/>">Ver detalles</a> </td>
  		<td> <a href="<c:url value = "/EliminarEquipo?nombre=${tablaEquipos.getNombre()}"/>">Eliminar</a> </td>
    </tr>
    
</c:forEach>
</table>
</body>
</html>