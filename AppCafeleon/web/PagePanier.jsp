<%-- 
    Document   : PagePanier
    Created on : 16 janv. 2020, 11:27:16
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

	<div class="Titre-Commande"><h1>Votre commande <i>:</i></h1></div>

	<main>
	<div class="commande">
	
		<!-- TODO foreach produits in panier, image et quantité -->
		
		<!-- TODO end -->
		
		
		<h1>Coordonnées</h1>
		<div class="coord">
			<form>
				<div class="group">      
			  <input type="text" required>
			  <span class="highlight"></span>
			  <span class="bar"></span>
			  <label>Nom</label>
				</div>

				<div class="group">      
			  <input type="text" required>
			  <span class="highlight"></span>
			  <span class="bar"></span>
			  <label>Téléphone</label>
				</div>

				<div class="group">      
			  <input type="text" required>
			  <span class="highlight"></span>
			  <span class="bar"></span>
			  <label>Adresse</label>
				</div>

				<div class="Bouton-Ajouter">
				<input type="submit" value="PAYE !!!">
				<svg height="150" width="150">
				<circle cx="75" cy="75" r="60" />
				</svg></a>
				</div>

			</form>
		</div>
	</div>
	</main>

</body>
<%@ include file="footer.jsp" %>
</html>
