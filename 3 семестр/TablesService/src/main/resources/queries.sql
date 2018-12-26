SELECT *
from "order";

SELECT *
from "order"
ORDER BY user_id DESC;

-- Многие к одному, хотим получить пользователей и их заказы

-- Вытащила только пересечение
SELECT table_user.*, o.id as order_id, o.*
from table_user
       JOIN "order" o on table_user.id = o.user_id;

-- Получим ВСЕХ пользователей их заказы
SELECT table_user.*, o.id as order_id, o.*
from table_user
       LEFT JOIN "order" o on table_user.id = o.user_id;

-- Получим ВСЕ заказы их пользователей
SELECT table_user.*, o.id as order_id, o.*
from table_user
       RIGHT JOIN "order" o on table_user.id = o.user_id;

-- Получить ВСЕ

SELECT table_user.*, o.id as order_id, o.*
from table_user FULL
       OUTER JOIN "order" o on table_user.id = o.user_id;

-- Получить всех пользователей и пиццы, которые они заказали
select tables.name as tables_name, p_o.user_name
from tables
       join tables_order po on tables.id = po.tables_id
       join (select tables_user.first_name as user_name, o.id as order_id
             from tables_user
                    join "order" as o on tables_user.id = o.user_id) as p_o on p_o.order_id = po.order_id;