<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS Stylesheet -->
        <link href="resources/style.css" rel="stylesheet" />
        <!-- Google Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
		
        <title>Game Board</title>
    </head>
    <body>
	    <div class= "center">
	    	<img src="resources/assets/img/HeaderPhoto.png" alt="Header photo of different faces" class="header-photo">     	
	       	
			  <section class="memory-game">
			  	<c:forEach var = "image" items = "${gameBundle.images}">
				    <div class="memory-card">
				      <img class="front-face" src="resources/assets/uploads/${image.multipartFile}"/>
				      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
				    </div>
				</c:forEach>
			  </section>
			
			
			<!-- TEST BOARD -->
			  <!--<section class="memory-game">
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			     <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    
			     <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div> 
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div> 
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div> 
			    <div class="memory-card">
			      <img class="front-face" src="resources/assets/uploads/ariel.jpeg"/>
			      <img class="back-face" src="resources/assets/img/Card1.png" alt="Back Face of Who Am I Card" />
			    </div>
			    
			  </section>-->
	       	
	       	  <script src="resources/scripts.js"></script>
	       	
	    </div>
    </body>
</html>
