<%--
  Created by IntelliJ IDEA.
  User: Jamshidbek_Karimov1
  Date: 7/22/2023
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/auth/sign-in" method="post">
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <input type="submit">
</form>

</body>
</html>
