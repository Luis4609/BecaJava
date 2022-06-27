-- LABORATORIO 7
-- 1
SELECT d.department_name, COUNT(e.employee_id) 
FROM HR.employees e 
INNER JOIN HR.departments d
ON (d.department_id = e.department_id)
GROUP BY e.department_id, d.department_name
ORDER BY COUNT(e.employee_id);


-- 2
SELECT j.job_id, e.employee_id FROM HR.employees e 
INNER JOIN HR.job_history j 
ON(j.employee_id = e.employee_id)
INNER JOIN HR.jobs jo
ON (jo.job_id = j.job_id)
WHERE e.department_id = 30;

-- 3
SELECT d.department_name, e.first_name 
FROM HR.departments d
INNER JOIN HR.employees e 
ON(e.employee_id = d.manager_id);


-- 4
SELECT d.department_name, e.first_name, l.city 
FROM HR.departments d
INNER JOIN HR.employees e 
ON(e.employee_id = d.manager_id)
INNER JOIN HR.locations l ON (l.location_id = d.location_id);

-- 5
SELECT d.department_name, l.city , c.country_name
FROM HR.departments d
INNER JOIN HR.locations l ON (l.location_id = d.location_id)
INNER JOIN HR.countries c 
ON(l.country_id = c.country_id);


-- 6
SELECT j.job_title, e.last_name FROM HR.jobs j
INNER JOIN HR.employees e
ON(e.job_id = j.job_id)
WHERE EXTRACT(year FROM e.hire_date) BETWEEN 2000 AND 2005;


-- 7
SELECT j.job_title, AVG(e.salary)
FROM HR.jobs j
INNER JOIN HR.employees e
ON(e.job_id = j.job_id)
GROUP BY e.job_id, j.job_title;


-- 8
SELECT j.job_title, e.last_name, 
(j.max_salary - e.salary) AS Difference, e.salary
FROM HR.jobs j
INNER JOIN HR.employees e
ON(e.job_id = j.job_id);


-- 9
SELECT j.job_title, e.last_name
FROM HR.jobs j
INNER JOIN HR.employees e
ON(e.job_id = j.job_id)
WHERE e.department_id = 30 AND e.commission_pct IS NULL;

-- 10
SELECT j.job_title, e.last_name
FROM HR.jobs j
INNER JOIN HR.employees e
ON(e.job_id = j.job_id)
WHERE e.salary > 15000;

-- 11
SELECT d.department_name, e.first_name, e.salary FROM HR.departments d
INNER JOIN HR.employees e
ON(e.employee_id = d.manager_id)
WHERE CURRENT_DATE - e.hire_date > 5;

-- 12
SELECT e.first_name FROM HR.employees e
INNER JOIN HR.employees m
ON (e.manager_id = m.employee_id)
WHERE e.hire_date < m.hire_date;

-- 13 
SELECT e.first_name, e.job_id FROM HR.employees e 
INNER JOIN HR.job_history j
ON(e.job_id = j.job_id )
WHERE MONTHS_BETWEEN(j.start_date, j.end_date) < 13;

-- 14
SELECT e.first_name, c.country_name FROM HR.employees e
INNER JOIN HR.departments d
ON(d.department_id = e.department_id)
INNER JOIN HR.locations l
ON(d.location_id = l.location_id)
INNER JOIN HR.countries c
ON(c.country_id = l.country_id);

-- 15
SELECT d.department_name, AVG(e.salary), COUNT(e.employee_id)
FROM HR.departments d
INNER JOIN HR.employees e
ON(e.department_id = d.department_id)
WHERE e.commission_pct IS NOT NULL
GROUP BY d.department_name;

-- 16
SELECT e.first_name, e.job_id, j.start_date, j.end_date 
FROM HR.employees e
INNER JOIN HR.job_history j
ON(j.employee_id = e.employee_id)
WHERE e.commission_pct IS NULL;


-- 17
SELECT e.first_name, m.first_name AS Manager 
FROM HR.employees e
INNER JOIN HR.employees m
ON(m.employee_id = e.manager_id);

-- 18
SELECT d.department_id, COUNT(e.employee_id) FROM HR.employees e
RIGHT OUTER JOIN HR.departments d
ON(d.department_id = e.department_id)
GROUP BY d.department_id
ORDER BY d.department_id;

--19
SELECT d.department_id, COUNT(e.employee_id) 
FROM HR.departments d
LEFT OUTER JOIN HR.employees e
ON(d.department_id = e.department_id)
GROUP BY d.department_id
ORDER BY d.department_id;

-- 20
SELECT e.first_name, e.last_name, j.job_id, j.job_title FROM HR.employees e
INNER JOIN HR.jobs j
ON(j.job_id = e.job_id)
WHERE e.salary > 2 * (j.min_salary);


--21
SELECT e.department_id, d.department_name, e.last_name FROM HR.departments d
FULL OUTER JOIN HR.employees e
ON(e.department_id = d.department_id)
ORDER BY d.department_id, e.last_name;

-- 22
SELECT e.employee_id, e.last_name || ' ,' || e.first_name,
INITCAP(e.email) || '@eisi.ues.edu.sv', 
e.phone_number
FROM HR.employees e
ORDER BY e.employee_id;


