use HRDB;

select first_name, salary from employees where salary = (select max(salary) from employees);

select first_name, salary ,d.department_name from employees e
join departments d on e.department_id = d.department_id 
where salary  > (select avg(salary) from employees);

select first_name, salary ,d.department_name from employees e
join departments d on e.department_id = d.department_id 
where salary  > (select avg(salary) from employees) AND d.department_name = 'Sales';


