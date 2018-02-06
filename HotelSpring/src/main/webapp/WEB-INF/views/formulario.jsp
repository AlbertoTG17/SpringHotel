<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
	
		<form:form method="POST" modelAttribute="reserva" action="reservar">
		
			<table>
			
	            <tr>
	                <td><label for="email">Email: </label> </td>
	                <td><form:input path="email" id="email"/></td>	                
	            </tr>
	            
	            <tr>
	                <td><label for="fechaEntrada">Fecha de entrada: </label> </td>
	                <td><form:input path="fechaEntrada" id="fechaEntrada"/></td>	                
	            </tr>	            
	            
	            <tr>
	                <td><label for="fechaSalida">Fecha de salida: </label> </td>
	                <td><form:input path="fechaSalida" id="fechaSalida"/></td>	      
	                <td>dd/MM/yyyy</td>          
	            </tr>
	            
	            <tr>
	                <td><label for="personas">Personas: </label> </td>
	                <td><form:input path="personas" id="personas"/></td>	                
	            </tr>
	            
	            
	            
		 	</table>
		 	
		 	<input type="submit" value="Reservar"/>
		 	
		</form:form>
		
		<a href="index.jsp">Ir al inicio</a>
	
	</div>

</body>
</html>