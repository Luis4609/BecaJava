-- Se deben obtener las características de la tabla empleados

SELECT * FROM HR.employees;

-- Se debe desarrollar una consulta que liste los distintos países, junto a su código de país y la
-- región a la que pertenecen.

SELECT * FROM HR.countries;

-- Se debe desarrollar una consulta que muestre los distintos IDs de los managers de los
-- empleados

SELECT manager_id FROM HR.employees ;

-- Se debe desarrollar una consulta que muestre el nombre completo (en un único registro) y la
-- fecha de contratación de todos los empleados.

SELECT first_name||' '||last_name AS Full_Name, hire_date FROM HR.employees;

-- Se debe desarrollar una consulta que muestre el identificador de departamentos aumentado un
-- 50%. También se debe mostrar por pantalla el identificador del empleado. Por último, se deberá
-- mostrar también el total de días trabajados y el salario por día trabajado, suponiendo que el
-- salario es 100 veces el anterior valor calculado para el identificador de departamentos. 

SELECT department_id * 1.5 AS Department, manager_id FROM HR.departments;

SELECT employee_id FROM HR.employees;

SELECT (end_date - start_date)* 100 AS Salary FROM HR.job_history;