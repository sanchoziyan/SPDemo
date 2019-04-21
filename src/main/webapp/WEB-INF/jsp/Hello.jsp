<%--
  Created by IntelliJ IDEA.
  User: sanch
  Date: 2019/4/19
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
    Time:  ${time}
    <br>
    Message: ${message}

    <h3>一行 Java 代码</h3>
    <p>
        今天的日期是: <%=(new java.util.Date())%>
    </p>
    <h3>多行 Java 代码</h3>
    <p>
        你的 IP 地址是：
        <%
            out.println("Your IP address is " + request.getRemoteAddr()+"</br>");
            out.println("一段代码 ");
        %>
    </p>
</body>
</html>
