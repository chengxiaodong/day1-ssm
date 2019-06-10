<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>用户登录</title>
    <link href="favicon.ico" rel="shortcut icon" />
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.0/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.md5.js"></script>
</head>
<body style=" background: url(http://global.bing.com/az/hprichbg/rb/RavenWolf_EN-US4433795745_1920x1080.jpg) no-repeat center center fixed; background-size: 100%;">
 
 <form action="${pageContext.servletContext.contextPath}/page/login" method="post">
    <div class="modal-dialog" style="margin-top: 10%;">
        <div class="modal-content">
            <div class="modal-header">
 
                <h4 class="modal-title text-center" id="myModalLabel">登录</h4>
            </div>
            <div class="modal-body" id = "model-body">
                <div class="form-group">
 
                    <input type="text" class="form-control"placeholder="用户名" name="username" autocomplete="off">
                </div>
                <div class="form-group">
 
                    <input type="password" class="form-control" placeholder="密码" name="password" autocomplete="off">
                </div>
            </div>
            <div class="modal-footer">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary form-control">登录</button>
                </div>
                <div class="form-group">
                    <button type="button" class="btn btn-default form-control">注册</button>
                </div>
 
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
 </form>
 <script type="text/javascript">
 	if(${message}){
 		alert(message)
 	}
 </script>
</body>
</html>
