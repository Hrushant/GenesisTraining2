/*Build-In functions*/

use hrdb;

/*STRING --> */
select len(' Hello      ');        /*space before characters will be considered....not afetr characters*/
select len(trim('  Hello'));       /* remove extra spaces*/
select SUBSTRING('Welcome',2,3);
select Upper(first_name),last_name from employees;
select concat(first_name,'.',last_name) as Full_name from employees;  /*It can take 54 arguments*/
/* explore other functions  --> https://learn.microsoft.com/en-us/sql/t-sql/functions/len-transact-sql?view=sql-server-ver16  */

/*MATHEMATICAL --> */
Select (salary+(salary * 0.13)) as Increamented_Salary from employees;
Select Round((salary+(salary * 0.13)),2) Increamented_Salary from employees;
select round(1234.56789,2);
select CEILING(1234.5678);
select Ceiling($123.45);

/*DATE AND TIME --> */
select DATEDIFF(year,'2008-10-01', getDate()) as 'Age';

select first_name ,datediff(year,hire_date,getDate()) as 'Years of Experince' from employees;
select * from employees;

select DATEADD(day,7,getDate()) 'Date_Of_Return';  /*It adds 7 days in today's date*/

select DATEPART(week, '2007-01-3'), DATEPART(weekday,'2023-10-11'),DATEPART(day,'2023-10-11'),DATEPART(MONTH,'2023-10-11');



