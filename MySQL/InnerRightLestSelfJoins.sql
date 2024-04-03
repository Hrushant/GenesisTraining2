use demo;
select * from department;
select * from employee;

/* Inner join, right outer join , left outer join ---> */

select e.ename, d.did , d.dname from employee e 
inner join department d 
on e.did=d.did;

select e.ename, d.did , d.dname from employee e 
left join department d 
on e.did=d.did;

select e.ename, d.did , d.dname from employee e 
right join department d 
on e.did=d.did;



select e.first_name as empName, e.last_name , m.first_name as managerName, m.last_name
from employees e
left join employees m on e.employee_id = m.manager_id;