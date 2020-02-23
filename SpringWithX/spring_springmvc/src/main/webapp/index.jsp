<%--
  Created by IntelliJ IDEA.
  User: iwsx
  Date: 2020/2/3
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-2.0.0.min.js"></script>
</head>
<body>
    <a href="/user/sayhi">跳转到hi页面</a>
    <br/>
    <form action="/user/success02" method="post">
        usrname: <input type="text" name="username"><br>
        age: <input type="text" name="age"><br>
        <input type="submit" value="测试提交RequestBody请求体">
    </form>

    <br/>
    <form action="/user/testPathvariable/1" method="get">
        <input type="submit" value="测试rest风格提交">
    </form>

    <br/>
    <form action="/user/testRequestHeader" >
        usrname: <input type="text" name="username"><br>
        age: <input type="text" name="age"><br>
        <input type="submit" value="测试请求头">
    </form>

    <br/>
    <form action="/user/testCookieValue" >
        usrname: <input type="text" name="username"><br>
        age: <input type="text" name="age"><br>
        <input type="submit" value="测试cookie">
    </form>

    <br/>
    <button id="testAjax">测试ajax</button>

    <br/>
    <form action="/user/testUploadFile" method="post" enctype="multipart/form-data">
        File: <input type="file" name="file">
        Desc: <input type="text" name="desc">
        <input type="submit" value="测试上传文件">
    </form>

    <br/>
    <form action="/user/testParamInterceptor">
        <input type="submit" value="测试参数拦截器">
    </form>

    <br/>
    <a href="/user/testMathError/0">测试异常页面</a>

    <br/>
    <a href="/user/testResponseStatusExceptionResolver/5">测试StatusExceptionResolver</a>

    <br/>
    <form action="/user/testDateConvertor" >
        usrname: <input type="text" name="userName"><br>
        password: <input type="text" name="password"><br>
        birthday: <input type="text" name="birthday"><br>
        price: <input type="text" name="price"><br>
        <input type="submit" value="测试类型转换">
    </form>


    <script>
        $(function () {
            $("#testAjax").click(function () {
                //alert("hello btn");
                $.ajax({
                    url:"user/testAjax2",
                    contentType: "application/json;charset=UTF-8",
                    data:'{"username":"haha", "id":1}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器端响应的json数据，进行解析
                        alter(data.username);
                    }
                })
            });
        });
    </script>

</body>
</html>
