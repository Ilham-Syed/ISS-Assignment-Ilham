DELIMITER //

CREATE PROCEDURE GetHighPaidEmployees(
    IN dept VARCHAR(50),
    IN min_salary DECIMAL(10,2)
)
BEGIN
    SELECT * 
    FROM Employees
    WHERE Department = dept AND Salary > min_salary;
END //

DELIMITER ;


CALL GetHighPaidEmployees('IT', 70000);
