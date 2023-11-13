drop table if exists book
create table Book(
    id serial PRIMARY KEY,
    name varchar(30),
    type varchar(50)
);