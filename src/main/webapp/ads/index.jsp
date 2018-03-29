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
            <table class="table table-striped" style="border: solid 1px black">
                <thead>
                    <tr>
                        <th scope="col"><p style="color: red;">${ad.title}</p></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td scope="row">${ad.description}</td>
                        <td scope="row"><a href="ads/show.jsp?=${ad.id}">More details</a></td>
                    </tr>
                </tbody>
            </table>




            <%--<h2>${ad.title}</h2>--%>
            <%--<p>${ad.description}</p>--%>
        </div>
    </c:forEach>
</div>


</body>
</html>
