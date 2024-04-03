--Get all employees who have dependents--
create function get_emp_dependents() returns 
@employees_table Table(
	employee_id int,
	first_name varchar(20),
	last_name varchar(20)
	)
As
Begin
	insert into @employees_table
	select Distinct e.employee_id, e.first_name,e.last_name
	from employees e join dependents d on e.employee_id=d.employee_id;
	return
end;
go
	select * from get_emp_dependents()

----------------------------------------------------------------------------------------
