--create table Doctor contain id, name , salary , address
CREATE TABLE Doctor (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    salary NUMBER,
    address VARCHAR2(255)
);

--please insert 10 row with Data as you like 
INSERT INTO Doctor (id, name, salary, address) VALUES (1, 'Ahmed Ali', 1000, 'Cairo');
INSERT INTO Doctor (id, name, salary, address) VALUES (2, 'Mohamed Hassan', 2000, 'Giza');
INSERT INTO Doctor (id, name, salary, address) VALUES (3, 'Mahmoud Ibrahim', 3000, 'Alexandria');
INSERT INTO Doctor (id, name, salary, address) VALUES (4, 'Fatma Omar', 4000, 'Tanta');
INSERT INTO Doctor (id, name, salary, address) VALUES (5, 'Aya Khaled', 5000, 'Mansoura');
INSERT INTO Doctor (id, name, salary, address) VALUES (6, 'Youssef Ahmed', 6000, 'Aswan');
INSERT INTO Doctor (id, name, salary, address) VALUES (7, 'Mona Said', 7000, 'Luxor');
INSERT INTO Doctor (id, name, salary, address) VALUES (8, 'Khaled Nabil', 8000, 'Ismailia');
INSERT INTO Doctor (id, name, salary, address) VALUES (9, 'Sara Adel', 9000, 'Suez');
INSERT INTO Doctor (id, name, salary, address) VALUES (10, 'Omar Gamal', 10000, 'Cairo');
COMMIT;

--update record number 3 with salary 20000
UPDATE Doctor SET salary = 20000 WHERE id = 3;
COMMIT;

--delete record number 9
DELETE FROM Doctor WHERE id = 9;
COMMIT;

--please Concatenation all name with salary  of all rows
SELECT name || ' - Salary: ' || salary AS doctor_details FROM Doctor;

--display all record with salary * 2
SELECT id, name, salary, salary * 2 AS double_salary FROM Doctor;

-- select all data with salary  1000 , 2000 , 3000 
SELECT * FROM Doctor WHERE salary IN (1000, 2000, 3000);

--rename table Doctor to PRD_DOCTOR
RENAME Doctor TO PRD_DOCTOR;