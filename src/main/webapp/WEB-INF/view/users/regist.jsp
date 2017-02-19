<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script src="/js/jquery.js"></script>
    <link rel="stylesheet" href="/css/custom.css">
</head>
<body>

<div id="container">
    <form:form action="/users" modelAttribute="user" method="post">

        <fieldset>
            <legend>用户注册</legend>

            <form:errors path="*" cssClass="error" element="p"/>

            <p>
                <form:label path="name">名字</form:label>
                <form:input path="name" />
                <form:errors path="name" />
            </p>

            <p>
                <form:label path="email">邮箱</form:label>
                <form:input type="email" path="email" />
                <form:errors path="email" />
            </p>


            <p>
                <form:label path="password">密码</form:label>
                <form:password path="password" />
                <form:errors path="password" />
            </p>

            <p>
                <input type="submit" value="注册"/>
            </p>

        </fieldset>

    </form:form>
</div>

</body>
</html>
