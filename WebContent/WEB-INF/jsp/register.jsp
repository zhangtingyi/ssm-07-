<%--
  Created by IntelliJ IDEA.
  User: 13926
  Date: 2018/5/26
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=basePath%>register">
        <input type="text" name="username" placeholder="用户名">
        <input type="password" name="password"  placeholder="密码">
        <input type="submit" value="注册">
    </form>
    <!--用与显示错误信息-->
    <p>${message}</p>
</body>
</html>
