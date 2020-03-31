<%--
  Created by IntelliJ IDEA.
  User: 张烈文
  Date: 2020/3/29
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改商品</title>
</head>
<body>
<h3>修改商品界面!!!!!请认真核对修改信息哦..........</h3>
<form action="/edit" METHOD="post">
    <input type="hidden" name="id" value="${Good.id}">
    <div class="name">
        <span>商品名：</span>
        <p></p>
        <input type="text"  name="name" value="${Good.name}">
        <p></p>
    </div>
    <div class="jg">
        <span>价格：</span>
        <p></p>
        <input type="text" name="price" value="${Good.price}">
        <p></p>
    </div>
    <div class="sl">
        <span>数量：</span>
        <p></p>
        <input type="text"  name="quantity" value="${Good.quantity}">
        <p></p>
    </div>
    <div class="bc">
        <input type="submit"  value="保存" >
        <p></p>
    </div>
</form>
</body>
</html>
