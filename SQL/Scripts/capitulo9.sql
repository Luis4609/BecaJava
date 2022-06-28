SELECT region_name FROM HR.regions
MINUS
SELECT region_name FROM HR.regions;

SELECT department_id, COUNT(1) 
FROM HR.employees
WHERE department_id IN (20,30,40)
GROUP BY department_id;

SELECT 20, COUNT(1)
FROM HR.employees
WHERE department_id = 20
UNION ALL
SELECT 30,count(1)
FROM HR.employees
WHERE department_id=30
UNION ALL
SELECT 40,count(1)
FROM HR.employees
WHERE department_id=40;


SELECT department_id dept, NULL mgr, sum(salary)
FROM HR.employees
GROUP BY department_id
UNION 
SELECT NULL, manager_id, sum(salary)
FROM HR.employees
GROUP BY manager_id
UNION 
SELECT NULL, NULL, sum(salary)
FROM HR.employees;

--Para identificar a todos los empleados que no han cambiado de trabajo; se consulta la tabla
--EMPLOYEES y se quitan todos aquello que tienen algún registro en JOB_HISTORY
SELECT employee_id, last_name
FROM HR.employees
MINUS
SELECT employee_id,last_name
FROM HR.job_history
JOIN HR.employees USING (employee_id);


SELECT last_name,job_title
FROM HR.employees
JOIN HR.jobs USING (job_id)
INTERSECT
SELECT last_name,job_title
FROM HR.job_history h
JOIN HR.jobs j ON (h.job_id=j.job_id)
JOIN HR.employees e ON (h.employee_id=e.employee_id);