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
<title>Create Game - Upload Images</title>
</head>
<body>
	<div class= "center">
	    	<h1>Who Am I?</h1>
	    	<img src="resources/assets/img/header-photo1.png" alt="Header photo of different faces">
	       	<br/><br/><br/><br/> <!-- temp to avoid overlapping -->
	</div>
	<div class= "center">
		<h2>Create Game</h2>
		<form:form method="POST" modelAttribute="gameBundle" action="createGame-enterUsername" enctype="multipart/form-data">
			<h4>Upload your images</h4>
			<table class="table">
				<tr>
					<th><label>Image #</label></th>
					<th><label>Details</label></th>
				</tr>
				<c:forEach var = "image" items = "${gameBundle.images}">
					<tr>
						<td><c:out value = "${image.ID}"/></td>
						<td>Name of Person:<input type="text" name="name" value = "${image.name}"><font color= "red"><form:errors name="name"/></font>
							<br/>
							File:<input type="file" name="file" value = "${image.multipartFile}" accept="image/png, image/jpeg"  /><font color= "red"><form:errors name="file"/></font>
						</td>
					</tr>
				</c:forEach>
			</table>
			<input class="formButton createButton" type="submit" value="Next">
		</form:form>
		
		<p><font color="red">${error}</font></p>
	</div>
</body>
</html>