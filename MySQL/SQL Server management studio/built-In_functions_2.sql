use hrdb;

select first_name,email,phone_number,salary,hire_date into employee_details from employees;
alter table employee_details alter column email varchar(40) null;

update employee_details set email=null where first_name='Shelley';
update employee_details set email=null where first_name='william';

select ISNULL(email,phone_number) 'Address' from employee_details;
select Coalesce(email,phone_number,'Not Found') 'Address' from employee_details;




select cast('1233' as int);     /*convert string into int*/
select round('222.3567',2);
select cast('2034-10-12' as DateTime);
select cast('2034-10-12' as DateTime);

select CONVERT(varchar,GETDATE(),102) as dateconvert;

select TRY_ConVert(DateTime ,'2020/10/12',101) result;
select TRY_PARSE('34 April 2020' as Date) result;
select TRY_PARSE('-124566' as int);










