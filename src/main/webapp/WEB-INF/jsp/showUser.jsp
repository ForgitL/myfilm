<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dtl
  Date: 2018/3/2
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
<c:if test="${!empty list}">
    <c:forEach var="user" items="${list}">
        ${user.UName} <br/>
    </c:forEach>
</c:if>
</body>
</html>
