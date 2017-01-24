<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>格式调整</title>

    <link rel="stylesheet" href="/css/markdown.css" />



    <style>
        .div1{
            margin-left:25%;
            margin-right:25%;
            background:#F5F5F5;
        <!--备用：爱丽斯蓝：#F0F8FF 薄荷奶油#F5FFFA 幽灵白：#F8F8FF -->
        }
        .aligncenter {
            clear: both;
            display: block;
            margin:auto;
        }

        body{
            font-family:"Microsoft Yahei";
        }
        .divBotom{
            margin:0 auto;
            text-align:center;
        }
        a:link {
            color:#7B7B7B;
            text-decoration:none;
        }
        a:visited {
            color:#7B7B7B;
            text-decoration:none;
        }
        a:hover {
            color:#0000C6;
            text-decoration:none;
        }
        a:active {
            color:#FFFFFF;
            text-decoration:none;
        }

        p{
            font-family:"Microsoft Yahei";
            font-size:16px;
            line-height:180%
        }

        h1{
            font-weight:bold;
            font-size:31px;
        }
        h2{
            font-weight:bold;
            font-size:26px;
        }

        h3{
            font-weight:bold;
            font-size:21px;
        }
    </style>
</head>
<body>
<div class = "div1">

    <!-- 以下是具体内容-->

    ${blog}
    <!--以上是具体内容 -->



    <div class="divBotom">
        <a  href="index.html">回到主页</a>
        &nbsp;|&nbsp;
        <a href="bloglist.html">博客列表</a>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/mail.jsp" style="color: #000088">发邮件给我？</a>
    </div>

</div>
</div>
</body>


</html>