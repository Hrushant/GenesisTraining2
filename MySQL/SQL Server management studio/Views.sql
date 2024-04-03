--VIEWS--
--It's not physical available,it is only virtual table.
--provides security only showing imp information.
--Views are a logical way of viewing data in underlying physical table.
--Views are not stored only the actual table is stored
--Views can be created,drop,alter same as tables


Go 
 create view emp_departments as select e.first_name, e.last_name, d.department_name from employees e
 join departments d on e.department_id = d.department_id;
Go
	select * from emp_departments;


--Create a view named IT employees that display only employees from It Departments
Go 
create view IT_employees as select e.first_name, e.last_name, d.department_name from employees e
 join departments d on e.department_id = d.department_id where department_name = 'IT';
Go
	select * from IT_employees;


-------------------------------------------------------------------------------------------------
--Create a view and later from this view create another view...
Go
  Create view v_clerk as select emp_no, project_no, enter_date from works_on where job='Clerk'
Go
  Create view v_project_p2 as select emp_no from v_clerk where PROJECT_No = 'p2'
Go
	select * from v_project_p2;
	select * from works_on;
	select * from v_clerk;

---------------------------------------------------------------------------------------------------
create table person (pid int primary key, pname varchar(20), age int);
insert into person values(1,'Sohan',22);
insert into person values(2,'Hrush',21);
insert into person values(3,'Abhi',24);
insert into person values(4,'Abhi2',25);
insert into person values(5,'Pranav',29);
select * from person;

Go
create view v_person as select pid,pname from person ;
select * from V_person;

--alter view V_person as select * from person;         
insert into v_person values(6,'Arun');
select * from V_person;                                  --inserting,updating,deleting values in view also updated in parent table(must have only one parent)
Go
