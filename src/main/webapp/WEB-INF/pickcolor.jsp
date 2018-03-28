<%--
  Created by IntelliJ IDEA.
  User: BettinaTrejo
  Date: 3/28/18
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String userColor = request.getParameter("userColor");
        response.sendRedirect("color");
    }
%>




<html>
<head>
    <title>Drill 2</title>
</head>
<body>

<form action="/pickcolor" method="post">
    <label for="userColor">Enter your favorite color:</label>
    <input type="text" id="userColor" name="userColor"><br>
    <input type="submit" value="Find My Color">
</form>


</body>
</html>
