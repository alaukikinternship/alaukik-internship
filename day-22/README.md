# Day 22 — SQL CRUD Operations & Queries 🗄️

## 📌 Overview

Day 22 focuses on performing CRUD operations and writing SQL queries using MySQL. The objective was to understand how to create database records, insert data, retrieve information, update existing records, and delete unnecessary records.

Continuing with the `employee_db` database created on Day 21, I performed practical SQL operations on three tables: `employee`, `departments`, and `roles`.

Along with CRUD operations, I practiced filtering, sorting, grouping, and analyzing records using different SQL clauses.

---

## 📚 Topics Covered

### 1. SQL CRUD Operations

CRUD represents the four basic operations used to manage database records.

- **CREATE:** Creates new database objects such as tables.
- **INSERT:** Adds new records into a table.
- **SELECT:** Retrieves records from database tables.
- **UPDATE:** Modifies existing records.
- **DELETE:** Removes specific records from tables.

### 2. WHERE Clause

Used to retrieve records that satisfy specific conditions.

Practiced:
- Comparison operators (`=`, `!=`, `>`, `<`, `>=`, `<=`).
- Logical operators (`AND`, `OR`).
- `BETWEEN` for range-based filtering.
- `IN` for matching multiple values.
- `LIKE` for pattern matching.

### 3. ORDER BY Clause

Used to arrange records in a specific order.

- `ASC` — Ascending order.
- `DESC` — Descending order.

### 4. GROUP BY Clause

Used to group records having common values and perform calculations using aggregate functions.

### 5. HAVING Clause

Used to filter grouped records based on aggregate conditions.

### 6. Aggregate Functions

- `COUNT()` — Counts records.
- `SUM()` — Calculates the total.
- `AVG()` — Calculates the average.
- `MAX()` — Finds the maximum value.
- `MIN()` — Finds the minimum value.

---

## 🛠️ Technologies & Tools

- **Database:** MySQL
- **Database Client:** MySQL Workbench
- **Query Language:** SQL
- **Database Name:** employee_db

---

## 💻 Practical Implementation

### 1. Database Selection

Selected the existing employee database.

```sql
USE employee_db;
```

### 2. Employee Table

Created an employee table to store employee information, including name, email, designation, and salary.

```sql
CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(20) NOT NULL,
    employee_email VARCHAR(100) NOT NULL,
    employee_designation VARCHAR(20) NOT NULL,
    employee_salary INT
);
```

### 3. Departments Table

Created a departments table to maintain department names and their locations.

```sql
CREATE TABLE departments (
    dept_id INT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(100) NOT NULL UNIQUE,
    location VARCHAR(100)
);
```

Inserted department records:

```sql
INSERT INTO departments (dept_name, location)
VALUES
('Computer Science', 'Indore'),
('Human Resources', 'Pune'),
('Finance', 'Mumbai'),
('Marketing', 'Delhi'),
('IT', 'Bangalore');
```

### 4. Roles Table

Created a roles table to maintain available job positions and their descriptions.

```sql
CREATE TABLE roles (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(30) NOT NULL,
    description VARCHAR(255)
);
```

Inserted role records:

```sql
INSERT INTO roles (role_name, description)
VALUES
('Java Developer', 'Backend development using Java'),
('Frontend Developer', 'UI development using HTML CSS JS'),
('Full Stack Developer', 'Frontend and backend development'),
('Software Tester', 'Software testing and quality assurance'),
('Database Admin', 'Database management'),
('Project Manager', 'Project planning and management'),
('DevOps Engineer', 'Deployment and automation');
```

### 5. INSERT Operation

Inserted multiple employee records into the employee table.

```sql
INSERT INTO employee
(employee_name, employee_email, employee_designation, employee_salary)
VALUES
('Rahul', 'rahul@gmail.com', 'Developer', 35000),
('Aman', 'aman@gmail.com', 'Tester', 30000),
('Mohammad', 'mohammad@gmail.com', 'Java Dev', 50000),
('Sufiyan', 'sufiyan@gmail.com', 'Designer', 40000),
('Umer', 'umer@gmail.com', 'Developer', 45000),
('Rohit', 'rohit@gmail.com', 'Manager', 60000),
('Arman', 'arman@gmail.com', 'Tester', 28000);
```

### 6. SELECT Operation

Retrieved all employee records and selected specific columns.

```sql
SELECT * FROM employee;

SELECT employee_name, employee_salary
FROM employee;

SELECT DISTINCT employee_designation
FROM employee;
```

### 7. UPDATE Operation

Modified employee details and salary.

```sql
UPDATE employee
SET employee_salary = 55000
WHERE employee_id = 1;
```

Updated employee designation:

```sql
UPDATE employee
SET employee_designation = 'Java Dev'
WHERE employee_id = 3;
```

### 8. DELETE Operation

Removed specific employee records.

```sql
DELETE FROM employee
WHERE employee_id = 7;
```

### 9. WHERE Clause

Filtered employee records based on salary and designation.

```sql
SELECT * FROM employee
WHERE employee_salary > 40000;

SELECT * FROM employee
WHERE employee_salary BETWEEN 30000 AND 50000;

SELECT * FROM employee
WHERE employee_name LIKE 'M%';

SELECT * FROM employee
WHERE employee_designation = 'Developer';
```

### 10. ORDER BY Clause

Sorted employee records according to salary.

```sql
SELECT * FROM employee
ORDER BY employee_salary DESC;

SELECT * FROM employee
ORDER BY employee_name ASC;

SELECT * FROM employee
ORDER BY employee_salary DESC
LIMIT 3;
```

### 11. GROUP BY Clause

Calculated designation-wise employee counts and average salaries.

```sql
SELECT
    employee_designation,
    COUNT(*) AS total_employees
FROM employee
GROUP BY employee_designation;
```

Average salary by designation:

```sql
SELECT
    employee_designation,
    AVG(employee_salary) AS average_salary
FROM employee
GROUP BY employee_designation;
```

### 12. HAVING Clause

Filtered grouped employee records based on aggregate conditions.

```sql
SELECT
    employee_designation,
    COUNT(*) AS total_employees
FROM employee
GROUP BY employee_designation
HAVING COUNT(*) > 1;
```

### 13. Foreign Key Relationships

Extended the employee table by adding department and role references.

```sql
ALTER TABLE employee
ADD dept_id INT,
ADD role_id INT;
```

Added foreign key constraints:

```sql
ALTER TABLE employee
ADD CONSTRAINT fk_employee_department
FOREIGN KEY (dept_id)
REFERENCES departments(dept_id);

ALTER TABLE employee
ADD CONSTRAINT fk_employee_role
FOREIGN KEY (role_id)
REFERENCES roles(role_id);
```

These relationships connect employee records with their respective departments and roles.

---

## 🎯 Learning Outcomes

After completing Day 22, I gained practical experience in:

- Performing Create, Read, Update, and Delete operations.
- Creating and managing multiple MySQL tables.
- Inserting single and multiple records.
- Retrieving specific records using SELECT.
- Modifying and deleting database records.
- Filtering data using WHERE conditions.
- Sorting records using ORDER BY.
- Grouping records using GROUP BY.
- Filtering grouped results using HAVING.
- Performing calculations using aggregate functions.
- Establishing relationships using foreign keys.

---

## 🚀 Conclusion

Day 22 provided hands-on experience with SQL CRUD operations and database queries using MySQL. Working with employee, departments, and roles tables improved my understanding of data manipulation, filtering, sorting, grouping, and relational database management.

These concepts will be useful in upcoming Java JDBC, Spring JDBC, Hibernate, and Spring Boot JPA implementations.

**Technologies:** MySQL | SQL | MySQL Workbench

**#Java #SQL #MySQL #CRUD #DatabaseManagement #RDBMS #JavaFullStack #45DaysInternship**