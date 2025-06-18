-- Union
SELECT FirstName FROM Employees WHERE Department = 'IT'
UNION
SELECT FirstName FROM Employees WHERE Age < 30;

-- Subquery in Insert
INSERT INTO Employees (FirstName, LastName, Age, Department, Salary, JoiningDate, Email)
SELECT 'Temp', 'Worker', 25, Department, 40000, CURDATE(), 'temp.worker@example.com'
FROM Departments WHERE DeptName = 'HR';
