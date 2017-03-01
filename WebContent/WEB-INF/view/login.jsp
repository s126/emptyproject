<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
</head>
<body>

<header>
    <h2>
        用户登录
    </h2>
</header>
<section>
    <form action="/login" method="post">
        <fieldset>
            <legend>登录</legend>
            <div>
                <label>账号</label>
                <input name="name" />
            </div>
            <div>
                <label>密码</label>
                <input type="password" name="password" />
            </div>
            <div>
                <input type="submit" value="登录" />
            </div>
        </fieldset>
    </form>
</section>


</body>
</html>
