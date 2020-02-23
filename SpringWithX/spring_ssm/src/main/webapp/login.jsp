<%--
  Created by IntelliJ IDEA.
  User: iwsx
  Date: 2020/1/11
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>login 页面</h1>
    <form action="/user/login">
        用户：<input type="text" name="username">
        <br>
        密码：<input type="text" name="password">
        <br>
        <input type="submit" value="提交">
    </form>


    <style>
        form{
            margin: 10px auto;
            border: 1px solid skyblue;
        }
        /*form input{*/
            /*display: block;*/
            /**/
        /*}*/
    </style>
</body>
</html>
