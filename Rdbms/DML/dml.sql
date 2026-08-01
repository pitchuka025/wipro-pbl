1)

CREATE TABLE MY_EMPLOYEE AS
SELECT employee_id,
       first_name,
       last_name,
       department_id,
       salary
FROM employees
WHERE 1 = 2;

2)

DESC MY_EMPLOYEE;

3)

INSERT INTO MY_EMPLOYEE
VALUES (201, 'Michael', 'Hartstein', 20, 13000);

4)

INSERT INTO MY_EMPLOYEE
VALUES (202, 'Pat', 'Fay', 20, NULL);


SELECT * FROM MY_EMPLOYEE;

5)

INSERT INTO MY_EMPLOYEE
(employee_id, first_name, last_name, department_id)
VALUES
(203, 'Susan', 'Mavris', 40);


SELECT * FROM MY_EMPLOYEE;

6)

INSERT INTO MY_EMPLOYEE
VALUES (205, 'Shelley', 'Higgins', 110, 12000);

INSERT INTO MY_EMPLOYEE
VALUES (100, 'Steven', 'King', 90, 24000);

INSERT INTO MY_EMPLOYEE
VALUES (102, 'Lex De', 'Haan', 90, 17000);

INSERT INTO MY_EMPLOYEE
VALUES (204, 'Hermann', 'Baer', 70, 10000);

SELECT * FROM MY_EMPLOYEE;

7)


UPDATE MY_EMPLOYEE
SET salary = salary * 1.10
WHERE department_id = 90;

SELECT * FROM MY_EMPLOYEE
WHERE department_id = 90;


8)

UPDATE MY_EMPLOYEE
SET last_name = 'Higgins'
WHERE employee_id = 202;


SELECT * FROM MY_EMPLOYEE
WHERE employee_id = 202;

9)

DELETE FROM MY_EMPLOYEE
WHERE LOWER(first_name) LIKE '%man%'
   OR LOWER(last_name) LIKE '%man%';
   
   DELETE FROM MY_EMPLOYEE
WHERE LOWER(first_name) LIKE '%man%'
   OR LOWER(last_name) LIKE '%man%';
   
   COMMIT;