/*Create a user-defined function which add two numbers*/

CREATE FUNCTION dbo.AddNumbers
(
	@num1 int,
	@num2 int
)
RETURNS int
as
BEGIN
	Declare @total int

	Set @total = @num1 + @num2

	Return @total
END;


--Call the AddNumbers function

Declare @result int   --declare a number
set @result = dbo.AddNumbers(5,7)  --call the method and store reurned data
select @result;  ----display the result


------------------------------------------------------------------------------------------------------
--Calculate the total salary obtained by employees in a given department
go
create function sum_of_salary_dept(@dept_id int)
returns decimal(16,2)
begin
declare @sumx dec(16,2)
select @sumx = sum(salary) from employees where department_id = @dept_id
return @sumx
end
go

--Execute the function
select dbo.sum_of_salary_dept(3);



-------------------------------------------------------------------------------------------------------
use hrdb;

go
--multi statement table-values function
create function hr_employeeNames (@format nvarchar(9))
returns @tbl_employees table (EmployeesId int primary key, [Employee Name] nvarchar(70))
As
Begin 
	if(@format = 'SHORTNAME')
		Insert @tbl_Employees select employee_id, first_name from employees
	else if(@format = 'LONGNAME')
		Insert @tbl_Employees select employee_id, (first_name + ' ' + last_name) from employees
	return
end;

go
select * from dbo.hr_employeeNames('LONGNAME');


------------------------------------------------------------------------------------------------------------
