-- Laboratorio 9
--1
SELECT employee_id, salary FROM HR.employees
UNION
SELECT employee_id, NULL FROM HR.job_history;

-- 2
SELECT department_id ,hire_date, NULL FROM HR.employees
UNION ALL
SELECT department_id, NULL, location_id FROM HR.departments;

-- 3
SELECT hr.employees.employee_id AS ID FROM HR.employees
UNION ALL
SELECT hr.departments.department_id FROM HR.departments;

-- 4
SELECT employee_id, hr.employees.job_id FROM HR.employees
INTERSECT
SELECT employee_id, hr.job_history.job_id FROM HR.job_history;

SELECT employee_id, hr.job_history.job_id FROM HR.job_history
INTERSECT
SELECT employee_id, hr.employees.job_id FROM HR.employees;


--5
SELECT employee_id, hr.employees.job_id FROM HR.employees
MINUS
SELECT employee_id, hr.job_history.job_id FROM HR.job_history;

--6
SELECT employee_id, job_id FROM HR.employees
UNION 
SELECT hr.job_history.employee_id, hr.job_history.job_id FROM HR.job_history;

