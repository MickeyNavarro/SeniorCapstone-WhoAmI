<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS Stylesheet -->
        <link href="resources/style.css" rel="stylesheet" />
        <!-- Google Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
<title>Create Game - Enter Username</title>
</head>
<body>
	<div class= "center">
	    	<h1>Who Am I?</h1>
	    	<img src="resources/assets/img/header-photo1.png" alt="Header photo of different faces">
	       	<br/><br/><br/><br/> <!-- temp to avoid overlapping -->
	</div>
	<div class= "center">
		<h2>Create Game</h2>
		<form:form method="POST" modelAttribute="gameBundle" action="gamePage">
			<h4>Enter your username</h4>
				<form:input placeholder= "Player 1" path="playerName"/><font color= "red"><form:errors path="playerName"/></font>
			<input class="formButton createButton" type="submit" value="Next">
		</form:form>
	</div>
</body>
</html>