<%--
  Created by IntelliJ IDEA.
  User: 达达
  Date: 2017/8/15
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table>
        <tr><th>goodsId</th><th>create_time</th><th>putaway_time</th><th>last_update</th><th>image</th><th>图片管理</th><th>name</th><th>hemline</th><th>desrciption</th><th>style</th><th>color</th><th>quantity</th><th>sale_count</th><th>weight</th><th>price</th><th colspan="2">操作</th></tr>
        <c:forEach items="${requestScope.addGoods}" var="goods">
            <tr>

                <th>${goods.id}</th>
                <th>${goods.createTime}</th>
                <th>${goods.putawayTime}</th>
                <th>${goods.lastUpdate}</th>
                <th><img src=""></th>
                <th><a>管理</a></th>
                <th>${goods.name}</th>
                <th>${goods.hemline}</th>
                <th>${goods.description}</th>
                <th>${goods.style}</th>
                <th>${goods.color}</th>
                <th>${goods.quantity}</th>
                <th>${goods.saleCount}</th>
                <th>${goods.weight}</th>
                <th>${goods.price}</th>
                <th>
                    <a href="/shopGoods/createSG?goodsId=${goods.id}&shopId=${requestScope.shopId}">添加</a>
                </th>

            </tr>
        </c:forEach>
    </table></center>
</body>
</html>
