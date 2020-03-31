<%--
  Created by IntelliJ IDEA.
  User: 张烈文
  Date: 2020/3/28
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品列表</title>
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
<section class="banner">
    <div class="container">
        <div>
            <h1>商品</h1>
            <p>商品列表</p>
        </div>
    </div>
</section>
<section class="main">
    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th >名称</th>
                <th>价格</th>
                <th >数量</th>
                <th>更新时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${Goods}" var="goods">
                <tr>
                    <td>${goods.name}</td>
                    <td>${goods.price}</td>
                    <td>${goods.quantity}</td>
                    <td>${goods.updateTime}</td>
                    <td>
                        <a href="/toEdit?id=${goods.id}">修改</a>&nbsp;&nbsp;
                        <a href="/delete?id=${goods.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/toAdd">新建</a>
    </div>
</section>
</body>
</html>
