-- Creating Departments table
CREATE TABLE Departments (
    DeptName VARCHAR(50) PRIMARY KEY,
    Manager VARCHAR(100)
);

INSERT INTO Departments VALUES
('HR', 'Anna Clark'),
('IT', 'Robert King'),
('Finance', 'Emily Stone');

-- Inner Join
SELECT e.FirstName, e.Department, d.Manager
FROM Employees e
INNER JOIN Departments d ON e.Department = d.DeptName;

-- Left Join
SELECT e.FirstName, e.Department, d.Manager
FROM Employees e
LEFT JOIN Departments d ON e.Department = d.DeptName;

-- Right Join
SELECT e.FirstName, e.Department, d.Manager
FROM Employees e
RIGHT JOIN Departments d ON e.Department = d.DeptName;

-- Full Join (not supported in MySQL directly; use UNION)
SELECT e.FirstName, e.Department, d.Manager
FROM Employees e
LEFT JOIN Departments d ON e.Department = d.DeptName
UNION
SELECT e.FirstName, e.Department, d.Manager
FROM Employees e
RIGHT JOIN Departments d ON e.Department = d.DeptName;
