<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="icon" href="../img/cupcake.png">
    <title>DoubleTry</title>

    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Coming+Soon" rel="stylesheet">
    <link href="../css/blog.css" rel="stylesheet">

    <script type="text/javascript">
        function openImageWindow(src) {
            var image = new Image();
            image.src = src;
            var width = image.width;
            var height = image.height;
            window.open(src,"Image","width=" + width + ",height=" + height);
        }
    </script>
</head>
<body>
<div class=" container">
    <header class="blog-header py-3">
        <div class="row flex-nowrap justify-content-between align-items-center">
            <header class="cd-header">
                <a href="#0" class="cd-logo"><img src="../img/cupcake.png" alt="Logo"></a>
                <span></span>
            </header>
            <div class="col-8 text-center">
                <a class="blog-header-logo text-dark" href="#">DoubleTry</a>
            </div>
            <div class="col-2 d-flex justify-content-end align-items-center">
                <a class="text-muted" href="#">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none"
                         stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                         class="mx-3">
                        <circle cx="10.5" cy="10.5" r="7.5"></circle>
                        <line x1="21" y1="21" x2="15.8" y2="15.8"></line>
                    </svg>
                </a>
                <a class="btn btn-sm btn-outline-secondary" href="#">Sign up</a>
                <a class="btn btn-sm btn-outline-secondary" href="#">Sign in</a>
            </div>
        </div>
    </header>

    <div class="nav-scroller py-1 mb-2">
        <nav class="nav d-flex justify-content-between">
            <a class="p-2 text-muted" href="#">Главная</a>
            <a class="p-2 text-muted" href="#">Бронирование столов</a>
            <a class="p-2 text-muted" href="#">Меню</a>
            <a class="p-2 text-muted" href="#">Галерея</a>
            <a class="p-2 text-muted" href="#">Отправить письмо</a>
        </nav>
    </div>
    <br><br>
    <div id="headerwrap">
        <div class="container">
            <div class="row centered">
                <div class="col-lg-8 col-lg-offset-2">
                    <h1>Нет ничего тяжелее пустого желудка.</h1>
                    <h2>Малагасийская поговорка</h2>
                </div>
            </div>
        </div>
    </div>
    <br><br>
    <div class="row mb-2">
        <div class="col-md-6">
            <div class="card flex-md-row mb-4 box-shadow h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-primary">Мир</strong>
                    <h3 class="mb-0">
                        <a class="text-dark" href="#">Новое блюдо</a>
                    </h3>
                    <div class="mb-1 text-muted">1 сентября</div>
                    <p class="card-text mb-auto">Пипец как вкусно бла бал балабал если ты читаешь знаяит ты быстро
                        читаешь потому что я планировала быстро пролистать</p>
                    <a href="#">Читать далее</a>
                </div>
                <img class="card-img-right flex-auto d-none d-md-block" src="../img/new1.jpg" alt="Card image cap">
            </div>
        </div>
        <div class="col-md-6">
            <div class="card flex-md-row mb-4 box-shadow h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-success">Дизайн</strong>
                    <h3 class="mb-0">
                        <a class="text-dark" href="#">Новый зал</a>
                    </h3>
                    <div class="mb-1 text-muted">14 октября</div>
                    <p class="card-text mb-auto">Второй текст не о чем (хотя немного полезной инфы 2*2=4 пипец я смешная
                        обоссаться!)</p>
                    <a href="#">Читать далее</a>
                </div>
                <img class="card-img-right flex-auto d-none d-md-block" src="../img/new2.jpg" alt="Card image cap">
            </div>
        </div>
    </div>
    <div class="container marketing">
        <br>
        <h1>Наши лучшие повара</h1>
        <br>
        <div class="row">
            <div class="col-lg-4">
                <img class="rounded-circle" src="../img/first.jpg" alt="Generic placeholder image" width="140"
                     height="140">
                <br><br>
                <h2>Гордон Рамзи</h2>
                <br>
                <p>Сразу стоит отметить, что Гордон является самым известным и успешным шеф-поваром
                    в Соединенных Штатах Америки и Великобритании. Кроме того, шотландец Гордон, во-первых,
                    высокопрофессиональный кулинар, во-вторых, известный шоумен, который уже на протяжении
                    многих лет выпускает несколько довольно-таки популярных шоу, связанных с...</p>
                <p><a class="btn btn-secondary" href="#" role="button">Читать далее &raquo;</a></p>
            </div>
            <div class="col-lg-4">
                <img class="rounded-circle" src="../img/second.jpg" alt="Generic placeholder image" width="140"
                     height="140">
                <br><br>
                <h2>Вольфранг Пак</h2>
                <br>
                <p>Мужчина из Австрии получил свой кулинарный опыт от мамы, которая многое времени
                    уделяла приготовлению кондитерских изделий. В возрасте 24 лет, окончив обучение
                    во Франции, Вольфганг решает переехать в Соединенные Штаты Америки. Уже в США
                    повар пишет свою первую книгу и открывает небольшой ресторанчик. Так к Вольфгангу
                    приходит успех. Кроме того, уже на протяжении 20 лет...</p>
                <p><a class="btn btn-secondary" href="#" role="button">Читать далее &raquo;</a></p>
            </div>
            <div class="col-lg-4">
                <img class="rounded-circle" src="../img/third.jpg" alt="Generic placeholder image" width="140"
                     height="140">
                <br><br>
                <h2>Бобби Флай</h2>
                <br>
                <p>Это ирландский шеф-повар, который в детстве был исключен из школы. Тогда он решил сразу пойти
                    работать, Бобби устроился в местную пиццерию Baskin Robbins. Успех пришел к кулинару только в
                    период его работы в ресторане, принадлежащем Джону Аллену. Флай старался работать качественно,
                    но получалось далеко не всегда. По этой простой причине...</p>
                <p><a class="btn btn-secondary" href="#" role="button">Читать далее &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
        </div><!-- /.row -->
    </div>
    <main>
        <div class="container">
            <div class="py-5 text-center">
                <img class="d-block mx-auto mb-4" src="../img/hamburger.png" alt="" width="72" height="72">
                <h1>Бронирование столов</h1>
                <h4>
                    (для бронирования необходимо быть зарегистрированным пользователем)
                </h4>
            </div>
            <div class="row">
                <div class="col-md-4 order-md-2 mb-4">
                    <h4 class="d-flex justify-content-between align-items-center mb-3">
                        <span class="text-muted">  Цены за бронь</span>
                    </h4>
                    <div>
                        <img src = '../img/shema2.png' width = '350' onclick = 'openImageWindow(this.src);' />
                    </div>
                    <br>
                    <ul class="list-group mb-3">
                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                            <div>
                                <h5 class="my-0">Стол на две персоны</h5>
                            </div>
                            <span class="text-muted">$12</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                            <div>
                                <h5 class="my-0">Стол на три персоны</h5>
                            </div>
                            <span class="text-muted">$20</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                            <div>
                                <h5 class="my-0">Стол на четыре персоны</h5>
                            </div>
                            <span class="text-muted">$27</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                            <div>
                                <h5 class="my-0">Стол на пять персон</h5>
                            </div>
                            <span class="text-muted">$35</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between">
                            <div>
                                <h5 class="my-0">Стол на шесть персон</h5>
                            </div>
                            <span class="text-muted">$40</span>
                        </li>
                    </ul>
                    <br><br>
                </div>
                <br><br>
                <div class="col-md-8 order-md-1">
                    <form class="needs-validation" novalidate>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for='email'><span>Email</span></label>
                                <input type='text' class="form-control" id='email' name='email' placeholder=''>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for='password'><span>Пароль</span></label>
                                <input type='password' class="form-control" id='password' name='password' placeholder=''>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for='firstName'><span>Имя:</span></label>
                                <input type='text'  class="form-control" id='firstName' name='firstName' placeholder=''>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for='lastName'><span>Фамилия</span></label>
                                <input type='text' class="form-control" id='lastName' name='lastName' placeholder=''>
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="phone">Номер телефона</label>
                            <input type="text" class="form-control" id="phone" placeholder="" required>
                        </div>

                        <div class="mb-3">
                            <label for="idTable">Номер стола</label>
                            <input type="text" class="form-control" id="idTable" placeholder="">
                        </div>


                        <hr class="mb-4">
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="save-info">
                            <label class="custom-control-label" for="save-info">Сохранить информацию</label>
                        </div>
                        <hr class="mb-4">

                        <h4 class="mb-3">Оплата</h4>

                        <div class="d-block my-3">
                            <div class="custom-control custom-radio">
                                <input id="credit" name="paymentMethod" type="radio" class="custom-control-input"
                                       checked
                                       required>
                                <label class="custom-control-label" for="credit">Кредитная карта</label>
                            </div>
                            <div class="custom-control custom-radio">
                                <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input"
                                       required>
                                <label class="custom-control-label" for="paypal">PayPal(для мобильной версии)</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for="cc-name">Данные пользователя</label>
                                <input type="text" class="form-control" id="cc-name" placeholder="" required>
                                <small class="text-muted">Введите имя и фамилию</small>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="cc-number">Номер кредитной карты</label>
                                <input type="text" class="form-control" id="cc-number" placeholder="" required>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3 mb-3">
                                <label for="cc-expiration">Срок действия карты</label>
                                <input type="text" class="form-control" id="cc-expiration" placeholder="" required>

                            </div>
                            <div class="col-md-3 mb-3">
                                <label for="cc-cvv">CVV</label>
                                <input type="text" class="form-control" id="cc-cvv" placeholder="" required>
                            </div>
                        </div>
                        <hr class="mb-4">
                        <input type='submit' class="btn btn-primary btn-lg btn-block"  value='Отправить'>

                    </form>
                </div>
            </div>
        </div>
        <br><br>

        <footer class="container">
            <p class="float-right"><a href="#">Back to top</a></p>
            <p>&copy; 2017-2018 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
        </footer>
    </main>
</div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../js/jquery-slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../js/jquery-slim.min.js"><\/script>')</script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/holder.min.js"></script>
    <script>
        Holder.addTheme('thumb', {
            bg: '#55595c',
            fg: '#eceeef',
            text: 'Thumbnail'
        });
    </script>
</body>
</html>
