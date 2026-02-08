

-- ddl

create database PRODUCTS;
use PRODUCTS;
drop table if exists customers;
create table customers(cid integer, cname varchar(10) not null, phoneNo varchar(10) unique);
insert into customers values (101,'babal','1234567891');
insert into customers values (102,'preet','1234567891');
insert into customers values (102,'preet','1234556974');

INSERT INTO customers (cid, cname) VALUES (104, 'amit');
select * from customers;

drop table customers;

create table orders(oid int,type_of varchar(10));
insert into orders value(101,'phone');


create table customers2(cid integer primary key, cname varchar(10) not null, phoneNo varchar(10) unique);
insert into customers2 values (101,'babal','1234567891');
insert into customers2 values (102,'preet','1234567891');
insert into customers2 values (102,'preet','1234556974');

drop table if exists orders;
create table orders(oid int,type_of varchar(10), c_id int,
foreign key (c_id )references customers2(cid));
insert into orders value(11,'phone',101);

select * from orders;
select * from tabs;


