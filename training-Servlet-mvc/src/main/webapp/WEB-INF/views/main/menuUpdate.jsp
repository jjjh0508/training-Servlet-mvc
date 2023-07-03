<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<div>
<form action="menu/updete" method="get">
  <label>메뉴코드</label>
  <input type="text" name="menuCode">
  <select name="status">
    <option value="Y">판매중</option>
    <option value="N">판매중지</option>
  </select>
  <br/>
  <label>메뉴가격</label>
  <input type="text" name="price">

  <button type="submit">판매여부 혹은 가격 수정</button>
</form>
</div>

</body>
</html>
