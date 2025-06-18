SELECT * FROM Employees;

SELECT DISTINCT Department FROM Employees;

SELECT * FROM Employees WHERE Department = 'IT';

SELECT * FROM Employees WHERE Age > 30 AND Salary > 60000;

SELECT * FROM Employees ORDER BY Salary DESC;

SELECT * FROM Employees LIMIT 2;

SELECT * FROM Employees WHERE FirstName LIKE 'J%';

SELECT * FROM Employees WHERE Age IN (28, 45);

SELECT * FROM Employees WHERE Salary BETWEEN 60000 AND 80000;

SELECT FirstName AS Name, Department AS Dept FROM Employees;