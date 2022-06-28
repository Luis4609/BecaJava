
-- Tutorial 8
--1
SELECT SYSDATE AS Today, 
(SELECT COUNT(*) FROM HR.departments) Dept_count,
(SELECT COUNT(*) FROM HR.employees) Emp_count
FROM dual;

-- 2
SELECT last_name
FROM HR.employees
WHERE employee_id IN
(SELECT manager_id
FROM HR.employees);

SELECT max(salary),country_id
FROM (SELECT salary, country_id
FROM HR.employees
NATURAL JOIN HR.departments
NATURAL JOIN HR.locations)
GROUP BY country_id;


SELECT last_name FROM HR.employees
WHERE department_id IN
(SELECT department_id FROM HR.departments
WHERE location_id IN
(SELECT location_id FROM HR.locations
WHERE country_id =
(SELECT country_id FROM HR.countries 
WHERE country_name='United Kingdom'))
);


-- 3
SELECT last_name
FROM HR.employees
WHERE salary >
(SELECT salary FROM HR.employees WHERE last_name='Tobias') 
ORDER BY last_name;

-- 4
SELECT last_name
FROM HR.employees
WHERE department_id =
(SELECT department_id FROM HR.departments
WHERE department_name = '&Department_name');

-- 5
SELECT last_name
FROM HR.employees
WHERE salary > 
(SELECT min(salary)FROM HR.employees WHERE last_name='Taylor')
ORDER BY last_name;

SELECT last_name
FROM HR.employees
WHERE salary > 
ANY (SELECT salary FROM HR.employees WHERE last_name='Taylor')
ORDER BY last_name;