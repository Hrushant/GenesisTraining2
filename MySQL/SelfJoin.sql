/* Self join ---> */

use HRDB;
show tables;
select * from employees;
select e.first_name, e.employee_id, m.first_name, m.last_name 
from employees e
join employees m where e.employee_id = m.manager_id;

