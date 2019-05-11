/*create database chapter3;

use chapter3;

create table t_role
(
    id        int(12) auto_increment,
    role_name varchar(60)  not null,
    note      varchar(256) null,
    primary key (id)
);

insert into t_role(role_name,note) values('role_name_1','note_1');*/
create database chapter4;

use chapter4;

create table t_user
(
    id             int(12) not null auto_increment,
    user_name      varchar(60) not null,
    password       varchar(60) not null,
    sex            char(1) not null,
    mobile         varchar(20) not null,
    tel            varchar(20),
    email          varchar(60),
    note           varchar(512),
    primary key (id)
);

insert into t_user(user_name,password,sex,mobile,tel,email,note)
values('user_name_1','pwd',1,'13888888888','010-88888888','y666@163.com','note_1');

alter table t_user modify sex varchar(10);
update t_user set sex='FEMALE' where sex='1';
