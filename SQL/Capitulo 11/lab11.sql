-- Laboratorio 11
--1
-- Se deben escribir dos sentencias SQL para crear una copia duplicada de la tabla countries,
-- incluyendo la estructura y los datos de la tabla, con nombre dup_countries y otra copia duplicada,
-- llamada employees_v1, de la tabla employees también con su estructura y datos.
CREATE TABLE dup_countries AS
SELECT *
FROM HR.countries;
CREATE TABLE employees_v1 AS
SELECT *
FROM HR.employees;
-- 2
-- Se debe escribir una sentencia SQL para crear una tabla llamada countries_v2 que incluya las
-- columnas country_id, country_name y region_id . Country_id UNIQUE
CREATE TABLE countries_v2 AS
SELECT country_id,
    country_name,
    region_id
FROM HR.countries;
-- TODO: Check country_id UNIQUE, Primary Key
-- 3
--Se debe escribir una sentencia SQL para crear una tabla llamada employees_v2 que incluya las
--columnas employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
--commission, manager_id y department_id.
CREATE TABLE employees_v2 AS
SELECT employee_id,
    first_name,
    last_name,
    email,
    phone_number,
    hire_date,
    job_id,
    commission_pct,
    manager_id,
    department_id
FROM HR.employees;
-- TODO : Se debe comprobar que la columna employee_id no
-- contiene ningún valor duplicado en el momento de la inserción
-- ALTER TABLE SAMP.DEPARTMENT
-- ADD CONSTRAINT NEW_UNIQUE UNIQUE (DEPTNO);
ALTER TABLE employees_v2
ADD CONSTRAINT pk_employee_id UNIQUE;
-- TODO: la columna department_id,
-- que actúa como clave foránea, referencia de la columna department_id de la tabla departments,
-- pueda únicamente contener aquellos valores que existan en dicha tabla
--ALTER TABLE CITIES ADD CONSTRAINT COUNTRY_FK
-- Foreign Key (COUNTRY) REFERENCES COUNTRIES (COUNTRY);
ALTER TABLE employees_v2
ADD CONSTRAINT fk_department_id FOREIGN KEY (DEPARTMENT) REFERENCES department(department_id);
-- TODO: De la misma manera, la
--columna job_id, también actuará como clave foránea, referenciando a la columna job_id de la
--tabla jobs, que solamente podrá contener los valores que existen en dicha tabla
ALTER TABLE employees_v2
ADD CONSTRAINT fk_job_id FOREIGN KEY (jobs) REFERENCES jobs(job_id);
-- 4
-- Se debe escribir una sentencia SQL para actualizar la columna email de la tabla employees_v1
-- con el valor 'not available' para todos los empleados.
UPDATE employees_v1
SET email = 'not available';
-- 5
--Se debe escribir una sentencia SQL para actualizar las columnas email y commission_pct de la
--tabla employees_v1 con los valores 'NA' y 0.10, respectivamente, para todos los empleadosUPDATE employees
UPDATE employees_v1
SET email = 'NA',
    commision_pct = 0.10;
-- 6
UPDATE employees_v1
SET job_id = 'SH_CLERK'
WHERE employee_id = 118
    AND department_id = 30
    AND job_id NOT LIKE 'SH%';
-- 7
UPDATE HR.employees
SET salary = (
        CASE
            WHEN department_id = 40 THEN salary = salary * 1.25
            WHEN department_id = 90 THEN salary = salary * 1.15
            WHEN department_id = 110 THEN salary = salary * 1.10
        END
    );
SELECT salary * 1.25
FROM HR.employees
WHERE department_id = 40;
SELECT salary * 1.15
FROM HR.employees
WHERE department_id = 90;
SELECT salary * 1.10
FROM HR.employees
WHERE department_id = 110;
-- 8
-- Se debe escribir una sentencia SQL para renombrar la tabla countries_v2 a countries_new
RENAME TABLE countries_v2 TO countries_new;
-- 9
CREATE TABLE locations_v2 AS
SELECT *
FROM HR.locations;
ALTER TABLE locations_v2
ADD main_id NUMBER;
ALTER TABLE locations_v2
MODIFY (main_id VARCHAR2);
-- 10
CREATE TABLE job_history_v2 AS
SELECT *
FROM HR.job_history;
ALTER TABLE job_history_v2
ADD FOREIGN KEY fk_job_id REFERENCES job_history(job_id);
ALTER TABLE job_history_v2
ADD FOREIGN KEY fk_department_id REFERENCES departments(department_id);
-- 11
--Se debe escribir una sentencia SQL para eliminar la clave foránea existente fk_job_id de la tabla
--job_history_v2 en la columna job_id que está referenciando a job_id en la tabla de jobs, así
--mismo también se deberá borrar la clave foránea fk_department_idALTER TABLE job_history_v2 
ALTER TABLE job_history_v2 DROP FOREIGN KEY fk_job_id;