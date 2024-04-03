--Stored_procedures--

--They can be almost anywhere in a T-SQL statement,
--They can accept one or more parameters,
--it can not have return value,
--accept any no. of input and output parameters,

Go
create procedure DepartmentCountryRegion
	@department_id int
	as
	begin
	select d.department_id, d.department_name, c.country_name, r.region_name
	from departments d
	join locations l on l.location_id = d.location_id
	join countries c on c.country_id  = l.country_id
	join regions   r on r.region_id   = c.region_id
	where d.department_id = @department_id
	end
	Go

	execute DepartmentCountryRegion 7
	execute DepartmentCountryRegion 8

--------------------------------------------------------------------------------------------------------------------------

--write sp that will increase the budget amount of all project with specified amount of percent
Go
  create procedure increase_budget (@percent int, @pr_no char(4))
as
  update project set budget = budget +(budget * @percent/100) where project_no = @pr_no
Go

execute increase_budget @percent=2, @pr_no='P2'

select * from project;

------------------------------------------------------------------------------------------------------------------------------


--create a sp Increament the budget for project by 5% which has lesser budget than avg budget

Go
  create procedure increases_budget 
as
  update project set budget = budget +(budget * 5 /100) where budget < (select avg(budget) from project)
Go

execute increases_budget 

select * from project;

--------------------------------------------------------------------------------------------------------------------------------

--Create a stored Procedure to  insert a  new record in the region table .
use hrdb;
select * from regions;
Go
 create procedure inserting_record
as
 insert into regions values(5,'Middle Asia');
Go
execute inserting_record;

---------------------------------------------------------------------------------------------------------------------------------

--Create a stored Procedure that takes the employee id as input parameter and displays the employee name, along with the email or phone(which ever is available) as ‘contact Details’   .If no contact information is available display ‘Not Available’ . 
select * from employees;
Go
 create procedure employee_procedure6 (@ID int)
as
 select concat(first_name,' ',last_name) as employee_name , coalesce(phone_number, email , 'Not Available')contact_details from employees where employee_id = @ID
Go
execute employee_procedure6 @ID = 146;


-----------------------------------------------------------------------------------------------------------------------------------

--Create a stored procedure named GetEmployeesInDepartment that takes a department name as input and returns the list of employees in that department, with the following information : first name, last name ,department name , job titles and salaries.
select * from departments;
select * from employees;
select * from jobs;
drop procedure GetEmployeesInDepartment
Go
 create procedure GetEmployeesInDepartment (@Dept_name varchar(30))
as 
 begin
 select e.first_name, e.last_name , d.department_name, j.job_title , e.salary from employees e
 join departments d on e.department_id = d.department_id
 join jobs j on j.job_id = e.job_id
 where department_name = @Dept_name
 end
Go
execute GetEmployeesInDepartment @Dept_name='IT';


-----------------------------------------------------------------------------------------------------------------------------

--Create a stored procedure named GetDependentCountByEmployee that takes an employee ID as input and returns the count of dependents for that employee.
select * from employees;
select * from dependents;
insert into dependents values(31,'Hru','Patil','Father',101);
drop procedure GetDependentCountByEmployee;
Go
 create procedure GetDependentCountByEmployee (@emp_id int)
as
 select count(@emp_id) from employees e
 join dependents d on e.employee_id = d.employee_id
 where e.employee_id = @emp_id;
Go
execute GetDependentCountByEmployee @emp_id = 101;

------------------------------------------------------------------------------------------------------------------------------------

--Create a stored procedure named GetTotalSalariesByDepartment that calculates and returns the total salaries of all employees in each department.
 select * from employees;
 drop procedure GetTotalSalariesByDepartment;
 go
  create procedure GetTotalSalariesByDepartment
as
 select sum(salary),department_id from employees  group by department_id;
go
execute GetTotalSalariesByDepartment;

-------------------------------------------------------------------------------------------------------------------------------------------

--Create a stored procedure named GetEmployeeDetailsWithManager that takes an employee ID as input and returns all the details of that employee along with their manager's name.
select * from employees;
drop procedure GetEmployeeDetailsWithManager;
Go
 create procedure GetEmployeeDetailsWithManager(@emp_id int)
as
 select e.first_name as emp_name, m.first_name as manager_name from employees e
 join employees m on e.manager_id = m.employee_id
 where e.employee_id = @emp_id;
Go
execute GetEmployeeDetailsWithManager @emp_id = 101;

----------------------------------------------------------------------------------------------------------------------------------------

--Create a stored procedure named GetLocationWithMostEmployees that identifies the location (city) with the most employees and returns the location name and the number of employees.
select * from employees;
select * from departments;
select * from locations;
drop procedure GetLocationWithMostEmployees;

go
 create procedure GetLocationWithMostEmployees
as
 select TOP(1) city,count(e.first_name)as cnt from employees e
 join departments d on e.department_id = d.department_id
 join locations l on d.location_id = l.location_id
 group by l.city order by count(e.first_name) desc;
Go
execute GetLocationWithMostEmployees;

----------------------------------------------------------------------------------------------------------------------------------------

