create table "order" (
  id serial primary key,
  date timestamp,
  user_id bigint,
  payment_method VARCHAR (10),
  foreign key (user_id) references table_user(id)
);

create table table_user (
  id            SERIAL PRIMARY KEY,
  email         VARCHAR(50),
  hash_password VARCHAR(200),
  first_name    VARCHAR(30),
  last_name     VARCHAR(30)
);


create table "table" (
  id serial primary key,
  count_of_person VARCHAR(2)
);

CREATE TABLE table_order (
  table_id bigint,
  order_id bigint,
 foreign key (table_id) references "table"(id),
  foreign key (order_id) references "order"(id)
);

CREATE TABLE payment_user_card (
  number_of_card VARCHAR (16),
  name_user VARCHAR (50),
  data_card VARCHAR (4),
  cvv INTEGER
)