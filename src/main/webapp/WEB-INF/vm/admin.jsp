<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'showAll.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        table,tr,th{
            border: 1px solid red;
            border-collapse: collapse;
        }
       .shopImage{
           height: 100px;
           width: 100px;
       }
    </style>
    <html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h2>登录成功</h2>
用户名:${sessionScope.existManager}
<c:if test="${sessionScope.existtbManager!=null}">
    <a href="/AiLinWeddingDress/src/main/webapp/WEB-INF/vm/goodCreate.jsp">退出</a>
</c:if>
<br>
<a href="goodCreate.jsp">商品添加</a>
<table>
    <tr><th>id</th><th>image</th><th>name</th><th>操作</th></tr>

<c:forEach items="${requestScope.shop}" var="shop">
    <tr>
        <th>${shop.shop.id}</th>
        <th><img src="${shop.shop.image}" alt="" class="shopImage"></th>
        <th>${shop.shop.name}</th>
        <th><a href="/shopGoods/goods?shopId=${shop.id}">管理</a></th>
    </tr>
</c:forEach>
</table>
<br>
</body>
</html>
