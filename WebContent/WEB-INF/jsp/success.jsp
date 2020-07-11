<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 13926
  Date: 2018/5/28
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="data" action="" method="post">
<form:input path="date"/><br>
<form:input path="normal"/><br>
<form:input path="percent"/><br>
<form:input path="money"/><br>
</form:form>
</body>
</html>
