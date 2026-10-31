--create Employees table wiith column ( EmployeeID, FirstName, LastName, Department, Salary )
CREATE TABLE Employees (
	EmployeeID NUMBER PRIMARY KEY, 
	FirstName VARCHAR2(100), 
	LastName VARCHAR2(100), 
	Department VARCHAR2(100), 
	Salary NUMBER 
);

--Insert a new record into the Employees table.
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (101, 'John1', 'Doe1', 'HR', 20000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (102, 'John2', 'Doe2', 'IT', 50000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (103, 'John3', 'Doe3', 'CS', 40000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (104, 'John4', 'Doe4', 'IT', 10000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (105, 'John5', 'Doe5', 'ZX', 30000);
COMMIT;


--Update the salary of an employee to 600000 with EmployeeID 101.
UPDATE Employees SET salary = 600000 WHERE EmployeeID = 101;
COMMIT;

--Delete a record of an employee who Department = 101.
DELETE FROM Employees WHERE EmployeeID = 101;
COMMIT;

--Retrieve all employees in the IT department.
SELECT * FROM Employees WHERE Department = 'IT';

--select * data from table but conatination  FirstName, LastName as one column
SELECT EmployeeID,  
       Department, 
       Salary, 
       FirstName || ' ' || LastName AS FullName 
FROM Employees;