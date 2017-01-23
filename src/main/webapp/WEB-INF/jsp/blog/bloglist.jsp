<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setAttribute("domain", "http://localhost/bloglist.html");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>博客列表</title>
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
	<h1>2016</h1>
	xxx ${test}
	<s:iterator value="#request.blogTitleList">
		<tr>
			<td><s:property value="title"/></td>
			<td><s:property value="date"/></td>
		</tr>
	</s:iterator>
	<c:forEach items="${requestScope.blogTitleList}" var="item">
		<tr>
			<td>${item.date }</td>

		</tr>
	</c:forEach>
	<a class="everyHtml" href="20161009.html" title="">2016-10-09  &nbsp;&nbsp;勇气</a> <br><br>
	<a class="everyHtml" href="20161009.html" title="">2016-10-09  &nbsp;&nbsp;勇气</a> <br><br>
	<br><br>
	<a  href="../index.html">-->back<--</a>
</div>

<div class="divBotom">
	
</div>


</body>
</html>