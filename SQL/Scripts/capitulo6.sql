-- Tutorial 6
-- 1
SELECT ROUND(AVG(LENGTH(country_name)))AS Average FROM HR.countries;

-- 2
SELECT to_char(end_date, 'YYYY') "Quitting Year", 
job_id, 
COUNT(*) "Number of Employee"
FROM HR.job_history
GROUP BY to_char(end_date, 'YYYY'), job_id 
ORDER BY COUNT(*) DESC;

-- 3
SELECT to_char(hire_date, 'YYYY'), COUNT(*)
FROM HR.employees
GROUP BY to_char(hire_date, 'YYYY')
HAVING COUNT(*) >= 18;

-- 4
SELECT COUNT(*), SUM(list_price), product_status 
FROM product_information
WHERE UPPER(product_status) != 'ORDERABLE'
GROUP BY product_status;