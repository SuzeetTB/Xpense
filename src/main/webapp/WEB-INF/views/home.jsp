<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login Form</title>
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 
<!-- 	Jstl Maping C:url -->
</head>
<body>
<h1>${loginError}</h1>

	<div class="login">
	  <div class="login-triangle"></div>
	  
	  <h2 class="login-header">Log in</h2>
	
	  <form class="login-container" action="profile" method="post">
	    <p><input name="username" type="text" placeholder="Username" required></p>
	    <p><input name="password" type="password" placeholder="Password" required></p>
	    <p><input type="submit" value="Log in"></p>
	  </form>
	</div>



	<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
