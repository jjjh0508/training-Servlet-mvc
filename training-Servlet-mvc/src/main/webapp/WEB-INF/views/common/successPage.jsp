<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-07-03
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<script type="text/javascript">
  (function () {
    const successCode = '${requestScope.successCode}';

    let movePath = '';
    switch (successCode) {
      case '직원 등록에 성공':
        movePath = '${pageContext.servletContext.contextPath}/menu/select';
        break;
      case '메뉴수정 완료':
        movePath = '${pageContext.servletContext.contextPath}/menu/select';
        break;
      case '메뉴삭제 완료':
        movePath = '${pageContext.servletContext.contextPath}/menu/select';
    }
    alert(successCode);
    location.href=movePath;
  })();
  <!--익명함수 뒤에 ()붙이면 페이지 열리면 실행된다.-->
</script>
</body>
</html>
