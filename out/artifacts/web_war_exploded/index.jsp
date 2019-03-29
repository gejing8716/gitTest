<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
    <script>
        var age = 10;
        var id = document.getElementById("111");
        var id1 = document.getElementById("222");
        //alert(id1.value);
        document.write("嘻嘻。。。");
        document.write(typeof age + "<br/>");
        document.write(Number.MAX_VALUE + "" + Number.MIN_VALUE);
        alert(null == undefined);
       // window.location.href = "http://www.baidu.com";

    </script>
</head>
<body>
$END$
<%
    out.print("你好！");

%>
<input type="text" id="111">
<input type="button" id="222" value="点击">
</body>
</html>
