SELECT * FROM Manager;  -- Show all columns Manager in table

-- ###############################################################################

--1_ create table Manger contain : id, name , age , birth_date , address
CREATE TABLE Manager (
	id NUMBER PRIMARY KEY,
	name VARCHAR2(100),
	age NUMBER,
	birth_date DATE,
	address VARCHAR2(255)
);

-- ###############################################################################

--2_ alter table manger drop address column
ALTER TABLE Manager DROP COLUMN address;

-- ###############################################################################

--3_ alter table manger add column (city_address, street)
ALTER TABLE Manager ADD (city_address VARCHAR2(100), street VARCHAR2(100));

-- ###############################################################################

--4_ modify column name to full_name
ALTER TABLE Manager RENAME COLUMN name TO full_name;

-- ###############################################################################

--5_ make this table just for read
ALTER TABLE Manager READ ONLY; -- Make table read-only
ALTER TABLE Manager READ WRITE; -- Make table read and write

-- ###############################################################################

--6_ create table same as  Manger with name Owner : just has colum id, name, birth_date 
CREATE TABLE Owner AS 
SELECT id, full_name AS name, birth_date FROM Manager WHERE 1 = 0;
SELECT * FROM Owner;  -- Show all columns in table

-- ###############################################################################

--7_ rename manger table name to Master
RENAME Manager TO Master;
SELECT * FROM Master;  -- Show all columns in Master table

-- ###############################################################################

--8_ drop all tables
DROP TABLE Master;  -- Delete Master table completely
DROP TABLE Owner;   -- Delete Owner table completely

-- ###############################################################################
