CREATE VIEW IT_Employees AS
SELECT * FROM Employees WHERE Department = 'IT';

CREATE INDEX idx_department ON Employees(Department);

