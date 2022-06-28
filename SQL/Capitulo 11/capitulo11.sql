SELECT object_type,
    COUNT(*)
FROM SYS.dba_objects
GROUP BY object_type;
-- Tutorial 11
SELECT object_type,
    COUNT(*)
FROM user_objects
GROUP BY object_type;
SELECT object_type,
    count(*)
FROM all_objects
GROUP BY object_type;
SELECT DISTINCT owner
FROM all_objects
ORDER BY owner;
-- 2
SELECT table_name,
    cluster_name,
    iot_type
FROM user_tables;
DESCRIBE region;
SELECT column_name,
    data_type,
    nullable
FROM user_tab_columns
WHERE table_name = 'REGION';
-- 3 Investigar los tipos de datos en el esquema HR
CREATE TABLE Countries AS
SELECT *
FROM SERGIOL.countries;
COMMIT;
--  vista de diccionario de datos para mostrar qué columnas componen la
-- tabla EMPLOYEES, como lo haría el comando DESCRIBE:
SELECT column_name,
    data_type,
    nullable,
    data_length,
    data_precision,
    data_scale
FROM user_tab_columns
WHERE table_name = 'EMPLOYEES';
-- 4
CREATE TABLE EMPS (
    EMPNO NUMBER,
    ENAME VARCHAR2(25),
    SALARY NUMBER,
    DEPTNO NUMBER(4, 0)
);
INSERT INTO emps
SELECT employee_id,
    last_name,
    salary,
    department_id
FROM HR.employees;
COMMIT;
-- se crea la nueva columna mediante la interfaz grafica
-- y se modifica
ALTER TABLE emps
MODIFY (hired DEFAULT sysdate);
INSERT INTO emps (empno, ename)
VALUES (99, 'Newman');
SELECT hired,
    count(1)
FROM emps
GROUP BY hired;
-- DROP TABLE emps;
-- 5
CREATE TABLE emp AS
SELECT employee_id empno,
    last_name ename,
    department_id deptno
FROM employees;
CREATE TABLE dept AS
SELECT department_id deptno,
    department_name dname
FROM departments;
ALTER TABLE emp
ADD CONSTRAINT emp_pk PRIMARY KEY (empno);
ALTER TABLE dept
ADD CONSTRAINT dept_pk PRIMARY KEY (deptno);
ALTER TABLE emp
ADD CONSTRAINT dept_fk FOREIGN KEY (deptno) REFERENCES dept ON
DELETE
SET NULL;
-- Insert
INSERT INTO dept
VALUES (10, 'New Department');
INSERT INTO emp
VALUES (9999, 'New emp', 99);
TRUNCATE TABLE dept;
-- DROP TABLE emp;
-- DROP TABLE dept;
-- 6
CREATE TABLE subscribers (
    id NUMBER(4, 0) CONSTRAINT sub_id_pk PRIMARY KEY,
    name VARCHAR2(20) CONSTRAINT sub_name_nn NOT NULL
);
CREATE TABLE telephones (
    telno NUMBER(7, 0) CONSTRAINT tel_telno_pk PRIMARY KEY CONSTRAINT tel_telno_ck CHECK (
        telno BETWEEN 2000000 AND 3999999
    ),
    activated DATE DEFAULT sysdate,
    active VARCHAR2(1) CONSTRAINT tel_active_nn NOT NULL CONSTRAINT tel_active_ck CHECK(
        active = 'Y'
        OR active = 'N'
    ),
    subscriber NUMBER(4, 0) CONSTRAINT tel_sub_fk REFERENCES subscribers,
    CONSTRAINT tel_active_yn CHECK(
        (
            active = 'Y'
            AND subscriber IS NOT NULL
        )
        OR (
            active = 'N'
            AND subscriber IS NULL
        )
    )
);
CREATE TABLE calls (
    telno NUMBER (7, 0) CONSTRAINT calls_telno_fk REFERENCES telephones,
    starttime DATE CONSTRAINT calls_start_nn NOT NULL,
    endtime DATE CONSTRAINT calls_end_nn NOT NULL,
    CONSTRAINT calls_pk PRIMARY KEY(telno, starttime),
    CONSTRAINT calls_endtime_ck CHECK (endtime >= starttime)
);