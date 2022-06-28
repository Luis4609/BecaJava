--1
SELECT * FROM HR.jobs ORDER BY job_title ASC;

--2
SELECT * FROM HR.employees WHERE hire_date > '01-ENE-2018';

--  3 Se debe desarrollar una consulta que muestre de los empleados con ID 150 o 160.
SELECT * FROM HR.employees WHERE employee_id = 150 OR employee_id = 160;
-- 4
SELECT first_name, salary, commission_pct, hire_date FROM HR.employees WHERE salary < 10000;

-- 5
SELECT job_title, (max_salary - min_salary) AS Salary_Dif FROM HR.jobs WHERE max_salary < 20000 AND min_salary > 10000;

--6
SELECT * FROM HR.employees WHERE first_name LIKE 'S%' OR last_name LIKE 'S%';

--7
SELECT * FROM HR.employees WHERE commission_pct IS NULL AND salary IN (5000, 10000) AND department_id = 30;

--8
SELECT first_name, department_id, hire_date FROM HR.employees ORDER BY department_id, hire_date;

-- 9
SELECT employee_id || first_name || last_name AS Empleado, manager_id AS Jefe FROM HR.employees;

SELECT e.first_name AS Name_Empleado, m.first_name AS Jefe
FROM HR.employees e
INNER JOIN HR.employees  m 
ON (m.employee_id = e.manager_id);

-- 10

SELECT job_id, salary FROM HR.employees WHERE manager_id IN (100, 125) AND salary > 6000;

-- 11

SELECT location_id, city  FROM HR.locations WHERE country_id != 'US';

SELECT * FROM HR.departments WHERE location_id BETWEEN 1400 and 1700;
 
-- 12
SELECT region_id, region_name  FROM HR.regions;

-- 13

SELECT hr.countries.region_id || hr.regions.region_name as Region, hr.locations.location_id, hr.locations.city as City, hr.countries.country_name || hr.countries.country_id as Country FROM HR.regions, HR.locations, HR.countries
WHERE hr.locations.location_id >  2400;

-- 14

SELECT hr.countries.region_id AS Region, 
hr.regions.region_name AS "Nombre Region",
'Codigo de Pais' || hr.countries.country_name || ' Nombre: ' || hr.countries.country_id,
hr.locations.location_id AS Localizacion,
hr.locations.street_address AS Direccion,
hr.locations.postal_code AS "Codigo Postal"
FROM HR.regions, HR.countries, HR.locations
WHERE hr.locations.postal_code IS NOT NULL;

-- 15

SELECT hr.regions.region_name AS Region, hr.countries.country_name, hr.locations.state_province, hr.locations.location_id  FROM HR.regions, HR.countries, HR.locations;



-- 16
SELECT hr.countries.country_name AS Country, 
hr.employees.first_name || ' ' || hr.employees.last_name AS Employee
FROM HR.countries, HR.employees
WHERE hr.countries.country_name LIKE 'C%';

-- 17
SELECT hr.jobs.job_title AS Job,
hr.employees.first_name || ' ' || hr.employees.last_name AS Employee 
FROM HR.jobs, HR.employees
WHERE hr.employees.email = 'NKOCHHAR' AND hr.employees.hire_date = '21-SEP-05';

-- 18
SELECT hr.employees.first_name || ' ' || hr.employees.last_name AS Employee
FROM HR.departments, HR.employees, dual
WHERE HR.employees.department_id IN (10, 20, 80) AND ( to_date(CURRENT_DATE) - to_date(hr.employees.hire_date)) < 180;
      
    
-- 19  
    
    SELECT  hr.employees.employee_id|| ',' || hr.employees.first_name || ',' || hr.employees.last_name AS "Nombre Completo",
    hr.employees.salary AS Salario, 
    hr.employees.department_id AS "Codigo de Departamento",
    hr.departments.department_name AS "Descripcion"
    FROM HR.employees, HR.departments
    WHERE  hr.employees.department_id = hr.departments.department_id AND hr.departments.department_name LIKE 'IT'
    ORDER BY hr.employees.salary DESC;


-- 20
SELECT hr.employees.employee_id || ' ' || hr.employees.first_name || ' ' || hr.employees.last_name as Employee,
hr.employees.salary AS Salary, hr.departments.department_name, hr.departments.location_id
FROM HR.employees, HR.departments
WHERE hr.employees.department_id IN (100, 80, 50) AND hr.departments.location_id = 1500 AND hr.employees.salary BETWEEN 4000 AND 8000;


-- 21
SELECT hr.employees.employee_id, hr.employees.first_name || ' ' || hr.employees.last_name AS Employee, hr.employees.salary, hr.departments.department_name,
hr.countries.country_name, hr.locations.state_province, hr.departments.department_id, hr.departments.department_name
FROM HR.employees, HR.regions, HR.countries, HR.departments, HR.locations
WHERE hr.locations.state_province != 'Texas' AND hr.departments.department_name != 'Finance'
ORDER BY hr.employees.employee_id ASC ;



