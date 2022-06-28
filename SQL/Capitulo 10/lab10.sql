-- Laboratori0 10
SELECT *
FROM SERGIOL.employees;
UPDATE SERGIOL.employees
SET salary = 8000
WHERE employee_id = 115;
COMMIT;
-- 3
DELETE FROM SERGIOL.employees
WHERE employee_id = 115;
--4 
SELECT *
FROM SERGIOL.employees
WHERE employee_id = 110
    AND department_id = 10
    AND job_id NOT LIKE 'IT%';
UPDATE SERGIOL.employees
SET job_id = 'IT PROG'
WHERE employee_id = 110
    AND department_id = 10
    AND job_id NOT LIKE 'IT%';
ROLLBACK;
-- 5
SELECT *
FROM SERGIOL.employees
ORDER BY manager_id;
SELECT *
FROM SERGIOL.departments;
SELECT *
FROM SERGIOL.locations;
-- ID de manager = 120, ID local, ciudad = Tokio
INSERT INTO SERGIOL.departments
VALUES (
        280,
        'Departamento Nuevo',
        120,
        (
            SELECT location_id
            FROM SERGIOL.locations
            WHERE city = 'Tokyo'
        )
    );
--6
UPDATE SERGIOL.departments
SET manager_id = (
        SELECT employee_id
        FROM employees
        WHERE salary = (
                SELECT MAX(salary) "Maximum"
                FROM employees
                WHERE employee_id IN (
                        SELECT employee_id
                        FROM employees
                        WHERE employee_id IN (
                                SELECT DISTINCT manager_id
                                FROM employees
                            )
                    )
            )
    )
WHERE department_id = 280;
--7
SELECT *
FROM SERGIOL.employees;
UPDATE SERGIOL.employees
SET salary = (
        SELECT AVG(salary)
        FROM SERGIOL.employees
    )
WHERE salary = (
        SELECT MIN(salary)
        FROM SERGIOL.employees
    );