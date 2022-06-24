-- Tutorial 7
--1
SELECT e.employee_id, jh.job_id, e.department_id, 
e.last_name, e.hire_date, jh.end_date 
FROM HR.job_history jh
JOIN HR.employees e ON(jh.job_id = e.job_id);

-- 2 Get all the manager in every department
SELECT e.first_name || ' ' || e.last_name ||
' is manager of the ' || d.department_id ||
' department. ' "Manager"
FROM HR.employees e
JOIN HR.departments d ON(e.employee_id = d.manager_id)
ORDER BY d.department_id;