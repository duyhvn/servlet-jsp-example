<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macintoshhd
  Date: 02/03/2023
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="./static/css/styles.css">
</head>
<body>

<h3>Hello World Java EE: Spring MVC, Servlet and JSP</h3>

<div>
    <h1>Welcome to Our Company</h1>

    <p>Pages (HTML)</p>
    <p>Location: <c:out value="${obj.location}"/></p>
    <p>City: <c:out value="${obj.city}"/></p>
    <p>Computer Code (JavaScript)</p>
</div>

</body>
</html>



