--identity key --> ?

create table stu (sid int primary key identity, sname varchar(20));
insert into stu(sid,sname) values (1,'Alice');
insert into stu(sid,sname) values (2,'rom');
insert into stu(sid,sname) values (3,'shom');