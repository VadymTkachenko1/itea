--Restricting and Sorting Data
--Таблиця Employees. Отримати список з інформацією про всіх співробітників
SELECT * FROM employees;

--Таблиця Employees. Отримати список всіх співробітників у яких довжина імені більше 4 букв
SELECT * FROM employees WHERE first_name LIKE '%_____%';

--Using Conversion Functions and Conditional Expressions
--Таблиця Employees. Отримати список всіх співробітників які прийшли на роботу в 2008ом році
SELECT * FROM employees WHERE TO_CHAR (hire_date, 'YYYY') = '2008';

--Таблиця Employees. Отримати список всіх співробітників які прийшли на роботу в перший день місяця (будь-якого)
SELECT * FROM employees WHERE TO_CHAR (hire_date, 'DD') = '01';

--Reporting Aggregated Data Using the Group Functions
--Таблиця Employees. Отримати максимальну зарплату серед всіх середніх зарплат по департаменту
SELECT MAX (AVG (salary)) FROM employees GROUP BY department_id;

--Таблиця Employees. Отримати максимальну зарплату з усіх співробітників job_id которих закінчується на слово 'CLERK'
SELECT MAX(salary) FROM employees WHERE job_id LIKE '%CLERK';

--Displaying Data from Multiple Tables Using Joins
--Таблиця Employees, Departments, Locations, Countries, Regions. Отримати список співробітників які живуть в Europe (region_name)
SELECT first_name FROM employees e
JOIN departments d ON (e.department_id = d.department_id)
JOIN locations l ON (d.location_id = l.location_id)
JOIN countries c ON (l.country_id = c.country_id)
JOIN regions r ON (c.region_id = r.region_id)
WHERE region_name = 'Europe';

--Таблиця Employees, Departments. Показати всі департаменти в яких працюють більше 30ти співробітників
SELECT department_name, COUNT (*) FROM employees e
JOIN departments d ON (e.department_id = d.department_id)
GROUP BY department_name HAVING COUNT (*) > 30;

--Using SubQueries to Solve Queries
--Таблиця Employees. Отримати список співробітників з зарплатою більшою середньої зарплати всіх співробітників.
SELECT * FROM employees WHERE salary > (SELECT AVG (salary) FROM employees);

--Таблиця Employees, Departments. Показати всі департаменти в яких немає жодного співробітника
SELECT * FROM departments WHERE department_id NOT IN
(SELECT department_id FROM employees WHERE department_id IS NOT NULL);