<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>显示用户信息</title>
</head>
<body>

<header>
    <p> URL：http://localhost:8080/users/1 </p>
    <p>对应的 handler 为： UserController.show()</p>
</header>

<hr>

<div class="container">

    <h2>我是 ${user.name} </h2>

    <h3>我发布的微博有：</h3>
    <div>
        <ul>
            <c:forEach items="${user.posts}" var="post">
                <li>${post.content}</li>
            </c:forEach>
        </ul>
    </div>

    <h3>我关注的人有 ${user.friends.size()} 位：</h3>
    <div>
        ${user.friends}
    </div>

    <h3>我的粉丝有 ${user.fans.size()} 位：</h3>
    <div>
        ${user.fans}
    </div>

    <h3>我的粉丝 ${user.fans.get(0).name} 发布的微博有 ${user.fans.get(0).posts.size()} 条：</h3>
    <div>
        <ul>
            <c:forEach items="${user.fans.get(0).posts}" var="post">
                <li>${post.content}</li>
            </c:forEach>
        </ul>
    </div>

</div>

</body>
</html>
