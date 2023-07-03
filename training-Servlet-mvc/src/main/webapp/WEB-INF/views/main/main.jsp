<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 2:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

    <img src="/resources/image/image.png" alt="먹는 장첸" width="206" height="182"/>

<nav>
    <li>
        <a href="/menu/select">메뉴 전체 조회</a>
    </li>
    <li>
        <a href="/menuSelectOne">단일 메뉴 조회</a>
    </li>
    <li>
        <a href="/menuUpdate">판매여부 혹은 가격 수정</a>
    </li>
    <li>
        <a href="/menuDelete">판매중지</a>
    </li>
    <li>
        <a href="/menuInsert">메뉴 추가</a>
    </li>
</body>
</html>
