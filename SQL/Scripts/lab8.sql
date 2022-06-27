-- Laboratorio 8
-- 1
SELECT EXTRACT(month FROM hire_date) 
FROM HR.employees
WHERE department_id IN (SELECT department_id FROM HR.departments WHERE location_id 
= (SELECT location_id FROM HR.locations 
WHERE city = 'Seattle'));


-- 2
SELECT * FROM HR.departments WHERE department_id IN 
(SELECT e.department_id FROM HR.employees e
GROUP BY department_id
HAVING MAX(salary) > 10000);


-- 3
----. Se debe desarrollar una consulta que muestre los puestos de trabajo cuyos empleados asumieron
--dicho rol en el 2005.

SELECT * FROM HR.jobs WHERE job_id IN 
(SELECT job_id FROM HR.employees WHERE EXTRACT(YEAR FROM hire_date) = 2005);

-- 4
SELECT * FROM HR.employees WHERE employee_id NOT IN(
SELECT j.employee_id FROM HR.job_history j);

SELECT DISTINCT employee_id FROM HR.job_history;
SELECT * FROM HR.employees;

-- 5
--Se debe desarrollar una consulta que muestre el nombre del puesto de trabajo y el sueldo medio
--de aquellos empleados que asumieron dicho rol en el pasado.
SELECT * FROM HR.job_history;

SELECT AVG(e.salary) 
FROM HR.employees e
INNER JOIN HR.jobs j
ON(j.job_id = e.job_id)
GROUP BY e.job_id;

-- 6

SELECT c.country_name , l.city, d.department_id
FROM HR.countries c
INNER JOIN HR.locations l
ON(l.country_id = c.country_id)
INNER JOIN HR.departments d
ON(d.location_id = l.location_id)
WHERE d.department_id IN 
(SELECT e.department_id FROM HR.employees e 
GROUP BY e.department_id
HAVING COUNT(*) > 5) ;



SELECT e.department_id FROM HR.employees e 
GROUP BY e.department_id
HAVING COUNT(*) > 5;


-- 7
SELECT * FROM HR.employees m 
WHERE m.employee_id IN (SELECT e.manager_id
FROM HR.employees e 
GROUP BY e.manager_id
HAVING COUNT(*) > 5); 

SELECT e.manager_id
FROM HR.employees e 
GROUP BY e.manager_id
HAVING COUNT(*) > 5;

-- 8

SELECT * FROM HR.departments
WHERE department_id IN (SELECT e.department_id FROM HR.employees e
GROUP BY e.department_id
HAVING SUM(e.salary) > 10000);

SELECT e.department_id FROM HR.employees e
GROUP BY e.department_id
HAVING SUM(e.salary) > 10000;

--9
SELECT *
FROM HR.employees
WHERE employee_id IN
          (SELECT employee_id
           from HR.job_history
           WHERE job_id LIKE 'IT%');

-- 10
SELECT * FROM HR.employees e WHERE e.salary IN 
(SELECT MAX(salary) FROM HR.employees GROUP BY department_id);
SELECT MAX(salary) FROM HR.employees GROUP BY department_id;


-- 11
SELECT * FROM HR.countries
WHERE country_id IN (SELECT country_id FROM HR.locations 
WHERE location_id IN (SELECT location_id FROM HR.departments 
WHERE department_id IN 
(SELECT department_id FROM HR.employees WHERE employee_id = 105)));


-- 12
SELECT MIN(salary) FROM HR.employees
WHERE ROWNUM <= 3
ORDER BY salary DESC;

SELECT SALARY
FROM HR.EMPLOYEES main
WHERE  2 = (SELECT COUNT( DISTINCT SALARY )
FROM HR.EMPLOYEES
WHERE  SALARY > main.SALARY);

-- 13
SELECT department_id, first_name||' ' || last_name FROM HR.employees
WHERE department_id IN (SELECT department_id FROM HR.employees 
WHERE first_name = 'John');

-- 14
SELECT MAX(salary), e.department_id , 
(SELECT department_name FROM HR.departments 
WHERE department_id = e.department_id)
FROM HR.employees e
GROUP BY department_id;


-- 15
SELECT * FROM HR.employees 
WHERE department_id IN (SELECT department_id FROM HR.employees
GROUP BY department_id
HAVING COUNT(*) > 10);


-- 16
-- Se debe desarrollar una consulta que genere la media de salarios y el identificador de ciudades,
-- ordenándola por el identificador de ciudades, a partir de una tabla creada por una subconsulta
-- que selecciona el salario y el identificador de ciudades de la tabla empleados uniéndola mediante
-- NATURAL JOIN con la tabla de departamentos y localidades
SELECT ROUND(AVG(e.salary)), d.department_name , l.city, l.location_id
FROM HR.employees e
INNER JOIN HR.departments d
ON (d.department_id = e.department_id)
INNER JOIN HR.locations l
ON (l.location_id = d.location_id)
GROUP BY d.department_name, l.city, l.location_id;

SELECT AVG(salary) FROM HR.employees;

-- 17
SELECT salary, employee_id, 
salary - (SELECT AVG(salary) FROM HR.employees
WHERE job_id LIKE 'IT%') AS "Media Diff"
FROM HR.employees
WHERE job_id LIKE 'IT%';


-- 18 
-- Se debe desarrollar una consulta que muestre el mayor salario entre los empleados que trabajan
-- en el departamento 30 (DEPARTMENT_ID) y que empleados ganan ese salario.
SELECT employee_id, salary AS "Employee Salary",(SELECT MAX(e.salary) FROM HR.employees e WHERE e.department_id = 30) AS "Max salary"
FROM HR.employees
WHERE department_id = 30 AND salary = (SELECT MAX(e.salary) FROM HR.employees e WHERE e.department_id = 30);


--19 NOT FINISH
-- Se debe desarrollar una consulta que muestre los empleados que son gerentes (MANAGER_ID) y
-- el número de empleados subordinados a cada uno, ordenados de manera descendente por
-- número de subordinado. Se debe excluir a los gerentes que tienen 5 empleados subordinados o
-- menos.
SELECT employee_id
FROM HR.employees
WHERE employee_id IN 
(SELECT manager_id FROM HR.employees
GROUP BY manager_id
HAVING COUNT(*) > 5);

SELECT COUNT(*) FROM HR.employees
GROUP BY manager_id;

SELECT manager_id, COUNT(*)
FROM HR.employees
GROUP BY manager_id
HAVING COUNT(*) > 5
ORDER BY COUNT(*);


-- 20
SELECT employee_id, last_name, salary , department_id
FROM HR.employees
WHERE department_id IN 
(SELECT department_id FROM HR.departments 
WHERE location_id IN 
(SELECT location_id FROM HR.locations WHERE state_province != 'Texas')) 
AND department_id NOT IN (SELECT department_id FROM HR.departments
WHERE department_name != 'Finance')
ORDER BY employee_id ASC;


SELECT AVG(salary), department_id
FROM HR.employees
GROUP BY department_id;








