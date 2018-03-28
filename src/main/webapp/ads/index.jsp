<%--
  Created by IntelliJ IDEA.
  User: BettinaTrejo
  Date: 3/27/18
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Ads List:</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>{$ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>


</body>
</html>
