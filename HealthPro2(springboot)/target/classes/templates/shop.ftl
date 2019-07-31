<#ftl encoding='UTF-8'>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description"
          content="Сайт для подробного анализа рациона и получения советов для здорого образа жизни.">
    <meta name="author" content="HealthPro">

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
    <!--  <link type="text/css" href="assets/css/docs.min.css" rel="stylesheet">-->
    <link rel="stylesheet" href="/css/style%20(2).css">
    <!--  <script src="assets/js/script.js"></script>-->
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
    <div class="container">
        <a class="navbar-brand" href="index">HealthPro+</a>
        <a class="navbar-brand active" href="shop">Меню</a>
        <a class="navbar-brand " href="signIn">Вход</a>
    </div>
</nav>
<section class="section section-lg pt-0">
    <div class="container">
        <div class="card shadow-lg border-0">
            <div class="p-5">
                <div class="row align-items-center">
                    <div class="col-lg-12">
                        <div style="width: 100%; overflow: auto;">
                            <div id="tabl" style="overflow: auto;">

                            </div>
                        </div>
                        <form action="" id="add_persons" method="post">
                            <fieldset>
                                <legend>Сделать заказ</legend>
                                <div id="table"></div>
                                <div class="form-group col-md-6">
                                    <label>Белки, гр.</label>
                                    <input step="any" required type="number" min="1" max="10000" value="" size="12"
                                           tabindex="2" class="form-control "/>
                                </div>
                                <div class="form-group col-md-6">
                                    <label>Жиры, гр.</label>
                                    <input step="any" required type="number" min="1" max="10000" value="" size="12"
                                           tabindex="2" class="form-control "/>
                                </div>
                                <div class="form-group col-md-6">
                                    <label>Углеводы, гр.</label>
                                    <input step="any" required type="number" min="1" max="10000" value="" size="12"
                                           tabindex="2" class="form-control "/>
                                </div>
                                <br>
                                <div class="form-group col-md-6">
                                    <label for="name2">На какое количество дней</label>
                                    <select id="name2">
                                        <option value=1 >На 3 дня</option>
                                        <option value=2>На 5 дней</option>
                                        <option value=3>На неделю</option>
                                    </select>
                                    <br><br>
                                    <input title=""
                                           onclick="sendProductId((document.getElementById('name2').options.selectedIndex)+1);return false;"
                                           type="submit"
                                           class="submit btn btn-success" value="Добавить" />
                                    <input title=""
                                           onclick="sendProductId(100);return false;"
                                           type="submit"
                                           class="submit btn btn-success" value="Удалить все заказы" />
                                </div>
                            </fieldset>
                        </form>
                        <form action="" id="checkUser" method="post" onsubmit="checkUser();return false;">
                            <fieldset>
                                <legend>Узнать свое БЖУ</legend>
                                <div class="form-group col-md-6">
                                    <label>Необходимое количество каллорий <p><a href="main" style="font-size: 13px">Нажмите
                                        сюда,чтоб узнать</a></p></label>
                                    <input step="any" required type="number" min="10" max="400" name="userKal"
                                           id="userKal" value="" placeholder="Количество каллорий" size="12"
                                           tabindex="2" class="form-control"/>
                                </div>
                                <div class="form-group col-md-6">
                                    <input data-toggle="modal" onclick="checkUser();return false;"
                                           data-target="#modal-notification" type="submit" name="subm"
                                           class="submit btn btn-success" value="Получить" tabindex="3"/>
                                </div>
                            </fieldset>
                        </form>

</section>
<!-- Modal -->
<div class="modal fade" id="modal-notification" tabindex="-1" role="dialog" aria-labelledby="modal-notification"
     aria-hidden="true">
    <div class="modal-dialog modal-danger modal-dialog-centered modal-" role="document">
        <div id="modalWindow" class="modal-content bg-gradient-success">

            <div class="modal-header">
                <h6 class="modal-title" id="modal-title-notification">Ваш совет на сегодня</h6>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="py-3 text-center">
                    <i id="gradeSmile" class=""></i>
                    <h4 class="heading mt-4" id="adviceTitle"></h4>
                    <p id="adviceText"></p>
                    <p id="adviceExer"></p>
                </div>

            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-link text-white ml-auto" data-dismiss="modal">Закрыть</button>
            </div>
        </div>
    </div>
</div>
<script>
    function checkUser() {
        var d = document;
        var userKal;

        userKal = +(d.getElementById('userKal').value);
        var proteins = ((userKal * 0.4) / 4).toFixed(2);
        var fats = ((userKal * 0.2) / 9).toFixed(2);
        var carb = ((userKal * 0.4) / 4).toFixed(2);
        giveAdvice(proteins, fats, carb);
    }

    function giveAdvice(proteins, fats, carb) {
        gradeSmile.className = "fa fa-thumbs-o-up fa-3x";
        modalWindow.className = "modal-content bg-gradient-success";
        adviceTitle.innerHTML = "Итак,вот ваша норма";
        adviceText.innerHTML = "Количество белков: " + proteins +
                " гр, жиров: " + fats + " гр, углеводов: " + carb + " гр";
        adviceExer.innerHTML = "";
    }

    function sendProductId(productId) {
        $.ajax({
            type: 'post',
            url: '/shop?productId=' + productId,
            data: {
                productId: productId
            }
        }).done(function (data) {
            let contentTableHTML = "<table id='tab1' class='table'>";
            contentTableHTML += "<thead>" + "<tr>" +
                    "<th scope='col'>Название</th>"
                    + "<th scope='col'>Цена, руб.</th>" +
                    "</thead>" + "<tbody>";
            for (let i = 0; i < data.length; i++) {
                contentTableHTML += "<tr>";
                contentTableHTML += "<td>" + data[i].title + "</td>";
                contentTableHTML += "<td>" + data[i].price + "</td>";
           /*     contentTableHTML += "<td>" + data[i].count + "</td>";*/
                contentTableHTML += "</tr>";
            }
            contentTableHTML += "</tbody>" + "</table>";
            let contentTableDiv = document.getElementById("tabl");
            contentTableDiv.innerHTML = contentTableHTML;

        }).fail(function () {
            alert("FAILE")
        });
    }

    function isNumeric(n) {
        return !isNaN(parseFloat(n)) && isFinite(n);
    }
</script>
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/popper/popper.min.js"></script>
<script src="/vendor/bootstrap/bootstrap.min.js"></script>
<script src="/vendor/headroom/headroom.min.js"></script>
<!-- Argon JS -->
<script src="/js/argon.js?v=1.0.1"></script>

<!-- BEGIN JIVOSITE CODE {literal} -->
<script type='text/javascript'>
    (function () {
        var widget_id = 'Vz5OZRCuJR';
        var d = document;
        var w = window;

        function l() {
            var s = document.createElement('script');
            s.type = 'text/javascript';
            s.async = true;
            s.src = '//code.jivosite.com/script/widget/' + widget_id;
            var ss = document.getElementsByTagName('script')[0];
            ss.parentNode.insertBefore(s, ss);
        }

        if (d.readyState == 'complete') {
            l();
        } else {
            if (w.attachEvent) {
                w.attachEvent('onload', l);
            } else {
                w.addEventListener('load', l, false);
            }
        }
    })();
</script>
<!-- {/literal} END JIVOSITE CODE -->
</body>

</html>
