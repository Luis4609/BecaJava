-- Lab 4
-- 1
SELECT first_name, salary, ROUND(salary, -3) FROM HR.employees;

-- 2
SELECT first_name, salary 
FROM HR.employees 
ORDER BY salary 
FETCH FIRST 1 ROWS ONLY;

SELECT first_name, salary 
FROM HR.employees 
WHERE ROWNUM = 1;

-- 3
SELECT INITCAP(first_name), INITCAP(last_name) FROM HR.employees;

-- 4
SELECT SUBSTR(job_title,0,3) AS TITLE FROM HR.jobs;

-- 5
SELECT LENGTH(first_name) FROM HR.employees WHERE last_name LIKE '%%%b%';

-- 6
SELECT UPPER(first_name), LOWER(email) 
FROM HR.employees
WHERE UPPER(last_name) = SUBSTR(email, 2, 20);

-- 7
SELECT first_name, last_name, hire_date,
ROUND((to_date(CURRENT_DATE) - to_date(hr.employees.hire_date))/ 30)
FROM HR.employees
ORDER BY hire_date ASC;

-- 8
SELECT first_name || ' ' || last_name, department_id AS Department 
FROM HR.employees
WHERE SUBSTR(phone_number, 1, 3) = '515' AND LENGTH( SUBSTR(phone_number, 5, 13)) = 8;



