/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Perin
 * Created: 17/11/2018
 */

create table Student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

create table Product
(
   id integer not null,
   name varchar(255) not null,
   primary key(id)
);