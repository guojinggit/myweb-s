<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    request.setAttribute("domain", "http://localhost/bloglist.html");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的故事</title>
    <style type="text/css">
        .divAll{
            margin-top:50px;
            margin-left:25%;
            margin-right:25%;
        }
        body{
            font-family:"Microsoft Yahei";
        }
        .everyHtml{
            font-size:20px;
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

        /*底部div*/

    </style>

</head>
<body>

<div class="divAll">
    <h1>2017</h1>
    <c:forEach items="${mystory_2017}" var="item">
        <a class="everyHtml" href="story.html?id=${item.id}&name=2017" title="">${item.blogdate }  &nbsp;&nbsp;${item.title }</a>
        <br><br>
    </c:forEach>
    <br>
    <h1>2016</h1>
    <c:forEach items="${mystory_2016}" var="item">
        <a class="everyHtml" href="story.html?id=${item.id}&name=2016" title="">${item.blogdate }  &nbsp;&nbsp;${item.title }</a>
        <br><br>
    </c:forEach>

    <%--<a class="everyHtml" href="20161009.html" title="">2016-10-09  &nbsp;&nbsp;勇气</a> <br><br>--%>
    <%--<a class="everyHtml" href="20161009.html" title="">2016-10-09  &nbsp;&nbsp;勇气</a> <br><br>--%>
    <br><br>
    <a  href="index.html">go home</a>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="javascript:history.go(-1);">go back</a>
</div>

<div class="divBotom">

</div>


</body>
</html>