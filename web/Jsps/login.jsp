<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/14
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style>
        *{
            margin: 0;
            padding: 0;

        }
        #login{
            width: 200px;
            height: 130px;
            background-color: deepskyblue;
            text-align: center;
            padding-top: 10px;
            margin: 250px auto auto;
        }
    </style>
</head>
<body>
<div></div>
<div id="login">
    <form action="doLogin">
        账号：<input type="text"><br>
        密码：<input type="text"><br>
        <input type="submit" value="登录">
        <a href="register">注册</a>
    </form>

</div>
</body>
</html>
