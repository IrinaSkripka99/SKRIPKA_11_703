<#ftl encoding='UTF-8'>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Личный кабинет</title>
    <meta charset="utf-8">
    <link href="../img/brand/faviconplus.png" rel="icon" type="image/png">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../css/util.css">
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    <!--===============================================================================================-->
</head>
<body>

<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100" style="padding: 50px 130px 33px 95px">
       <span class="login100-form-title" style="text-align: left;margin-left: 85px;margin-top:20px ">
						Личный кабинет
					</span>
            <div class="login100-pic " style="margin-top: 90px;margin-left: 30px">
                <img src="../img/1445630.jpg" >
            </div>
            <div class="text-center p-t-13" style="margin-left: -440px">
                <a class="txt2" href="shop" style="font-size: 20px">
                    Сделать заказ
                </a>
            </div>
            <div class="text-center p-t-13" >
                <a class="txt2" href="main" style="font-size:20px ">
                    Получить совет
                </a>
            </div>
            <form  class="login100-form validate-form" method="post" style="margin-top: -60px" >
                <div class="wrap-input100 validate-input" >

                    <input class="input100" type="text" name="firstname" placeholder="${user.getFirstname()}">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" >
                    <input class="input100" type="text" name="lastname" placeholder="${user.getLastname()}">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" >
                    <input class="input100" type="text" name="weight" placeholder="${user.getWeight()}">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" >
                    <input class="input100" type="text" name="height" placeholder="${user.getHeight()}">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" >
                    <input class="input100" type="text" name="age" placeholder="${user.getAge()}">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" >
                    <input class="input100" type="text" name="allerges" placeholder="${user.getAllerges()}">
                    <span class="focus-input100"></span>
                </div>

                <div class="container-login100-form-btn">
                    <input class="login100-form-btn" href="shop.html" type="submit" value="Сохранить">
                </div>
            </form>
        </div>
    </div>
</div>




<!--===============================================================================================-->
<script src="../vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/bootstrap/js/popper.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/tilt/tilt.jquery.min.js"></script>
<script >
    $('.js-tilt').tilt({
        scale: 1.1
    })
</script>
<!--===============================================================================================-->
<script src="../js/main.js"></script>
<!-- BEGIN JIVOSITE CODE {literal} -->
<script type='text/javascript'>
    (function(){ var widget_id = 'Vz5OZRCuJR';var d=document;var w=window;function l(){var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true;s.src = '//code.jivosite.com/script/widget/'+widget_id; var ss = document.getElementsByTagName('script')[0]; ss.parentNode.insertBefore(s, ss);}if(d.readyState=='complete'){l();}else{if(w.attachEvent){w.attachEvent('onload',l);}else{w.addEventListener('load',l,false);}}})();
</script>
<!-- {/literal} END JIVOSITE CODE -->
</body>
</html>