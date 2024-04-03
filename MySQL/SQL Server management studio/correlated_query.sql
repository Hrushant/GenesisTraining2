CREATE TABLE PROJECT (PROJECT_NO CHAR(4) ,PROJECT_NAME CHAR(15) NOT NULL, BUDGET FLOAT NULL,
CONSTRAINT PK_PROJ PRIMARY KEY (PROJECT_NO));

CREATE TABLE WORKS_ON (EMP_NO INT, PROJECT_NO CHAR(4), JOB CHAR(15) NULL, ENTER_DATE DATE NULL,
 CONSTRAINT PK_WORKS PRIMARY KEY (EMP_NO,PROJECT_NO),
 CONSTRAINT FK1_WORKS FOREIGN KEY (EMP_NO) REFERENCES employees(employee_id) ON DELETE CASCADE,
 CONSTRAINT FK2_WORKS FOREIGN KEY (PROJECT_NO) REFERENCES PROJECT(PROJECT_NO) ON UPDATE CASCADE)

INSERT INTO PROJECT values ('P1', 'Apollo', 95000.00)
INSERT INTO PROJECT values ('P2', 'Gemini', 100000.00)
INSERT INTO PROJECT values ('P3', 'Mercury', 150000.00)

insert into  WORKS_ON values( 108,'P1', 'Finance Manager','1995-10-12')
insert into  WORKS_ON values( 118,'P1', 'Clerk','1999-11-12')
insert into  WORKS_ON values( 118,'P2', 'Clerk','2000-11-12')
insert into  WORKS_ON values( 206,'P1', 'Manager','1995-11-12')
insert into  WORKS_ON values( 103,'P1', 'PROGRAMMER','1990-03-03')
insert into  WORKS_ON values( 103,'P2', 'PROGRAMMER','1990-05-06')
insert into  WORKS_ON values( 104,'P2', 'PROGRAMMER','1990-05-06')

select * from Project;
select * from WORKS_ON;

--A sunquery is a correlated sub query if the inner depends on the outer query fro any of it's value
--Display all the employee name who work in a given 
Select E.First_name from employees e where 'P2' in (select project_no from WORKS_ON w where w.EMP_NO = e.employee_id);


--correlated sub queries
--A correlated subquery is a subquery that depends on the outer query and is evaluated for each instance of the outer query.
use hrdb
--This correlated subquery compares each employee's salary with the average salary in their respective department.
SELECT e.first_name, e.last_name
FROM employees e
WHERE e.salary > (
    SELECT AVG(e2.salary)
    FROM employees e2
    WHERE e2.department_id = e.department_id
);

--List departments with the highest-paid employee in each department:
SELECT d.department_name, e.first_name, e.last_name, e.salary
FROM departments d
JOIN employees e ON d.department_id = e.department_id
WHERE e.salary = (
    SELECT MAX(e2.salary)
    FROM employees e2
    WHERE e2.department_id = d.department_id
);
--This correlated subquery identifies the employee with the highest salary in each department and returns their information along with the department name.