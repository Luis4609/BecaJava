
-- Tutorial 5
-- 1
SELECT first_name, last_name,
TO_CHAR(hire_date, 'fmDay, "the" Ddth "of" Month, Yyyysp.') AS STAR_DATE
FROM HR.employees
WHERE TO_CHAR(hire_date,'fmDay') = 'Sábado';

-- 2
SELECT first_name, last_name , NVL2(NULLIF(LENGTH(last_name), LENGTH(first_name)),'Different Length', 'Same') AS Name
FROM HR.employees
WHERE department_id = 100;

-- 3
SELECT DECODE(state_province, 'Washington', 'Headquarters', 'Texas', 'Oil Wells', 'California', city, 'New Jersey', street_address) AS Location,
state_province, city, street_address, country_id
FROM HR.locations
WHERE country_id = 'US';

