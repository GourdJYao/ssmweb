<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>用户登录</title>
</head>
<script src = "js/jquery-3.3.1.js"></script>
<script src = "js/jsonutils.js"></script>
<script src = "js/login.js"></script>
<body>
<table>
    <tr>
        <td colspan="2"><div style="font-size: 30px;color: #000;" align="center">用户登录</div></td>
    </tr>
    <tr>
        <td>用户名:</td>
        <td><input name="username" type="text"/></td>
    </tr>
    <tr>
        <td>密&nbsp;&nbsp;码</td>
        <td><input name="password" type="password"/></td>
    </tr>
    <tr>
        <td colspan="2">
            <input id="login_button" type="button" value="登录" onclick="login();"/>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/gourdjyaoweb/user/register.html">还没有用户？</a>
        </td>
    </tr>
</table>
</body>
</html>
