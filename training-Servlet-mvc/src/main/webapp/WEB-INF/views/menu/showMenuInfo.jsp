<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>
    메뉴이름 : ${requestScope.selectOne.menuName}
    메뉴가격 : ${requestScope.selectOne.price}
    카테고리명 : ${requestScope.selectOne.categoryName}
    판매상태 : ${requestScope.selectOne.orderableSataus}

</body>
</html>
