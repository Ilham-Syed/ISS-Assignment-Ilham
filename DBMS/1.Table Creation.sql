CREATE DATABASE CompanyDB;

USE CompanyDB;

CREATE TABLE Employees (
    EmpID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Age INT,
    Department VARCHAR(50),
    Salary DECIMAL(10, 2),
    JoiningDate DATE,
    Email VARCHAR(100) UNIQUE,
    IsActive BOOLEAN DEFAULT TRUE
);

