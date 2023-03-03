<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Login Success Page</title>
</head>
<body>
<%
    //allow access only if session exists
    String user = (String) session.getAttribute("user");
    String userName = null;
    String sessionID = null;
    Cookie[] cookies = request.getCookies();
    if(cookies !=null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("user")) userName = cookie.getValue();
            if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
        }
    }
%>
<h3>Hi <%=userName %> <c:out value="${user}"/> , Login successful. Your Session ID=<%=sessionID %></h3>
<br>
User=<%=user %>
<br>
<h4>Location: <c:out value="${admin.location}"/></h4>
<h5>City: <c:out value="${admin.city}"/></h5>
<a href="CheckoutPage.jsp">Checkout Page</a>
<form action="logout" method="post">
    <input type="submit" value="Logout" >
</form>
</body>
</html>
