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

<h3>Hello World Java EE: Servlet and JSP</h3>

<div>
    <form action="sayGreeting" method="post">
        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName" placeholder="Your name..">

        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName" placeholder="Your last name..">

        <label for="country">Country</label>
        <select id="country" name="country">
            <option value="australia">Australia</option>
            <option value="canada">Canada</option>
            <option value="usa">USA</option>
        </select>

        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>



