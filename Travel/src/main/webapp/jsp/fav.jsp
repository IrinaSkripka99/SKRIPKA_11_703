<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
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

</head>
<body>
  <div id= "header">
Kazan
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
        <li><a href="exhibitions">Выставки</a></li>
          <li><a href="Dost">Кино</a></li>
            <li><a href="sport">Спортивные развлечения</a></li>
      </ul>
    </li>
    <li><a href="signUp">Регистрация</a></li>
    <li><a href="signIn">Войти</a></li>
  </ul>
</nav>
<h1 class="reg">Избранное</h1>
</body>
</html>
