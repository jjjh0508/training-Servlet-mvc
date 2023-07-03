<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>전체 메뉴 조회</h1>
    <table>
        <tr>
            <th>메뉴 이름</th>
            <th>메뉴 가격</th>
        </tr>
        <c:forEach items="${requestScope.menuList}" var="menuAll">
            <tr>
                <td>${menuAll.menuName}</td>
                <td>${menuAll.menuPrice}</td>

            </tr>
        </c:forEach>


    </table>
</body>
</html>
