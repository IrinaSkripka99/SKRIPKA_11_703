--﻿1. Отобрать всех режиссёров, у которых лучший фильм был снят в 2000 году
SELECT producer.name,movies.name FROM producer INNER JOIN movies
ON(movie_id = producer_best_movie) AND (movies.year=2000);

--2. Вывести всех режиссёров, которые сняли более 5 фильмов.
SELECT producer_id, producer.name,
  count(producer_id = movies.movie_producer)
FROM producer
JOIN movies ON (producer_id = movie_producer)
GROUP BY producer_id
HAVING count(producer_id = movie_producer) > 5;


--3. Отобрать идентификаторы фильмов, где снималось более 10 актёров
SELECT movies.movie_id FROM movies
RIGHT JOIN movie_actor ON (movies.movie_id = movie_actor.movie_id)
GROUP BY movies.movie_id
HAVING count(movies.movie_id = movie_actor.movie_id) > 10;

--4. Добавить поле оценка в таблицу фильмов. Получить топ-10 фильмов с наивысшей оценкой, снятых в США
SELECT movie_id, name, asessment FROM movies WHERE country = 'USA'
ORDER BY movies.asessment DESC LIMIT 10;

--5.Отобрать все различные фильмы ужасов, в которых снимались актёры родом из Англии
SELECT movies.name, genres.name
FROM movies
JOIN movie_actor ON movie_actor.movie_id = movies.movie_id
JOIN actors ON movie_actor.actor_id = actors.actor_id
JOIN movie_genre ON movies.movie_id = movie_genre.movie_id
JOIN genres ON movie_genre.genre_id = genres.genre_id
GROUP BY movies.movie_id, genres.name
HAVING (count(motherland = 'UK') > 0) AND (genres.name = 'Horror');

--6. Отобрать актеров, которые снимались у режиссёров из Англии с 2007 по 2010 год
SELECT actors.actor_id,actors.name FROM actors
JOIN movie_actor ON movie_actor.actor_id=actors.actor_id
JOIN movies ON movie_actor.movie_id = movies.movie_producer
JOIN producer ON movies.movie_producer = producer.producer_id
GROUP BY actors.actor_id,actors.name,producer.motherland,movies.year
HAVING (producer.motherland='UK') AND (year>=2007) AND (year<=2010);

--7. Оценить средние бюджеты фильмов, вышедших до 2000 года,
--  с 2000 по 2005, с 2005 по 2010, с 2010 по настоящее время.

SELECT movies.year,AVG(movies.budget)
FROM movies GROUP BY movies.year
HAVING (year>=2000 AND year<=2005);

--8. Получить суммарный бюджет фильмов, которые снимались режиссёрами,
--  фамилия которых заканчивается на "V" или "N".

SELECT SUM(budget) FROM movies JOIN producer ON(producer_id=movie_producer)
WHERE (producer.surname LIKE '%V' OR producer.surname LIKE '%N');

--9.Получить максимальные бюджеты фильмов по годам

SELECT DISTINCT ON(movies.year)
movies.name,max(movies.budget),movies.year FROM movies GROUP BY movies.name,movies.year,
movies.budget ORDER BY movies.year,movies.budget DESC ;

--10. Получить все фильмы, снятые до 2010 года, бюджет
-- которых меньше бюджета любого фильма снятого после 2010 года.

SELECT DISTINCT movies.name FROM movies WHERE budget
IN(SELECT budget FROM movies WHERE budget =(
SELECT MIN(budget) as minz FROM movies WHERE (movies.year>2010))
AND (budget<minz))AND (movies.year<2010);
