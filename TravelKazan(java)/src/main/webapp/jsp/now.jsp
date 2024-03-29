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
    <link rel="js" href="${pageContext.request.contextPath}/js/main.js>">

    <link rel="js" href="${pageContext.request.contextPath}/js/sort.js>">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/sort.css"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sort.js"></script>


</head>
<body>

  <div id= "header">
</div>
<nav role='navigation'>
<div class = "menu">
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
  </div>
</nav>
<h1 class="regbl">Ближайшие события</h1><br>


<table class="sort" align="center">
<thead>
<tr>
<td>ID</td>
<td>Тип Мероприятия</td>
<td>Название</td>
<td>Дата</td>
<td>Место проведения</td>
<td>Средняя цена</td>
<td>Акции</td>
<td>Рейтинг</td>
</tr>
</thead>
<tbody>
<tr>
<td>1</td>
<td>Другое</td>
<td>Big Funny</td>
<td>23.12.2018</td>
<td>ул. Баумана, 35</td>
<td>500</td>
<td>-</td>
<td>6</td>
</tr>
<tr>
<td>2</td>
<td>Фестиваль</td>
<td>SunnyФЕСТ</td>
<td>26.12.2018</td>
<td>ул. Гагарина</td>
<td>0</td>
<td>-</td>
<td>5</td>
</tr>
<tr>
<td>3</td>
<td>Концерт</td>
<td>Bolero танцевальное <br>
  шоу Ляйсан Утяшевой</td>
<td>24.12.2018</td>
<td>Пирамида</td>
<td>2000</td>
<td>-</td>
<td>9</td>
</tr>
<tr>
<td>4</td>
<td>Другое</td>
<td>Open Space Market</td>
<td>21-22-23.12.2018</td>
<td>Казанская ярмарка</td>
<td>100</td>
<td>+</td>
<td>-</td>
</tr>
<tr>
<td>5</td>
<td>Фестиваль</td>
<td>Фестиваль гик-культуры<br>
   Кавабанга</td>
<td>23.12.2018</td>
<td>Штабе </td>
<td>100</td>
<td>+</td>
<td>-</td>
</tr>
<tr>
<td>6</td>
<td>Концерт</td>
<td>Рождественский концерт <br>
  органной и хоровой музыки</td>
<td>25.12.2018</td>
<td>ТЦ Кольцо</td>
<td>200</td>
<td>-</td>
<td>6</td>
</tr>
<tr>
<td>7</td>
<td>Мастер-класс </td>
<td>"Новогодний декупаж"<br> по созданию декорированной <br>тарелки</td>
<td>28.12.2018</td>
<td>Казань Арена</td>
<td>350</td>
<td>-</td>
<td>7</td>
</tr>
</tbody>
</table>




<!-- События 1 -->
  <div class="ot" >
    <img class="picture" src = "../img/now1.jpg" alt="rest1" width="500px" height ="300px">
      <div class="right">
  <h2> Big Funny </h2><br>



  Корпорация развлечений Big Funny Big Funny — настоящий ураган захватывающих приключений для всей семьи. Гостей этого удивительного места ждут сразу 11 уникальных локаций — от «Дома вверх дном» и мини-зоопарка до ленточного лабиринта и аттракциона «Бей посуду».
  <br>
  Big Funny — это океан эмоций и сразу 11 интересных развлечений для тех, кому от 0 до 100 лет. Главная фишка корпорации — интерактивность: всё, что здесь находится, можно и даже нужно изучать, трогать и фотографировать.
   <br>
  Музеи Big Funny — идеальное решение для незабываемого семейного отдыха! Побывав в одной из трёх локаций (все они находятся на одной улице, недалеко друг от друга), вы сможете:
  <br>пообщаться с милыми животными;<br>
  повеселиться в «Доме великана»;<br>
  совершить побег из тюрьмы;<br>
  преодолеть зеркальный лабиринт;<br>
  сделать эффектные фотографии в Музее иллюзий;<br>
  пройти ленточный лабиринт;<br>
   прогуляться по потолку в «Доме вверх дном»;<br>
   искупаться в сухом бассейне шариков;<br>
  изучить экспонаты необычного музея «Веришь или нет»;<br>
  побывать на аттракционе «Бей посуду»;<br>
  преодолеть себя в лабиринте страха.<br>
<br><h2>Стоимость билетов: 350-1450 р</h2>
  <h3>Город: Казань<br>
Адрес: ул. Баумана, 35, ул. Баумана, 58, ул. Баумана, 17<br>
Контактные данные:+7 (843) 225-14-41<br>
Ближайшее метро: Площадь Габдуллы Тукая</h3>

      </div>
  </div>
<!-- События 2 -->
  <div class="ot" >
  <img class="picture" src = "../img/now2.jpg" alt="rest2" width="500px" height ="300px">

  <div class="right">
  <h2> Фестиваль креативных санок «SunnyФЕСТ»</h2><br>

  Фестиваль креативных санок «SunnyФЕСТ» состоится 26 января в Мамадыше.
  <br>

  «SunnyФЕСТ» - это открытый фестиваль креативных самодельных санок и скоростного спуска на них! Принять участие в состязании может любой желающий страше 18 лет, вы должны лишь сконструировать необычные санки и выступить с презентацией. Зрители на фестивале получают не меньше удовольствия и положительных эмоций, поэтому собирайте всю семью и приезжайте на это крутое зимнее мероприятие!

   <br><h2>Бесплатно</h2><br>

  Соревнования состоятся по следующим номинациям:
  <br>
  - Номинация «Где это видано?!» (Самые креативные сани)
  <br>
  - Номинация «Креатив!» (Креативность выступления и костюмов)
  <br>
  - Номинация «Как по маслу!» (Самый быстрый спуск с горы)
  <br>
  - Номинация «Докатились!» (Самый длинный спуск с горы)
  <br>
  - Приз зрительских симпатий
  <h3>Место: г. Мамадыш, пересечение ул. Советская и ул. Гагарина (центральная, пешеходная улица)<br>
 </h3>
  </div>
  </div>

  <!-- События 2 -->
    <div class="ot" >
    <img class="picture" src = "../img/now8.jpg" alt="rest2" width="500px" height ="300px">

    <div class="right">
    <h2> Bolero танцевальное шоу Ляйсан Утяшевой</h2><br>

    Постановщик Ляйсан Утяшева и лучшие танцоры России приглашают ценителей искусства окунуться в мир страстей, выраженных движением.
  <br>


  В центре шоу Bolero – судьба и роль женщины, которая борется за своё место в мире. Уникальное часовое представление призвано разрушить стереотипы и задать новый эталон сценического действа. Совершенство – в деталях.
<br>
<h2>Стоимость: 1600-6000 р</h2><br><br>
<h3>  Место: КРК "Пирамида"<br>
Город: Казань<br>
Адрес: Московская ул., 3<br>
Ближайшее метро: Кремлёвская</h3>
    </div>
    </div>

  <!-- События 1 -->
    <div class="ot" >
      <img class="picture" src = "../img/now4.jpg" alt="rest1" width="500px" height ="300px">
        <div class="right">
    <h2> Open Space Market</h2><br>
    Долгожданное время чудес и волшебства приближается, друзья!

     <br>

    21 - 23 декабря приглашают вас весело и полезно провести предновогодний уикенд на большом трехдневном маркете, вместе с молодыми дизайнерами из разных городов России и творческими людьми Казани.

     <br>

    Найти особенные подарки к НГ среди широкого ассортимента уникальных вещей. А также традиционно, вкусно поесть, послушать отличную музыку, получить полезные знания, и новые знакомства.

     <br>

    - Дизайн-маркет (одежда, акссесуары, украшения, предметы интерьера)<br>
    - DJ-сеты | Музыка<br>
    - Лекции | Мастер-классы<br>
    - Конкурсы | Розыгрыши | Подарки<br>
    - Фудкорт<br>
    <h3> Место: ВЦ «Казанская ярмарка»<br>
Город: Казань<br>
Адрес: Оренбургский тракт, 8<br>
Ближайшее метро: Аметьево</h3>
<h2>Стоимость: 100 р</h2>
        </div>
    </div>


    <!-- События 1 -->
      <div class="ot" >
        <img class="picture" src = "../img/now5.jpg" alt="rest1" width="500px" height ="300px">
          <div class="right">
      <h2> Фестиваль гик-культуры Кавабанга</h2><br>

      23 декабря в Штабе пройдёт первый фестиваль гик-культуры Кавабанга!
<br>

<b>Вас ожидает:</b><br>

- традиционная предновогодняя Geek ярмарка<br>

- большая игротека от GaGa.ru<br>
- турнир по Mortal Kombat 3 от Бруталити<br>
- турнир по настольным играм<br>
- викторина по Marvel и DC<br>
- GaGa Дженга <br>
- лекция от Кирилла Зайсанова<br>
- фудкорт...и многое другое!<br>



Ждут всех фанатов комиксов, аниме, любителей различных фильмов, мультфильмов, сериалов и игр!
На фестивале ты найдёшь множество гик атрибутики, вкусняшек и весело проведешь время!
<h3>Бесплатно</h3>

          </div>
      </div>



      <!-- События 1 -->
        <div class="ot" >
          <img class="picture" src = "../img/now6.jpg" alt="rest1" width="500px" height ="300px">
            <div class="right">
        <h2> Рождественский концерт органной и хоровой музыки </h2><br>
        25 декабря в Евангелическо-Лютеранской церкови Святой Екатерины состоится рождественский концерт хоровой и органной музыки.

 <br>

Рождество - это одно из самых радостных событий года! В середине холодной, темной северной зимы музыка Рождества наполняет сердца миллионов христиан во всем мире теплом любви, светом веры и радостью надежды.
<br>


Исполнители - Александр Гринин и Фарида Нуруллоева (орган, г. Казань)

 <br>

<b>В программе:</b><br>
И. С. Бах Кантата №133, <br>
Н. Дилецкий "Слава и Единородный Сыне", <br>
Спиричуэл Joshua fit the battle, <br>
Грубер Silent night, из репертуара Pentatonix.<br>
И. С. Бах концерт для органа №3 до мажор (по А. Вивальди) bwv 594, <br>
Ж. Ален Литании awv 100<br>
М .Леонтович "Carol of the bells", переложение для органа Ф. Нуруллоевой<br><br>
<h2>25 декабря в 18:30<br>Стоимость: 200р</h2>
<h3>Место: Евангелическо-Лютеранская церковь Святой Екатерины<br>
Город: Казань<br>
Адрес: Карла Маркса, 26<br>
Ближайшее метро: Кремлёвская</h3>

            </div>
        </div>

        <!-- События 1 -->
          <div class="ot" >
            <img class="picture" src = "../img/now7.jpg" alt="rest1" width="500px" height ="300px">
              <div class="right">
          <h2> Мастер-класс "Новогодний декупаж" по созданию декорированной тарелки </h2><br>


Музей исламской культуры приглашает всех желающих на мастер-класс по созданию прекрасного новогоднего сувенира. <br>
Под руководством мастера каждый из вас сделает индивидуальную тарелку в технике декупаж. Она станет интересным подарком для друзей и близких или украшением вашего дома.

<br><br>
<h2>Стоимоть: 350р</h2>
<h3>Место: Музей исламской культуры<br>
Город: Казань<br>
Адрес: Казанский Кремль<br>
Контактные данные:5678125<br>
Ближайшее метро: Кремлёвская</h3>
              </div>
          </div>
  <br><br>
  </body>
</html>
