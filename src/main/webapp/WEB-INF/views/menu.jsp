<%--
  Created by IntelliJ IDEA.
  User: Jamshidbek_Karimov1
  Date: 7/22/2023
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
<h1>${user.id}</h1>

<a href="${pageContext.request.contextPath}/to-dos/${user.id}">To Dos</a>
<a href="${pageContext.request.contextPath}/user/${user.id}">Check Get method</a>

</body>
</html>
