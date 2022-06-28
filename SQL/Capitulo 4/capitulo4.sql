-- Tutorial 1
SELECT first_name || ' ' || last_name 
FROM HR.employees
WHERE LOWER (first_name) LIKE '%li%';

-- Tutorial 2
SELECT first_name || ' ' || last_name AS Employee, 
SUBSTR(first_name, 1, 1) || ' ' || SUBSTR(last_name, 1, 14) AS Formal_Name
FROM HR.employees
WHERE LENGTH (first_name) + LENGTH(last_name) > 15; 

-- Tutorial 3

SELECT employee_id, last_name, hire_date, MONTHS_BETWEEN ('01-ENE-2012',hire_date) AS Month_Worked
FROM HR.employees
WHERE MONTHS_BETWEEN ('01-ENE-2012', HIRE_DATE) > 100;