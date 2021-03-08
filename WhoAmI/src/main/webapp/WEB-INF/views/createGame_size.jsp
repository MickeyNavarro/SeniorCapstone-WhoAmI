<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS Stylesheet -->
        <link href="resources/style.css" rel="stylesheet" />
        <!-- Google Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
<title>Create Game - Choose Size</title>
</head>
<body>
	<div class= "center">
	    	<img src="resources/assets/img/HeaderPhoto.png" alt="Header photo of different faces" class="header-photo">

		<h2>Create Game</h2>
		<form:form method="POST" modelAttribute="gameBoard" action="createGame-uploadImages">
			<h4>Choose the size of your game board</h4>
				<select name="size" id="size">
				  <option value="3">Easy (3 x 3)</option>
				  <option value="4">Medium (4 x 4)</option>
				  <option value="5">Hard (5 x 5)</option>
				</select>
			<input class="formButton createButton" type="submit" value="Next">
		</form:form>
	</div>
</body>
</html>