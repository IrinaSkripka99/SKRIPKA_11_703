var products = [
			Arahis = {
				name:"Арахис",
				kal: 5.48,
				fat: 0.45,
            	proteins: 0.26,
				carboh: 0.1
		  },
			Baranina = {
				name:"Баранина",
				kal: 2,
				fat: 0.15,
            proteins: 0.16,
				carboh: 0.01
		  },			Apple = {
				name:"Яблоко",
				kal: 0.46,
				fat: 0.01,
            proteins: 0.004,
				carboh: 0.11
		  }
		]
      
      for (var i = 0; i < products.length ; i++) {
          var select = document.getElementById('name');
          var newOption = new Option(products[i].name, i);
          select.appendChild(newOption);    
      }
       
       function checkUser() {
		   sex = +($('input[name=sex]:checked').val());
		   target = +($('input[name=target]:checked').val());
           var d = document;
           var userWeight;
           var height;
           var sex;
           var age;
           var target;
		   var userKal = +amountKal.innerHTML;

           userWeight = +(d.getElementById('userWeight').value);
           height = +(d.getElementById('height').value);
           age = +(d.getElementById('age').value);
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
				   adviceExer.innerHTML = "Съесть " + Math.round(difference / Apple.kal) + "г яблок.";
			   } else if (difference < 800) {
				   adviceExer.innerHTML = "Съесть " + Math.round(difference / Arahis.kal) + "г арахиса.";
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
       
       
        function addRow()
        {
            var d = document;
            var name;
            var weight;
            var value;
            
            // Считываем значения с формы
            value = d.getElementById('name').value;
            weight = d.getElementById('weight').value;

            // Находим нужную таблицу
            var tbody = d.getElementById('tab1').getElementsByTagName('TBODY')[0];

            // Создаем строку таблицы и добавляем ее
            var row = d.createElement("TR");
            tbody.appendChild(row);

            // Создаем ячейки в вышесозданной строке
            // и добавляем тх
            var td1 = d.createElement("TD");
            var td2 = d.createElement("TD");
            var td3 = d.createElement("TD");
            var td4 = d.createElement("TD");
            var td5 = d.createElement("TD");
            

            row.appendChild(td1);
            row.appendChild(td2);
            row.appendChild(td3);
            row.appendChild(td4);
            row.appendChild(td5);

            // Наполняем ячейки
            td1.innerHTML = products[value].name;
            td2.innerHTML = (+products[value].fat * weight).toFixed(2);
            td3.innerHTML = (+products[value].proteins * weight).toFixed(2);
            td4.innerHTML = (+products[value].carboh * weight).toFixed(2);
            td5.innerHTML = (+products[value].kal * weight).toFixed(2);
            
            d.getElementById('amountFat').innerHTML = +(+(d.getElementById('amountFat').innerHTML) + products[value].fat * weight).toFixed(2);
            d.getElementById('amountKal').innerHTML = +(+(d.getElementById('amountKal').innerHTML) + products[value].kal * weight).toFixed(2);
            d.getElementById('amountCarboh').innerHTML = +(+(d.getElementById('amountCarboh').innerHTML) + products[value].carboh * weight).toFixed(2);
            d.getElementById('amountProt').innerHTML = +(+(d.getElementById('amountProt').innerHTML) + products[value].proteins * weight).toFixed(2);
        }
       
       function isNumeric(n) {
          return !isNaN(parseFloat(n)) && isFinite(n);
        }
