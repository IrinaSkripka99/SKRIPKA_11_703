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
    <div>
        <form  method="post">
            Поиск пользователей по навыкам:
            <input type="search" value="">
            <input type="submit" value="Find" href="searchPeople.ftl">
        </form>
    </div>

    <table id="users">
        <tr>
            <th>Фамилия</th>
            <th>Email</th>
        </tr>
        <#list users as user>
            <tr>
                <td>${user.second_name}</td>
                <td>${user.email}</td>
            </tr>
        </#list>
    </table>
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