<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="style.css" type="text/css" media="screen" />

<title>Geektic</title>

</head>
<body>

<div id="container">

<div id="topbar"><h1>Bienvenue sur GEEKTIC</h1></div>

<div id="navbar"><h2>Vous recherchez l'amour et vous êtes un GEEK ? Ne cherchez plus, GEEKTIC est fait pour vous !!!<h2>

</div>

<div class="carre">

<div id="main">


<h5>Votre pseudo :
<input type="text" name="nom" size="18">
</h5>


<h3>Un Geek, Une Geekette, Un Centre D'intérêt :<h3>

    <FORM>
    <SELECT name="interet" size="1">
    <OPTION>Programmation
    <OPTION>Jeux Vidéo
    <OPTION>Cinéma
    <OPTION>Sexe
    </SELECT>
    </FORM>

<h3>L'amour de votre vie, oui mais de quelle sexe :<h3>


<div class="gauche">
<ul>
		<li><input type="radio" name="Sexe" value="0" CHECKED id="radio0"> <label for="radio0">Une Jolie Geek</label></li>
		<li><input type="radio" name="Sexe" value="1" id="radio1"> <label for="radio1">Un Beau Geek</label></li>
		<li><input type="radio" name="Sexe" value="2" id="radio2"> <label for="radio2">Les 2 !!! (cochon(ne))</label></li>
</ul>
</div>

<div class="g">
<h5>Let's GOOOO --------><h5>
</div>

<div class="d">
	<section>
				<input type="submit" class="coeur" value="" />
	</section>
	
</div>

<div class="b">
<a href="http://www.geekmemore.com"TARGET=_BLANK>Notre Partenaire</a>
</div>

</div>

</div>

</div>
</body>
</html>



