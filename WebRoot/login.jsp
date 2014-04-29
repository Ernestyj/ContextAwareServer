<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>登录页面</title>
</head>
<body>
<form action="loginAction" method="post">
    <table align="center">
    <caption><h3>用户登录</h3></caption>
        <tr>
            <td>账号：<input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码：<input type="text" name="password"/></td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="登录"/><input type="reset" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
</html>
