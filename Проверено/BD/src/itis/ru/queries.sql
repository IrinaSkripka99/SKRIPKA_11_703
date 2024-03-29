--﻿1. Отобрать всех режиссёров, у которых лучший фильм был снят в 2000 году.
SELECT producer_id,producer.name FROM producer, movies
WHERE (movie_id = producer_best_movie) AND (movies.year= 2000);

--2. Вывести всех режиссёров, которые сняли более 5 фильмов.
SELECT producer_id, producer.name, producer.surname FROM producer, movies
WHERE (producer_id = movie_producer) GROUP BY producer_id
HAVING count(producer_id = movie_producer) > 5;

--3. Отобрать илентификаторы фильмов, где снималось более 10 актёров.
SELECT movies.movie_id FROM movies, movie_actor WHERE (movies.movie_id = movie_actor.movie_id)
GROUP BY movies.movie_id HAVING count(movies.movie_id = movie_actor.movie_id) > 10;

--4. Добавить поле оценка в таблицу фильмов. Получить топ-10 фильмов с наивысшей оценкой, снятых в США.
SELECT movie_id, name, asessment FROM movies WHERE country = 'USA'
ORDER BY movies.asessment DESC LIMIT 10;

--5. Отобрать все различные фильмы ужасов, в которых снимались актёры родом из Англии.
SELECT movies.name, genres.name
FROM movies, movie_actor, actors, movie_genre, genres
WHERE (movie_actor.movie_id = movies.movie_id) AND (movie_actor.actor_id = actors.actor_id)
      AND (movies.movie_id = movie_genre.movie_id) AND (movie_genre.genre_id = genres.genre_id)
GROUP BY movies.movie_id,genres.name
HAVING (count(motherland= 'UK') > 0) AND (genres.name = 'Horror');

--8. Вывести жанры фильмов. которые снимал режиссер из Англии или из Франции
SELECT genres.name FROM producer,movies,movie_genre,genres
WHERE (producer_id=movies.movie_producer) AND (movies.movie_id=movie_genre.movie_id)
AND (movie_genre.genre_id=genres.genre_id)
GROUP BY genres.name,producer.motherland
HAVING (producer.motherland='UK') OR (producer.motherland='France');

--6. Отобрать все жанры фильмов, по которым в базе данных присутствует более 5 фильмов.
SELECT genres.name FROM genres,movie_genre WHERE (genres.genre_id=movie_genre.genre_id)
GROUP by genres.name
HAVING count (genres.genre_id=movie_genre.genre_id)>5;

--7. Получить вторую десятку фильмов по продолжительности.



