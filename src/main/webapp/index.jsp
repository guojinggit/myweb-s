<!DOCTYPE HTML>
<!--
	Aerial 1.0 by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>郭靖啦啦啦~</title>
		 <link rel="stylesheet" href="css/normalize.css">
 		 <link rel="stylesheet" href="css/whale_style.css" media="screen" type="text/css" />
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/skel.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
			<link rel="stylesheet" href="css/style-noscript.css" />
		</noscript>
		
		<style>
		  body{
			background:url(images/bg.jpg) top left no-repeat;
			background-size:cover;
		  }
		</style>

</head>
	<body class="loading">
	<div id="whale" ></div>
	<!-- <script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script> -->
	<script src="js/index.js"></script>
	<%--星星特效--%>
	<%--<script type="text/javascript" src="js/mymouse.js" id="mymouse"></script>--%>
	
	
		<div id="wrapper" style=" z-index: 3; background: rgba(0, 0, 0, 0);  position: absolute;">
		
			<!-- <div id="bg"></div> -->
			<div id="overlay"></div>
			<div id="main">
			<script type="text/javascript" src="js/myjs.js"></script>
				<!-- Header -->
					<header id="header">
						<h1>Guo Jing</h1>
						<p>天堂有路你不走，学海无涯苦作舟</p>
						<nav>
							<ul>
								<li><a href="bloglist.html" class="fa fa-coffee"><span>博客</span></a></li>
								<li><a  class="fa fa-lock" name="lockInput" id="lockInput" onclick="onClickLock()" ><span>text</span></a> </li>
								<li><a href="??" class="fa fa-heart-o"><span>Github</span></a></li>
								<li><a href="mailto:495389585@qq.com?subject=网站邮件&body=该内容将直接发给该网站开发维护本人" class="fa fa-envelope-o"><span>Email</span></a></li>
							</ul>
						</nav>
					</header>

				<!-- Footer -->
					<footer id="footer">
						<span class="copyright">&copy; Design: thanks html5up.net,codepen.in</span>
					</footer>
				
			</div>
		</div>
		
	</body>
</html>