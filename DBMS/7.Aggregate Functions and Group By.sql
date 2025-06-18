SELECT Department, COUNT(*) AS TotalEmployees, AVG(Salary) AS AvgSalary
FROM Employees
GROUP BY Department
HAVING COUNT(*) > 1;
