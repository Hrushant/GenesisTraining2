/* Group By */
show tables;
select * from countries;
select * from departments;
select * from dependents;
select * from employees;
select * from jobs;
select * from locations;
select * from regions;

select e.department_id, d.department_name , avg(e.salary) from employees e
join departments d on e.department_id = d.department_id 
group by department_id;


select max(salary) from employees where salary < (select max(salary) from employees);
select first_name,salary from employees order by salary DESC limit 5;