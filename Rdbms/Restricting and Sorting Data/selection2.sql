SELECT last_name,salary
from employees
WHERE salary > 12000;
  
  
SELECT last_name,department_id
FRO employees
WHERE employees_id=176;


SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;



SELECT last_name, job_id, hire_date
FROM employees
WHERE last_name IN ('Matos', 'Taylor')
ORDER BY hire_date ASC;


SELECT last_name, department_id
FROM employees
WHERE department_id IN (20, 50)
ORDER BY last_name;



SELECT last_name AS Employee,
       salary AS "Monthly Salary"
FROM employees
WHERE salary BETWEEN 5000 AND 12000
AND department_id IN (20, 50);



SELECT last_name, hire_date
FROM employees
WHERE EXTRACT(YEAR FROM hire_date) = 1994;


SELECT last_name, job_id
FROM employees
WHERE manager_id IS NULL;


SELECT last_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY 2 DESC, 3 DESC;



ACCEPT salary_value NUMBER PROMPT 'Enter Salary: '

SELECT last_name, salary
FROM employees
WHERE salary > &salary_value;




ACCEPT manager_id NUMBER PROMPT 'Enter Manager ID: '
ACCEPT sorted_by CHAR PROMPT 'Enter Sort Column: '

SELECT employee_id, last_name, salary, department_id
FROM employees
WHERE manager_id = &manager_id
ORDER BY &sorted_by;




SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';




SELECT last_name
FROM employees
WHERE last_name LIKE '%a%'
AND last_name LIKE '%e%';


SELECT last_name, job_id, salary
FROM employees
WHERE job_id IN ('SA_REP', 'ST_CLERK')
AND salary NOT IN (2500, 3500, 7000);






