<%--
  Created by IntelliJ IDEA.
  User: BettinaTrejo
  Date: 3/28/18
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String userGuess = request.getParameter("userGuess");
        response.sendRedirect("userGuess");
    }
%>


<html>
<head>
    <title>Guess</title>
</head>
<body>


<form action="/guess" method="post">
    <label for="userGuess">Guess a number between 1 and 100:</label>
    <input type="text" id="userGuess" name="userGuess"><br>
    <input type="submit" value="Send My Guess!">
</form>



</body>
</html>
