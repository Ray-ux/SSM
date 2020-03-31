<%--
  Created by IntelliJ IDEA.
  User: 张烈文
  Date: 2020/3/29
  Time: 1:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加商品</title>
</head>
<body>
   <h3>添加商品界面</h3>
    <form action="/add" METHOD="post">
        <div class="name">
            <span>商品名：</span>
            <p></p>
            <input type="text" id="name" name="name">
            <p></p>
        </div>
        <div class="jg">
            <span>价格：</span>
            <p></p>
            <input type="text" id="jg" name="price">
            <p></p>
        </div>
        <div class="sl">
            <span>数量：</span>
            <p></p>
            <input type="text" id="sl" name="quantity">
            <p></p>
        </div>
        <div class="bc">
            <input type="submit" id="bc" value="保存">
            <p></p>
        </div>
    </form>
</body>
</html>



