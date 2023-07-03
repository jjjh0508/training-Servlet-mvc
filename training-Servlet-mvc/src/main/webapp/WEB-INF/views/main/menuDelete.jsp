<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
  <label>메뉴삭제</label>
  <form action="menu/delete" method="get">
    <input type="text" name="menuCode">
    <button type="submit">메뉴삭제</button>
  </form>
</body>
</html>
