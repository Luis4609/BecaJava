-- Laboratorio 6

--  Se debe desarrollar una consulta que muestre el ID del jefe de proyecto y el número de 
-- empleados gestionados por él.
-- 1
SELECT e.manager_id, COUNT(e.employee_id) AS "Employes under "
FROM HR.employees e
GROUP BY e.manager_id;

-- 2
--  Se debe desarrollar una consulta que muestre el ID del empleado y la fecha cuando terminó su 
-- trabajo anterior
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

-- 8
-- Se debe desarrollar una consulta que muestre el ID de los puestos de trabajo que han sido 
-- ocupados por dos o más empleados por más de 100 días.
SELECT job_id FROM HR.job_history
WHERE end_date - start_date > 100
GROUP BY job_id
HAVING COUNT(*) >= 2


-- 9
-- Se debe desarrollar una consulta que muestre los departamentos donde algún gestor de proyecto
-- tiene a su cargo más de 5 empleados
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
ORDER BY SUM(salary) DESC;

-- 16
SELECT EXTRACT(year FROM hire_date), 
MIN(salary), MAX(salary), ROUND(AVG(salary))
FROM HR.employees
GROUP BY EXTRACT(year FROM hire_date)
ORDER BY EXTRACT(year FROM hire_date);


-- 17 NOT FINISH
-- Se debe desarrollar una consulta que muestre el salario medio total, el salario mínimo y el 
-- número máximo de empleados de entre todos los departamentos.
SELECT COUNT(employee_id), MIN(salary), AVG(salary)
FROM HR.employees 
--WHERE ROWNUM <= 1
GROUP BY department_id
ORDER BY COUNT(employee_id) DESC;

SELECT COUNT(employee_id), MIN(salary), AVG(salary)
FROM HR.employees 
GROUP BY department_id
HAVING COUNT(*) = (SELECT MAX(COUNT(*)) FROM HR.employees GROUP BY department_id);

SELECT *
FROM ( SELECT (COUNT(employee_id)), MIN(salary), AVG(salary)
FROM HR.employees 
GROUP BY department_id
ORDER BY COUNT(employee_id) DESC)
WHERE ROWNUM = 1;


-- 18
SELECT COUNT(*) FROM HR.employees 
WHERE commission_pct IS NOT NULL
GROUP BY department_id
HAVING COUNT(*) > 5;

SELECT department_id, COUNT(*) FROM HR.employees 
WHERE commission_pct IS NOT NULL AND salary > 10000
GROUP BY department_id
HAVING COUNT(*) > 5;

SELECT department_id, COUNT(*) FROM HR.employees 
WHERE commission_pct IS NOT NULL AND commission_pct > 0.25
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
--  Se debe realizar una consulta que liste el número de empleados por ciudad, que ganan como 
-- mínimo 5000 en concepto de salario. Omita las ciudades que tengan menos de 3 empleados con 
-- ese salario.
SELECT department_id, COUNT(*) FROM HR.employees
WHERE salary > 5000
GROUP BY department_id
HAVING COUNT(*) >= 3
ORDER BY department_id;

-- 22
-- Se debe elaborar una consulta que muestre el código del departamento con título “Código del 
-- departamento”, que cuente los empleados por departamento de aquellos departamentos que 
-- tengan más de 10 empleados.
SELECT department_id, COUNT(*)
FROM HR.employees 
GROUP BY department_id
HAVING COUNT(*) > 10;

-- 23
SELECT EXTRACT(YEAR FROM hire_date), COUNT(*)
FROM HR.employees 
GROUP BY EXTRACT(YEAR FROM hire_date)
HAVING COUNT(*) > 10;
