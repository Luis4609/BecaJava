-- Tutorial 7
--1
SELECT e.employee_id, jh.job_id, e.department_id, 
e.last_name, e.hire_date, jh.end_date 
FROM HR.job_history jh
JOIN HR.employees e ON(jh.job_id = e.job_id);

-- 2 Get all the manager in every department
SELECT e.first_name || ' ' || e.last_name ||
' is manager of the ' || d.department_id ||
' department. ' "Manager"
FROM HR.employees e
JOIN HR.departments d ON(e.employee_id = d.manager_id)
ORDER BY d.department_id;

-- 3
SELECT e.last_name, e.employee_id, 
e.manager_id, e.last_name AS Manager, e.department_id
FROM HR.employees e 
JOIN HR.employees m 
ON(m.employee_id = e.employee_id)
WHERE e.department_id IN (10, 20, 30);


-- 4
SELECT d.department_name, d.department_id 
FROM HR.departments d 
LEFT OUTER JOIN HR.employees e
ON(e.department_id = d.department_id)
WHERE e.department_id IS NULL;

-- 5
SELECT COUNT(*) 
FROM HR.employees
CROSS JOIN HR.departments;


-- 6
SELECT oe.customers.cust_first_name, oe.customers.cust_last_name, oe.product_information.product_name, oe.product_information.list_price
FROM OE.customers 
JOIN OE.orders USING(customer_id)
JOIN OE.order_items  USING(order_id)
JOIN OE.product_information USING(product_id)
WHERE list_price > 1000 ;