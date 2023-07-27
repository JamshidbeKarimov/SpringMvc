<%--
  Created by IntelliJ IDEA.
  User: Jamshidbek_Karimov1
  Date: 7/22/2023
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/auth/sign-up" method="post">
    <input type="text" name="name" placeholder="name">
    <input type="number" name="age" placeholder="age">
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <input type="submit">
</form>

</body>
</html>
