<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel='StyleSheet' href="../css/shop.css" type='text/css'>
    <link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet">
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <title>Shop</title>
</head>
<script>
    function sendProductId(productId) {
        $.ajax({
            type: 'post',
            url: '/products',
            data: {
                productId: productId
            }
        }).done(function (data) {
            let contentTableHTML = "<table>";
            contentTableHTML += "<tr>" +
                "<th>Номер</th>" +
                "</tr>";
            for (let i = 0; i < data.length; i++) {
                contentTableHTML += "<tr>";
                contentTableHTML += "<td>" + data[i].title + "</td>";
                contentTableHTML += "<td>" + data[i].sum + "</td>";
                contentTableHTML += "</tr>";
            }
            contentTableHTML += "</table>";
            let contentTableDiv = document.getElementById("table");
            contentTableDiv.innerHTML = contentTableHTML;

        }).fail(function () {
            alert("FAIL")
        });
    }
        $.ajax({
            type: 'get',
            url: '/products',
            data: {

            }
        }).done(function (data) {
            let contentTableHTML = "<table>";
            contentTableHTML += "<tr>" +
                "<th>Номер</th>" +
                "</tr>";
            for (let i = 0; i < data.length; i++) {
                contentTableHTML += "<tr>";
                contentTableHTML += "<td>" + data[i].title + "</td>";
                contentTableHTML += "<td>" + data[i].sum + "</td>";
                contentTableHTML += "</tr>";
            }
            contentTableHTML += "</table>";
            let contentTableDiv = document.getElementById("table");
            contentTableDiv.innerHTML = contentTableHTML;
        }).fail(function () {
            alert("FAILe")
        });

</script>
<body>
<h1>SHOP</h1>
<div id="products">
    <div class="item" id="i1">
        <img src="../img/1.jpg"/>
        <label class="title">Майка 1</label>
        <label class="price">200 р.</label>
        <button class="btn_send" onclick="sendProductId(1)">Добавить</button>
    </div>

    <div class="item" id="i2">
        <img src="../img/2.jpg"/>
        <label class="title">Майка 2</label>
        <label class="price">240 р.</label>
        <button class="btn_send" onclick="sendProductId(2)">Добавить</button>
    </div>
    <div class="item" id="i3">
        <img src="../img/3.jpg"/>
        <label class="title">Майка 3</label>
        <label class="price">180 р.</label>
        <button class="btn_send" onclick="sendProductId(3)">Добавить</button>
    </div>
    <div class="item" id="i4">
        <img src="../img/4.jpg"/>
        <label class="title">Майка 4</label>
        <label class="price">300 р.</label>
        <button class="btn_send" onclick="sendProductId(4)">Добавить</button>
    </div>
    <div class="item" id="i5">
        <img src="../img/5.jpg"/>
        <label class="title">Майка 5</label>
        <label class="price">280 р.</label>
        <button class="btn_send" onclick="sendProductId(5)">Добавить</button>
    </div>

</div>
<div id="table">
    </div>
<div id="product"></div>
</body>
</html>
