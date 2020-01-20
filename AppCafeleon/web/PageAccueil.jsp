<%-- 
    Document   : PageAccueil
    Created on : 16 janv. 2020, 11:19:28
    Author     : p1804713
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Page Accueil</title>
</head>
	
<%@ include file="header.jsp" %>
<body>

	<div class="punchline">
	<h1>Nescaféléon</h1>
	<h2>Tout le savoir faire de Nestlu dans un gobelet</h2>
	</div>

	<main>
	<div class="avis">
		<div class="harold">
		<p id="citation">"Un café innovant, un service convivial et un gobelet digne d'une oeuvre d'art. Je reviendrais !"</p>
		<p id="prenom">Harold</p>
		</div>
		<img id="image-harold" src="style/images/harold.jpg" alt="image harold">
	</div>
	<div class="trait">
	<hr>
	</div>

	<div class="suspens">
	<h1>Découvrez vite nos nouveaux cafés<i>.</i><i>.</i><i>.</i></h1>
	</div>
	</main>

</body>
<%@ include file="footer.jsp" %>
</html>
