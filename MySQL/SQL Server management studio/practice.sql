--Practice--

--Write a query to find the employee(s) with the highest salary in each department. Display the department_id, department_name, employee_id, first_name, and salary.
select * from departments;
select * from employees;


select d.department_id,d.department_name,e.employee_id,e.first_name,e.salary from employees e
join departments d on e.department_id = d.department_id 
where e.salary IN (select max(salary) from employees where department_id = d.department_id);


----------------------------------------------------------------------------------------------------------------
--Find all employees who work in the region with region_name = 'Europe':

select first_name,last_name from employees e
join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
join countries c on l.country_id = c.country_id
join regions r on c.region_id = r.region_id
where r.region_name = 'Europe';

---------------------------------------------------------------------------------------------------------
