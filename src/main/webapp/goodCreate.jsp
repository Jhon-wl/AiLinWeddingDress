<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'createGood.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  用户名:
<span>${sessionScope.existtbManager}</span>
<c:if test="${sessionScope.existtbManager!=null}">
	<a href="tbManager/logout">退出</a>
</c:if>
<br> 
 
  请输入商品信息:<br>
  		<form action="/file/upload"  method="post" enctype="multipart/form-data">
    	image:<input type="file" name="file">
		image2:<input type="file" name="file">
    	<input type="submit" value="提交">
    	</form>
  <hr>
  <form action="/file/down" method="get">
      <input type="submit" value="下载">
  </form>

  <form action="/adminGoods/createGood" method="post">
		<%--createTime:<input  name="createTime" id="today"><br>--%>
		<%--putawayTime:<input name="putawayTime"><br>--%>
		<%--lastUpdate:<input name="lastUpdate"><br>	--%>
		<%--visibility:<input name="visibility"><br>--%>
		<%--isPutaway:<input name="isPutaway"><br>--%>
		name:<input name="name"><br>
		hemline:<input name="hemline"><br>
		description:<input name="description"><br>
		style:<input name="style">	<br>
		color:<input name="color"><br>
		quantity:<input name="quantity"><br>
		saleCount:<input name="saleCount"><br>
		weight:<input name="weight"><br>		
		status<input name="status"><br>
		price:<input name="price"><br>
		<input type="submit" value="添加">
    </form>
  </body>
</html>
