<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goodUpdate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- <script type="text/javascript">
    function today(){//构建方法
        var today=new Date();//new 出当前时间
        var h=today.getFullYear();//获取年
        var m=today.getMonth()+1;//获取月
        var d=today.getDate();//获取日
        var H = today.getHours();//获取时
        var M = today.getMinutes();//获取分
        var S = today.getSeconds();//获取秒
        return h+"-"+m+"-"+d+" "+H+":"+M+":"+S; //返回 年-月-日 时:分:秒
}
document.getElementById("today").value = today();//将获取到的 年-月-日 时:分:秒 赋给input文本输入框
</script>
 -->
  </head>
  
  <body>

  <form action="/adminGoods/updateGood?shopId=${requestScope.shopId}" method="post">
  	<input type="hidden" name="id" value="${requestScope.good.id}">
	visibility:<input name="visibility" value="${requestScope.good.visibility}"><br>
	isPutaway:<input name="isPutaway" value="${requestScope.good.isPutaway}"><br>
  	name:<input name="name" value=" ${requestScope.good.name}"><br>
    hemline:<input name="hemline" value="${requestScope.good.hemline}"><br>
	description:<input name="description" value="${requestScope.good.description}"><br>
	style:<input name="style" value="${requestScope.good.style}">	<br>
  	color:<input name="color" value="${requestScope.goodO.color}"><br>
  	quantity:<input name="quantity" value="${requestScope.good.quantity}"><br>
	saleCount:<input name="saleCount" value="${requestScope.good.saleCount}"><br>
	weight:<input name="weight" value="${requestScope.good.weight}"><br>
	status<input name="status" value="${requestScope.good.status}"><br>
	price:<input name="price" value="${requestScope.good.price}"><br>
  <input type="submit" value="修改">
  </form>
  </body>
</html>
