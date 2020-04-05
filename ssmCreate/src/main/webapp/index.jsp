<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2020/4/3
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
    <a href="account/findAll">试</a>
</body>

<h3>保存</h3>
<form action="account/save" method="post">
    姓名：<input type="text" name="name">
    金额：<input type="text" name="money">
    <input type="submit" value="保存">
</form>
</html>
