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

<nav>
    <li>
        <button onclick="location.href='${pageContext.servletContext.contextPath}/menu/select'">직원 전체 조회하기</button>
    </li>
    <li>
        <form action="menu/selectone" method="get">
            <input type="text" name="menuCode" id="menuCode">
            <button type="submit">단일 메뉴 조회(메뉴코드)</button>
        </form>
    </li>
    <li>
        <form action="menu/updete" method="get">
            <label>메뉴코드</label>
            <input type="text" name="menuCode">
            <select name="status">
                <option value="Y">판매중</option>
                <option value="N">판매중지</option>
            </select>
            <label>메뉴가격</label>
            <input type="text" name="price">

            <button type="submit">판매여부 혹은 가격 수정</button>
        </form>
    </li>

    <label>메뉴삭제</label>
    <form action="menu/delete" method="get">
        <input type="text" name="menuCode">
            <button type="submit">메뉴삭제</button>
    </form>
</nav>
    <label>메뉴추가</label>
    <form action="menu/insert" method="get">
        <label>메뉴이름</label>
        <input type="text" name="menuName">
        <label>메뉴가격</label>
        <input type="number" name="menuPrice">
        <label>카테고리</label>
        <input type="text" name="category">
        <button type="submit">메뉴삭제</button>

    </form>
</body>
</html>
