<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/14
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <style>
        *{
            margin: 0;
            padding: 0;

        }
        div{
            width: 400px;
            height: 80px;
            background-color: deepskyblue;
            padding: 20px;
            margin: auto;
           /* margin-top: 250px ;*/
        }
    </style>
</head>
<body>
<div>
    <form action="doRrgister">
        账号：<input type="text" name="username" id="us"><span id="tip"></span><br>
        密码：<input type="text"><br>
        电话：<input type="text"><br>
        <input type="button" value="提交">
    </form>
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            var un ;
            $("#us").change(function () {
                un=$("#us").val();
                $.ajax({
                    url:"doRegister",
                    type:"get",
                    data:{"us":un},
                    success:function (result) {
                        alert(result);
                        if(result===1){
                            $("#tip").text("可以使用")
                        }else {
                            $("#tip").text("用户名已存在")
                        }
                    }
                });
            })
        })
    </script>
</div>
</body>
</html>
