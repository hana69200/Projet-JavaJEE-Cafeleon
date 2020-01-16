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
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="PageMenu.jsp" %>
        <h1>Panier</h1>
        
        
        
        <form>
            <legend>votre nom : </legend>
            <input type="text" value="" name="nom" >
            <legend> votre prénom </legend>
            <input type="text" name="prenom">
            <legend> votre adresse mail </legend>
            <input type="email" name="email">
            <input type="submit" value="Commander">
            
            
        
        </form>
    </body>
</html>
