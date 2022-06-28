SELECT * FROM HR.regions;

INSERT INTO HR.regions
VALUES (101, 'Great Britain');

INSERT INTO HR.regions
VALUES (&Region_number, &Region_name);

INSERT INTO HR.regions
VALUES ((SELECT max(region_id)+1 FROM regions),'Oceania');

-- 2
UPDATE HR.regions
SET region_name='Scandinavia'
WHERE region_id=101;

UPDATE HR.regions
SET region_name='Iberia'
WHERE region_id > 100;

UPDATE HR.regions
SET region_id=
(region_id +
(SELECT max(region_id)
FROM HR.regions))
WHERE HR.region_id IN
(SELECT region_id
FROM HR.regions
WHERE region_id > 100);

-- COMMIT;

-- 3 Delete
DELETE 
FROM HR.regions
WHERE region_id=204;

DELETE FROM HR.regions
WHERE region_id IN
          (SELECT region_id
           FROM HR.regions
           WHERE region_name='Iberia');
           
-- 5
INSERT INTO customers
(customer_id,cust_first_name,cust_last_name)
VALUES (
          (SELECT max(customer_id)+1
          FROM customers),
          'John','Watson');
          
-- Intentar modificar uno de estos registros bloqueados desde otra sesión:
UPDATE OE.customers
SET credit_limit=0
WHERE cust_last_name='Ramklass';

SELECT * FROM OE.customers;

DELETE FROM OE.customers
WHERE customer_id = 149;

-- Truncate: Use the TRUNCATE statement to remove all rows from a table or cluster.
-- https://docs.oracle.com/cd/B19306_01/server.102/b14200/statements_10006.htm
TRUNCATE TABLE customers;


SELECT max(customer_id)
FROM OE.customers;

CREATE TABLE LUIS.region AS SELECT * FROM HR.regions;