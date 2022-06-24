-- Laboratorio 6
-- 1
SELECT e.manager_id, COUNT(e.employee_id) AS "Employes under "
FROM HR.employees e
GROUP BY e.manager_id;

-- 2

SELECT employee_id, max(end_date) FROM HR.job_history 
GROUP BY employee_id;

-- 3
SELECT COUNT(*) FROM HR.employees
WHERE EXTRACT(day FROM hire_date) > 15;

-- 4
SELECT country_id, COUNT(*) 
FROM HR.locations
GROUP BY country_id;

-- 5
SELECT job_id, COUNT(*), SUM(salary)AS Sum_Salary , MAX(salary) - MIN(salary)AS DiferenceSalary
FROM HR.employees
GROUP BY job_id;

-- 6
SELECT COUNT(*)
FROM HR.employees
WHERE EXTRACT(YEAR FROM hire_date) = 2008
GROUP BY EXTRACT(MONTH FROM hire_date) ;


-- Empleador de un manager
SELECT manager_id, COUNT(*) AS "Empleados under"
FROM HR.employees
GROUP BY manager_id
HAVING COUNT(*) > 1;
-- 7
SELECT employee_id,COUNT(*)
FROM HR.job_history
GROUP BY employee_id
HAVING COUNT(*)>1;

-- 8 NOT FINISH
SELECT * FROM HR.employees, dual
WHERE  SYSDATE  - EXTRACT(DAY FROM hire_date) > 100;

-- YTD = @DATEDIFF ('DD', '2011-01-01', @DATENOW ())

-- 9
SELECT manager_id, COUNT(*) AS "Empleados under", department_id 
FROM HR.employees
GROUP BY manager_id, department_id
HAVING COUNT(*) > 5;

-- 10
SELECT DISTINCT first_name FROM HR.employees;

-- 11
SELECT COUNT(country_id), region_id 
FROM HR.countries 
GROUP BY region_id
ORDER BY COUNT(country_id) DESC;

-- 12
SELECT job_id, COUNT(*) FROM HR.employees
GROUP BY job_id
ORDER BY COUNT(*) DESC;

-- 13
SELECT department_id, COUNT(*) FROM HR.employees
GROUP BY department_id
ORDER BY department_id;

-- 14
SELECT COUNT(*) FROM HR.departments
GROUP BY location_id;

-- 15
SELECT department_id, SUM(salary)
FROM HR.employees 
GROUP BY department_id
ORDER BY department_id;

-- 16
SELECT EXTRACT(year FROM hire_date), 
MIN(salary), MAX(salary), ROUND(AVG(salary))
FROM HR.employees
GROUP BY EXTRACT(year FROM hire_date)
ORDER BY EXTRACT(year FROM hire_date);


-- 17 NOT FINISH
SELECT SUM(salary), MIN(salary)
FROM HR.employees
GROUP BY department_id
ORDER BY department_id;


-- 18
SELECT COUNT(*) FROM HR.employees 
WHERE commission_pct IS NOT NULL
GROUP BY department_id
HAVING COUNT(*) > 5;


-- 19
SELECT department_id AS "Codigo de Depar", job_id, 
COUNT(*) AS "Number of employees"
FROM HR.employees
WHERE department_id IN (50, 80)
GROUP BY department_id, job_id
ORDER BY department_id;

-- 20
SELECT department_id AS "Codigo de Depar", job_id, 
COUNT(*) AS "Number of employees"
FROM HR.employees
GROUP BY department_id, job_id
HAVING COUNT(*) = 1
ORDER BY department_id;

-- 21

SELECT * FROM HR.departments;

SELECT * FROM HR.employees;

-- 22
SELECT COUNT(*)
FROM HR.employees 
GROUP BY department_id
HAVING COUNT(*) > 10;

-- 23
SELECT EXTRACT(YEAR FROM hire_date), COUNT(*)
FROM HR.employees 
GROUP BY EXTRACT(YEAR FROM hire_date)
HAVING COUNT(*) > 10;
