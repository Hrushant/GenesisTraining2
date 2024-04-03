use HRDB;
select * from employees;
select * from regions join countries on
regions.region_id = countries.region_id;

select * from countries join regions on
regions.region_id = countries.region_id;

/* display the country names along with their name-->*/
select country_name, region_name from countries c join regions r on r.region_id = c.region_id;

select * from employees;
select * from departments;
select first_name,last_name, department_name from employees e join departments d on e.department_id = d.department_id where d.department_name='IT';

select * from employees;
select * from departments;
select count(*) from employees where salary > 10000;


select * from departments;
select * from locations;
select * from countries;
select * from regions;
select first_name,department_name,city,country_name,region_name from employees e 
join departments d on e.department_id = d.department_id 
join locations l on d.location_id = l.location_id
join countries c on l.country_id = c.country_id
join regions r on c.region_id = r.region_id;


select * from departments;
select first_name,department_name,city from departments d 
join employees e on d.department_id = e.department_id
join locations l on d.location_id = l.location_id
where d.department_name = 'Sales' OR d.department_name = 'Finance';


select * from jobs;





























