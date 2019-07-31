--1.Написать запрос для подсчёта факториала с помощью рекурсивного запроса.
-- Вывести первые 19 строк.

WITH RECURSIVE r AS (
    SELECT
        1 AS i,
        1 AS factorial
    UNION
    SELECT
        i+1 AS i,
        factorial * (i+1) as factorial
    FROM r
    WHERE i < 12
)
SELECT * FROM r;

--2. Создать таблицу с географической информацией со следующими полями
-- Получить все объекты из Европы с уровнем вложенности.
--(id, par_id, name)
CREATE TABLE geo (
    id int not null primary key,
    par_id int references geo(id),
    name varchar(1000)
);

INSERT INTO geo
(id, par_id, name)
VALUES
	(1, null, 'Планета Земля'),
	(2, 1, 'Континент Евразия'),
	(3, 1, 'Континент Северная Америка'),
	(4, 2, 'Европа'),
	(5, 4, 'Россия'),
	(6, 4, 'Германия'),
	(7, 5, 'Москва'),
	(8, 5, 'Санкт-Петербург'),
	(9, 6, 'Берлин');

WITH RECURSIVE r AS (
   SELECT id, par_id, name, 1 AS level
   FROM geo
   WHERE par_id = 4

   UNION

   SELECT geo.id, geo.par_id, geo.name, r.level + 1 AS level
   FROM geo
      JOIN r
          ON geo.par_id = r.id
)

SELECT * FROM r;
