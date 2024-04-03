create database sampledb;
use sampledb;
show tables;
Create table employees(
    empId int primary key auto_increment,
    firstname nvarchar(20),
    lastname nvarchar(30)
);
Insert into employees (firstname, lastname)
values ('Donald', 'Duck');
Insert into employees (firstname, lastname)
values ('Micky', 'Mouse');
select * from employees;


