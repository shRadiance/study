<html>
<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>注册</title>
	<script>
		var status = '${sessionScope.pwdFail}';
		if (status=='yes'){
			alert("两次密码输入不一样，请重新输入")
		}
	</script>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}/Register" method="post">
	<p>用户名： <input type="text" name="username" required ></p>
	<p>密码：<input type="password" name="password1" required></p>
	<p>确认密码：<input type="password" name="password2" required></p>
<%--	<p>邮箱： <input type="text" name="username" required ></p>--%>
	<p>手机号码： <input type="text" name="username" required ></p>
	<p>电子邮箱<label for="inputEmail" class="sr-only">请输出电子邮件</label> <input
		type="email" id="inputEmail" class="form-control"
		placeholder="请输入电子邮件" required autofocus></p>
	<p>
		<input type="submit">
		<input type="reset">
	</p>
</form>
</body>
</html>