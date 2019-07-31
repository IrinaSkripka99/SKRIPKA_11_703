<%--
Created by IntelliJ IDEA.
User: User
Date: 17.10.2018
Time: 10:40
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kazan</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/css/font-awesome.min.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css"/>

  <link rel="icon" href="../img/icon.jpg">
  <link rel="js" href="../js/main.js>">
  <link rel="stylesheet" type="text/css" href="../slick/slick.css"/>
  <link rel="stylesheet" type="text/css" href="../slick/slick-theme.css"/>

  <link rel="icon" href="../img/icon.jpg">
  <link rel="js" href="../js/main.js>">

<body>
<div id= "header">
  Kazanz
</div>
<nav role='navigation'>

  <a class="navbar-logo" href="index"><img src=../img/icon.jpg height="60" width="60">
  </a>


  <ul>

    <li><a href="index">Главная</a></li>
    <li><a href="now">Ближайшие события</a></li>
    <li><a href="#">Места</a>
      <ul>
        <li><a href="restaurant">Кафе</a></li>
        <li><a href="exhibitions">Культурный отдых</a></li>
        <li><a href="Dost">Достопримечательности</a></li>
        <li><a href="sport">Спортивные развлечения</a></li>
      </ul>
    </li>

    <li><a href="signUp">Регистрация</a></li>
    <li><a href="signIn">Войти</a></li>
  </ul>
</nav>

<h1 class="reg">Войти</h1>


  <form class="form-style-7" method="post">
    <ul>

      <li>
        <%--@declare id="name"--%><label for="name">Email</label>
        <input name="name" maxlength="100">
        <span>Enter a valid email address</span>
      </li>

<li>
    <%--@declare id="password"--%><label for="password">Пароль</label>
      <input type="password" name="password" maxlength="50">
    <span>Enter your password</span>
</li>
<li>
    <input type="submit" value="Send This" >
</li>
</ul>
</form>


</body>
</html>
