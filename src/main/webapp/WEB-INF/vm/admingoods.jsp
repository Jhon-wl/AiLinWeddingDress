<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'admingoods.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        table,tr,th {
            border: 1px solid red;
            border-collapse:collapse;
        }
    </style>
</head>

<body>
用户名:
<span>${sessionScope.existtbManager}</span>
<c:if test="${sessionScope.existtbManager!=null}">
    <a href="tbManager/logout">退出</a>
</c:if>

<c:forEach items="${requestScope.goodList}" var="goods" step="1000">
<a href="/adminGoods/selectAllGoods?shopId=${goods.shop.id}">添加</a>
</c:forEach>
<center>
    <table>
        <tr><th>shopId</th><th>goodsId</th><th>create_time</th><th>putaway_time</th><th>last_update</th><th>image</th><th>图片管理</th><th>name</th><th>hemline</th><th>desrciption</th><th>style</th><th>color</th><th>quantity</th><th>sale_count</th><th>weight</th><th>price</th><th colspan="2">操作</th></tr>
        <c:forEach items="${requestScope.goodList}" var="goods">
            <tr>
                <th>${goods.shop.id}</th>
                <th>${goods.goods.id}</th>
                <th>${goods.goods.createTime}</th>
                <th>${goods.goods.putawayTime}</th>
                <th>${goods.goods.lastUpdate}</th>
                <th><img src=""></th>
                <th><a>管理</a></th>
                <th>${goods.goods.name}</th>
                <th>${goods.goods.hemline}</th>
                <th>${goods.goods.description}</th>
                <th>${goods.goods.style}</th>
                <th>${goods.goods.color}</th>
                <th>${goods.goods.quantity}</th>
                <th>${goods.goods.saleCount}</th>
                <th>${goods.goods.weight}</th>
                <th>${goods.goods.price}</th>
                <th>
                    <a href="/shopGoods/goodsShelve?goodsId=${goods.goods.id}&shopId=${goods.shop.id}">下架</a>
                </th>
                <th><a href="/adminGoods/selectGood?id=${goods.goods.id}&shopId=${goods.shop.id}">修改</a></th>
            </tr>
        </c:forEach>
    </table></center>
</body>
</html>
