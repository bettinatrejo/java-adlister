<%--
  Created by IntelliJ IDEA.
  User: BettinaTrejo
  Date: 3/27/18
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

//    String password = request.getParameter("password");
    if (username == null) {
        username = "Test";
    }
    if (password == null) {
        password = "Test";
    }
    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>


<html>
<head>
    <title>Login</title>
</head>
<body>
<jsp:include page="partials/signin-navbar.jsp" />
<h1>Welcome, please log in to your account!</h1>

<form action="login.jsp" method="post">
    <label for="username">Username: </label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password:  </label><br>
    <input type="password" id="password" name="password"><br>
    <input type="submit">
</form>


</body>
</html>
