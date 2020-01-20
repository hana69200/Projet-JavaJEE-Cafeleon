<%-- 
    Document   : PageProduit
    Created on : 16 janv. 2020, 11:27:06
    Author     : p1804713
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>

	<div class="Nos-Cafes"><h1>Savourez nos Cafés <i>!</i></h1></div>

	<main>
	<!-- TODO loop for each product in Products -->
		<div class="cafeItem">
			<div class="Titre-cafeItem">
				<!-- TODO get Intitule -->
				<h1 id="Nom-Suedois">INTITULE ICI</h1>
			</div>
			<div class="Display-Cafe-Texte">
				<!-- TODO src = getTitre.png -->
				<img src="style/images/PurpleCafe.png" alt="Café">
				<div class="Texte">
						<!-- TODO get saveur -->
					<p>SAVEUR ICI</p>
					<p>Miam !</p>
					<form>
						<!-- getID -->
					<input type="hidden" value="ID ICI">
					</form>

					<!-- SUBMIT -->
					<div class="Bouton-Ajouter">
					<input type="submit" value="Ajouter">
					<svg height="150" width="150">
					<circle cx="75" cy="75" r="60" />
					</svg></a>
					</div>
					
				</div>
			</div>
		</div>
	<!-- TODO end of loop -->
	</main>

</body>
<%@ include file="footer.jsp" %>
</html>