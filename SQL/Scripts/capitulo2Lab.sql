-- Se deben obtener las caracter�sticas de la tabla empleados

SELECT * FROM HR.employees;

-- Se debe desarrollar una consulta que liste los distintos pa�ses, junto a su c�digo de pa�s y la
-- regi�n a la que pertenecen.

SELECT * FROM HR.countries;

-- Se debe desarrollar una consulta que muestre los distintos IDs de los managers de los
-- empleados

SELECT manager_id FROM HR.employees ;

-- Se debe desarrollar una consulta que muestre el nombre completo (en un �nico registro) y la
-- fecha de contrataci�n de todos los empleados.

SELECT first_name||' '||last_name AS Full_Name, hire_date FROM HR.employees;

-- Se debe desarrollar una consulta que muestre el identificador de departamentos aumentado un
-- 50%. Tambi�n se debe mostrar por pantalla el identificador del empleado. Por �ltimo, se deber�
-- mostrar tambi�n el total de d�as trabajados y el salario por d�a trabajado, suponiendo que el
-- salario es 100 veces el anterior valor calculado para el identificador de departamentos. 

SELECT department_id * 1.5 AS Department, manager_id FROM HR.departments;

SELECT employee_id FROM HR.employees;

SELECT (end_date - start_date)* 100 AS Salary FROM HR.job_history;