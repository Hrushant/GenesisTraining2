--OUT parameter--

--calculate the total salary of all employees for given department
use hrdb;
drop procedure calculate_tot_sal;
Go
create Procedure calculate_tot_sal
	@department_id int,
	@tot_sal Decimal(8, 2) OUT
As 
Begin
	Select @tot_sal = sum(salary)
	From employees
	where department_id = @department_id;
End;
Go
	Declare @tot_sal Decimal(8, 2)
	Declare @did int =3;
	Exec calculate_tot_sal @did, @tot_sal OUTPUT;
	print @tot_sal;
Go
---------------------------------------------------------------------------------------
--Update an employee's salary and return their new salary--

create procedure updateSalaryEmp
	@emp_id int,
	@updated_sal int,
	@sal_percentage Decimal(3,2) OUTPUT
AS
begin
	Update employees set salary = salary +(salary * @sal_percentage/100) where employee_id = @emp_id;
	select @updated_sal = salary from employees where employee_id = @emp_id;
END;
Go 
	select salary from employees where employee_id=100
	declare @newSalary decimal(8,2)
	declare @emp_id int = 100;
	declare @per decimal(4,2) = 12.0;
GO


exec updateSalaryEmp @per, @emp_id, @newSalary OUTPUT
print @per;

select * from employees;
