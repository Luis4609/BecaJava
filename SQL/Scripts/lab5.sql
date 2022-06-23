
-- Lab 5
--1 . C05E01 EJERCICIO 1 Se debe desarrollar una consulta que muestre el nombre y la fecha de
-- contratación de aquellos empleados que entraron en la empresa entre 2002 y 2005.

SELECT first_name, hire_date 
FROM HR.employees 
WHERE  EXTRACT(year from hire_date) = 2002 
OR EXTRACT(year from hire_date) = 2003  
OR EXTRACT(year from hire_date) = 2004 
OR EXTRACT(year from hire_date) = 2005;

SELECT first_name, hire_date 
FROM HR.employees 
WHERE EXTRACT(YEAR FROM
hire_date) BETWEEN  2002 AND 2005;
     
-- 2
SELECT * FROM HR.employees WHERE EXTRACT(month FROM hire_date) = '05';

-- 3
-- . Se debe desarrollar una consulta que muestre el nombre de los empleados que se unieron a la
-- empresa en 2001.

SELECT first_name FROM HR.employees WHERE EXTRACT(year FROM hire_date) = 2001;

-- 4 
SELECT COUNT(*) FROM HR.employees WHERE EXTRACT(year from hire_date) = 2005;


-- 5
SELECT SYSDATE - to_date('27-02-95') AS DiasDiff  FROM dual;

-- 6
SELECT city, postal_code, postal_code + 100 AS "Codigo Postal Nuevo" FROM HR.locations WHERE country_id = 'US';


-- 7
SELECT first_name, last_name,
DECODE(job_id, 'IT_PROG', "Profile IT", "Profile Non-IT") AS Profile 
FROM HR.employees WHERE job_id = 'IT_PROG';


-- 8
-- Se debe desarrollar una consulta que muestre el ID del departamento, año y número de
-- empleados que se unieron a dicho departamento.
SELECT DISTINCT department_id, EXTRACT(year FROM hire_date), 
COUNT(employee_id) OVER (PARTITION BY department_id ORDER BY department_id)
FROM HR.employees
ORDER BY department_id;

SELECT * FROM HR.employees ORDER BY department_id;
    
-- 9
SELECT manager_id, last_name, salary,
   SUM(salary) OVER (PARTITION BY manager_id ORDER BY salary
   RANGE UNBOUNDED PRECEDING) SUM_SALARY
   FROM HR.employees;