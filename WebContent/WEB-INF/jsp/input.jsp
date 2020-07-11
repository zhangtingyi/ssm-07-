<%--
  Created by IntelliJ IDEA.
  User: 13926
  Date: 2018/5/26
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<form action="<%=basePath %>fomatTest">
    <input type="text" name="date"  placeholder="date"><br>
    <input type="text" name="normal"   placeholder="normal"><br>
    <input type="text" name="percent"   placeholder="percent"><br>
    <input type="text" name="money"  placeholder="money">
    <input type="submit" value="提交">
</form>

</body>
</html>
