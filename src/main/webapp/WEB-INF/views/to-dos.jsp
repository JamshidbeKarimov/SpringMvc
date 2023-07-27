<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jamshidbek_Karimov1
  Date: 7/22/2023
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Dos</title>
</head>
<body>
<div>
    <jsp:useBean id="toDos" scope="request" type="java.util.List<uz.pdp.springmvc.model.ToDo>"/>
    <c:forEach items="${toDos}" var="toDo">
        <br/>
        <h1>${toDo.title}</h1>
    </c:forEach>
</div>

<div>
    <form action="${pageContext.request.contextPath}/to-dos/add" method="post">
        <input type="text" name="title" placeholder="title">
        <input type="text" name="description" placeholder="description">
        <input type="hidden" name="ownerId" value="${userId}">
        <button>Submit</button>
    </form>

</div>

</body>
</html>
