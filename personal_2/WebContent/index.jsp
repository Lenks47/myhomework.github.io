<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
    String name=(String)session.getAttribute("user");
%>
<style type="text/css">
*{
    margin:0 auto;
    padding:0;
}
#box{
	width:1070px;
	height:1300px;
	margin:0 auto;
	background-color: #fff;
	background:url(img/index.png);
}
#banner{
	height:200px;
	position:relative;
}
h1{
    position:absolute;
    right:0;
    bottom:0;
}
#menu{
	height:25px;
	background-color:rgba(192,192,192,0.8);
	margin:10px;
}
#menu ul{
    list-style:none;
    line-height:25px;
    float:rigth;
    margin-rigth:5px;
}
#menu ul li{
    float:left;
    margin-left:20px;
}
#menu ul li a{
    text-decoration:none;
    color:#000;
}
#menu ul li a:hover{
    text-decoration:underline;
}
#menu ul li a:link{
    color:#fff;
}
#main{
	height:1000px;
	margin:10px;
}
#left{
	height:1000px;
	width:22%;
	background-color:rgba(192,192,192,0.8);
	float:left;
	margin-right:10px;
}
#img{
    background-color:#fff;
}
#right{
	height:1000px;
	width:77%;
	float:left;
	background-color:rgba(192,192,192,0.8);
}
#footer{
	height:25px;
	clear:left;
}
</style>
</head>
<body>
	<div id="box">
		<div id="banner"><h1>欢迎你：<%out.print(name);%></h1></div>
		<div id="menu">
	    <ul>
		<li><a href="https://github.com/">查看Github仓库</a></li>
		<li><a href="">信息</a></li>
		<li><a href="">介绍</a></li>
		<li><a href="#">相册</a></li>
	    </ul>
		</div>
	<div id="main">
		<div id="left">
		<div id="img"><img alt="" src="img/aimer.jpg"></div>
		<div>
		<ul>
		<li>邮箱：Lenknes@outlook.com</li>
		<li>QQ:1943400801</li>
		<li>微信:lenks47</li>
		<li>电话:15706610839</li>
    	</ul>
		</div>
		</div>
		<div id="right">444</div>
	</div>
		<div id="footer">
		<center>&copy;2020.10.14 by:陆宇锋</center>
		</div>
	</div>
</body>
</html>