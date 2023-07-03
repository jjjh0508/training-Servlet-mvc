<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>단일 메뉴 조회</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
    <form action="menu/selectone" method="get">
        <input type="text" name="menuCode" id="menuCode">
        <button type="submit">단일 메뉴 조회(메뉴코드)</button>
    </form>
</body>
</html>
