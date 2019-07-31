<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Сайт для подробного анализа рациона и получения советов для здорого образа жизни.">
    <meta name="author" content="HealthPro+Team">
    <title>HealthPro+</title>
    <!-- Favicon -->
    <link href="../img/brand/faviconplus.png" rel="icon" type="image/png">
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
    <!-- Icons -->
    <link href="../vendor/nucleo/css/nucleo.css" rel="stylesheet">
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Argon CSS -->
    <link type="text/css" href="../css/argon.css?v=1.0.1" rel="stylesheet">
    <!-- Docs CSS -->
    <!--  <link type="text/css" href="../assets/css/docs.min.css" rel="stylesheet">-->
    <link rel="stylesheet" href="../css/style.css">
    <!--  <script src="assets/js/script.js"></script>-->
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
    <div class="container">
        <a class="navbar-brand" href="index">HealthPro+</a>
        <a class="navbar-brand active" href="shop">Меню</a>
        <a class="navbar-brand " href="account">Личный кабинет</a>
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

                        <form action="" id="add_persons" method="post" onsubmit="addRow(1);return false;">
                            <fieldset>
                                <legend>Добавить продукт</legend>

                                <div class="form-group col-md-6">
                                    <label for="weight">Вес, г.</label>
                                    <input step="any" required type="number" min="1" max="10000"  name="weight" id="weight" value="" size="12" tabindex="2" class="form-control " />
                                </div>

                                <div class="form-group col-md-6">
                                    <input type="submit" name="subm" class="submit btn btn-success" value="Арахис" onclick="sendProductId(1,weight);return false;" tabindex="3" />
                                </div>

                                <div class="form-group col-md-6">
                                    <input type="submit" name="subm" class="submit btn btn-success" value="Яблоко" onclick="sendProductId(3,weight);return false;" tabindex="3" />
                                </div>

                                <div class="form-group col-md-6">
                                    <input type="submit" name="subm" class="submit btn btn-success" value="Баранина"  onclick="sendProductId(2,weight);return false;" tabindex="3" />
                                </div>
                                <div class="form-group col-md-6">
                                    <input type="submit" name="subm" class="submit btn btn-success" value="Очистить"  onclick="deleteAll(4);return false;" tabindex="3" />
                                </div>
                            </fieldset>
                        </form>
                        <form action="" id="checkUser" method="post" onsubmit="checkUser();return false;">
                            <fieldset>
                                <legend>Получить советы</legend>
                                <div class="form-group col-md-6">
                                    <label for="userWeight">Вес, кг.</label>
                                    <input step="any" required type="number" min="10" max="400" name="userWeight" id="userWeight" value="" size="12" tabindex="2" class="form-control" />
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="height">Рост, см.</label>
                                    <input step="any" required type="number" min="1" max="250" name="height" id="height" value="" size="12" tabindex="2" class="form-control" />
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="age">Возраст</label>
                                    <input step="any" required type="number" min="1" max="150" name="age" id="age" value="" size="12" tabindex="2" class="form-control" />
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="sex">Пол</label>
                                    <input required name="sex" type="radio" value="5"> Мужской
                                    <input required name="sex" type="radio" value="-161"> Женский
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="target">Уровень активности</label><br>
                                    <input required name="target" type="radio" value="1.2"> Минимальный <br>
                                    <input required name="target" type="radio" value="1.375"> Низкий <br>
                                    <input required name="target" type="radio" value="1.55"> Средний<br>
                                    <input required name="target" type="radio" value="1.725"> Высокий<br>
                                    <input required name="target" type="radio" value="1.9"> Максимальный<br>
                                </div>
                                <div class="form-group col-md-6">
                                    <input data-toggle="modal" data-target="#modal-notification" type="submit" name="subm" class="submit btn btn-success" value="Получить совет" tabindex="3" />
                                </div>
                            </fieldset>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Modal -->
<div class="modal fade" id="modal-notification" tabindex="-1" role="dialog" aria-labelledby="modal-notification" aria-hidden="true">
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
<script src="../vendor/jquery/jquery.min.js"></script>
<script src="../vendor/popper/popper.min.js"></script>
<script src="../vendor/bootstrap/bootstrap.min.js"></script>
<script src="../vendor/headroom/headroom.min.js"></script>
<!-- Argon JS -->
<script src="../js/argon.js?v=1.0.1"></script>
<script src="../vendor/headroom/headroom.min.js"></script>
<!— Argon JS —>
<script src="../js/argon.js?v=1.0.1"></script>
<script>

    function checkUser() {

        var d = document;
        var userWeight;
        var height;
        var sex;
        var age;
        var target;
        sex = +($('input[name=sex]:checked').val());
        target = +($('input[name=target]:checked').val());
        var userKal = +(d.getElementById('amountKal').value);
        console.log(userKal);
        userWeight = +(d.getElementById('userWeight').value);
        height = +(d.getElementById('height').value);
        age = +(d.getElementById('age').value); console.log(userWeight);
        console.log(height);
        console.log(age);
        var coef = Math.round((10 * userWeight + 6.25 * height - 5 * age + sex) * target);
        console.log(coef);

        giveAdvice(coef, userKal);
    }

    function giveAdvice(coef, userKal) {
        if (coef < userKal - 100) {
            gradeSmile.className = "fa fa-thumbs-down fa-3x";
            modalWindow.className = "modal-content bg-gradient-danger";
            adviceTitle.innerHTML = "Вы сегодня перевыполнили норму";
            adviceText.innerHTML = "Совет на сегодня: выполнить физические упражнения. Вот что вы можете сделать для достижения суточной нормы калорий:";
            difference = Math.round(userKal - coef);
            if (difference < 300) {
                adviceExer.innerHTML = "Умеренный бег " + Math.round(difference / 7) + " минут.";
            } else if (difference < 800) {
                adviceExer.innerHTML = "Бег вверх по ступенькам " + Math.round(difference / 9) + " минут.";
            } else {
                adviceExer.innerHTML = "Скорее всего, вам уже ничего не поможет, но можете выполнить бег вверх по ступенькам " + Math.round(difference / 9) + " минут;)";
            }
        } else if (coef > userKal + 100) {
            gradeSmile.className = "fa fa-thumbs-down fa-3x";
            modalWindow.className = "modal-content bg-gradient-danger";
            adviceTitle.innerHTML = "Вы сегодня недовыполнили норму";
            adviceText.innerHTML = "Совет на сегодня: вы можете съесть несколько фруктов для достижения нормы калорий в день";
            difference = Math.abs(Math.round(userKal - coef));
            if (difference < 300) {
                adviceExer.innerHTML = "Съесть " + Math.round(difference / 120) + "г яблок.";
            } else if (difference < 800) {
                adviceExer.innerHTML = "Съесть " + Math.round(difference / 120) + "г арахиса.";
            } else {
                adviceExer.innerHTML = "Сегодня вы употребили очень мало калорий, впредь употребляйте больше калорийной пищи, сегодня можете попробовать съесть " + Math.round(difference / Arahis.kal) + "г арахиса:)";
            }
        } else {
            gradeSmile.className = "fa fa-thumbs-o-up fa-3x";
            modalWindow.className = "modal-content bg-gradient-success";
            adviceTitle.innerHTML = "Поздравляем!";
            adviceText.innerHTML = "Сегодня вы упортребили оптимальное количество калорий. Вы выполнили норму калорийности в день для вашего организма!";
            adviceExer.innerHTML = "";
        }
    }


    function deleteAll(productId) {
        $.ajax({
            type:'post',
            url:'/products',
            data:{
                productId:productId
            }
        })
    }

  function sendProductId(productId) {
      $.ajax({
          type: 'post',
          url: '/products',
          data: {
              productId: productId
          }
      }).done(function (data) {
          let weight = document.getElementById('weight').value;
          let contentTableHTML = "<table id='tab1' class='table'>";
          contentTableHTML += "<thead>" + "<tr>"+
              "<th scope='col'>Продукт</th>"
              + "<th scope='col'>Жиры, г.</th>" +
              "<th scope='col'>Белки, г.</th>"
              +"<th scope='col'>Углеводы, г.</th>"
              +"<th scope='col'>Ккал</th>"+" </tr>"+
              "</thead>"+"<tbody id='tableTr'>";
          let sumKal=0;
          let sumFat=0;
          let sumProteins=0;
          let sumCarboh=0;
              for (let i = 0; i < data.length; i++) {
                  contentTableHTML += "<tr >";
                  contentTableHTML += "<td>" + data[i].name + "</td>";
                  contentTableHTML += "<td>" + data[i].fat * weight + "</td>";
                  contentTableHTML += "<td>" + data[i].proteins * weight + "</td>";
                  contentTableHTML += "<td>" + data[i].carboh * weight + "</td>";
                  contentTableHTML += "<td>" + data[i].kal * weight + "</td>";
                  contentTableHTML += "</tr>";
                  sumProteins += (+data[i].proteins * weight);
                  sumKal += (+(data[i].kal * weight));
                  sumFat += (+data[i].fat * weight);
                  sumCarboh += (+data[i].carboh * weight);
              }

          contentTableHTML+="</tbody"+"<tbody>"+ "<th scope='col'>Итого:</th>"+"<th scope='col' id='amountFat'>"+sumFat+"</th>"+
              "<th scope='col' id='amountProteins'>"+sumProteins+"</th>"
              + "<th scope='col' id='amountCarboh'>"+sumCarboh+"</th>"+
              "<th scope='col' id='amountKal'  value=''>"+sumKal+"</th>";
          contentTableHTML += "</tbody>" + "</table>";
          let contentTableDiv = document.getElementById("tabl");
          contentTableDiv.innerHTML = contentTableHTML;
         document.getElementById('amountKal').value=sumKal;

      }).fail(function () {
          alert("FAIL")
      });
  }

    function isNumeric(n) {
        return !isNaN(parseFloat(n)) && isFinite(n);
    }


</script>
</body>

</html>