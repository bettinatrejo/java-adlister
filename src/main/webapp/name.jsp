<%--
  Created by IntelliJ IDEA.
  User: BettinaTrejo
  Date: 3/28/18
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String name = request.getParameter("name");
        response.sendRedirect("name-page");
    }
%>


<html>
<head>
    <title>Drill 1</title>
</head>
<body>


<form action="/name" method="POST">
    <label for="name">Enter Name:</label><br>
    <input type="text" name="name" id="name">
    <input type="submit" value="Submit">
</form>

</body>
</html>
