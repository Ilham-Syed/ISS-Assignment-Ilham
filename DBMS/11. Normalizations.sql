-- Unnormalized table
CREATE TABLE EmployeeUnnormalized (
    EmpID INT,
    Name VARCHAR(100),
    Department VARCHAR(100),
    Projects VARCHAR(255), -- comma-separated project names
    ManagerName VARCHAR(100)
);

-- Inserting data into unnormalized table
INSERT INTO EmployeeUnnormalized VALUES
(1, 'John Doe', 'IT', 'ProjectA, ProjectB', 'Mike Manager'),
(2, 'Jane Smith', 'Finance', 'ProjectC', 'Sara Boss');

-- 1NF(First Normal Form):Split the projects into separate rows
CREATE TABLE Employee (
    EmpID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(100),
    ManagerName VARCHAR(100)
);

CREATE TABLE EmployeeProjects (
    EmpID INT,
    ProjectName VARCHAR(100),
    FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

-- Inserting Data into 1NF table
INSERT INTO Employee VALUES
(1, 'John Doe', 'IT', 'Mike Manager'),
(2, 'Jane Smith', 'Finance', 'Sara Boss');

INSERT INTO EmployeeProjects VALUES
(1, 'ProjectA'),
(1, 'ProjectB'),
(2, 'ProjectC');


-- 2NF(Second Normal Form):Split out department and manager info into separate tables

CREATE TABLE Department (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(100),
    ManagerName VARCHAR(100)
);

ALTER TABLE Employee
ADD DeptID INT,
DROP COLUMN Department,
DROP COLUMN ManagerName;

ALTER TABLE Employee
ADD FOREIGN KEY (DeptID) REFERENCES Department(DeptID);

-- Inserting data into 2NF Table
INSERT INTO Department VALUES
(1, 'IT', 'Mike Manager'),
(2, 'Finance', 'Sara Boss');

UPDATE Employee SET DeptID = 1 WHERE EmpID = 1;
UPDATE Employee SET DeptID = 2 WHERE EmpID = 2;

-- 3NF(Third Normal Form):normalizing Manager further into its own table.

CREATE TABLE Manager (
    ManagerID INT PRIMARY KEY,
    ManagerName VARCHAR(100)
);

ALTER TABLE Department
ADD ManagerID INT,
DROP COLUMN ManagerName;

ALTER TABLE Department
ADD FOREIGN KEY (ManagerID) REFERENCES Manager(ManagerID);

-- Sample data
INSERT INTO Manager VALUES
(1, 'Mike Manager'),
(2, 'Sara Boss');

UPDATE Department SET ManagerID = 1 WHERE DeptID = 1;
UPDATE Department SET ManagerID = 2 WHERE DeptID = 2;


