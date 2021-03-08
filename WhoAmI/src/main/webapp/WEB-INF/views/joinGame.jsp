<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Game</title>
</head>
<body>
	<div class= "center">
	<img src="resources/assets/img/HeaderPhoto.png" alt="Header photo of different faces" class="header-photo">
	<form:form method="POST" modelAttribute="user" action="joinGameSuccess">
		<table>
			<tr>
				<td>Enter the code to join the game:</td>
				<td><form:input path="gameID" /></td>
			</tr>
			<tr>
				<td>Enter your name:</td>
				<td><form:input path="playerName" /></td>
			</tr>
			<tr>
				<td><form:input type = 'hidden' path = 'playerType' value = 'Player'/></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary btn-xl js-scroll-trigger"
					type="submit" value="Join Game"></td>
		</table>
	</form:form>
	</div>
</body>
</html>