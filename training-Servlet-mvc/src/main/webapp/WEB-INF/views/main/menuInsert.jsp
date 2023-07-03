<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<label>메뉴추가</label>
  <form action="menu/insert" method="get">
    <label>메뉴이름 :</label>
    <input type="text" name="menuName"/>
    <br>
    <label>메뉴가격 :</label>
    <input type="number" name="menuPrice"/>
    <br>
    <label>카테고리 :</label>
    <input type="text" name="category"/>
    <br>
    <button type="submit">메뉴추가</button>

  </form>
</body>
</html>
