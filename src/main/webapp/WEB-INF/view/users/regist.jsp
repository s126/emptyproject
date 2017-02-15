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
    <form:form action="/users/create" modelAttribute="user">

      <div>
        <form:errors path="*" cssClass="error" element="p" />
      </div>

      <div>
        <form:input path="name" />
      </div>
      <div>
        <form:input type="number" path="age" />
      </div>
      <div>
        <form:input type="date" path="birth" />
      </div>

      <input type="submit" value="注册" />

    </form:form>
  </div>


  <button id="showmsg">点我显示某些东西</button>
  
</body>
</html>
