<#ftl encoding='UTF-8'>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Start your development with a Design System for Bootstrap 4.">
    <meta name="author" content="Creative Tim">

    <title>HealthPro+</title>
    <!-- Favicon -->
    <link href="/img/brand/faviconplus.png" rel="icon" type="image/png">
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
    <!-- Icons -->
    <link href="/vendor/nucleo/css/nucleo.css" rel="stylesheet">
    <link href="/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Argon CSS -->
    <link type="text/css" href="/css/argon.css?v=1.0.1" rel="stylesheet">
    <!-- Docs CSS -->
</head>
<body>
<div>
    <form class="login100-form validate-form" method="post">
        <div class="wrap-input100 validate-input">

            <input class="input100 validate-input" type="text" name="secondName" placeholder="Фамилия">
            <span class="focus-input100"></span>
        </div>

        <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
            <input class="input100" type="text" name="email" placeholder="Email">
            <span class="focus-input100"></span>
            <span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
        </div>

        <div class="wrap-input100 validate-input">
            <input class="input100" type="text" name="skills" placeholder="Введите навыки через запятую">
            <span class="focus-input100"></span>
        </div>
        <div class="container-login100-form-btn">
            <input class="login100-form-btn" href="form.ftl" type="submit" value=Отправить>
        </div>
    </form>
</div>
<div class="container-login100-form-btn">
    <input class="login100-form-btn" href="searchPeople.ftl" type="submit" value="Поиск пользователей">
</div>
<div class="container-login100-form-btn">
    <input class="login100-form-btn" href="statistics.ftl" type="submit" value="Статистика">
</div>

</body>
<!--===============================================================================================-->
<script src="../vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/bootstrap/js/popper.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/tilt/tilt.jquery.min.js"></script>
</html>