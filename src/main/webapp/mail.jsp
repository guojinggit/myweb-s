<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/24
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<style>
    .divmail{
        margin-left:25%;
        margin-right:25%;
        /*background:#F0F8FF ;*/
    <!--备用：爱丽斯蓝：#F0F8FF 薄荷奶油#F5FFFA 幽灵白：#F8F8FF -->
    }
    a:link {
        color:#5e5e5e;
        text-decoration:none;
    }
</style>

<head>
    <title>发送信息</title>
</head>
<body>
    <div class="divmail">
    <p style="color: #9b859d">邮件系统确认可用，可直接发送邮件给我,目前仅支持文本</p>
    <form id="mailform" action="mail.html" method="POST">

        <textarea maxlength="1024" name="mailcontext" style="width: 400px;height: 300px;resize: none; ">输入邮件内容...</textarea>
        <br>
        <p style="color: #9b859d">方便留下你的邮箱吗？我可以及时回复</p>
        <input type="email" name = "someone">
        <input type="submit" value="点击给我发送邮件" />
    </form>
        <p style="color: #000088">${mailStat}</p>
        <br>
        <a  href="index.html">-->go home<--</a>
    </div>
</body>

</html>
