<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="<c:url value="/styles/homepage.css"/>">
</head>
<body>


<div class="container">
    <div>
        <a href="${pageContext.request.contextPath}/auth/sign-up">
            <button class="buttons">
                Sign Up
            </button>
        </a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/auth/sign-in">
            <button class="buttons">
                Sign In
            </button>
        </a>
    </div>
</div>

</body>
</html>