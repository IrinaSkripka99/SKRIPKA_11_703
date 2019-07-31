<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
    <link rel='StyleSheet' href="../css/login.css" type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
</head>
<body>
<div id="login_container">
    <div id="form_container">
        <p class="login-text">Авторизация на сайте</p>
        <form method="post">
            <input name="name" placeholder="Your name" class="text_input">
            <br>
            <input name="age" placeholder="Age" class="text_input">
            <br>
            <input type="password" name="password" placeholder="Your Password" class="text_input">
            <br>
            <input type="submit" id="register" value="">
        </form>
    </div>
</div>
</body>
</html>
