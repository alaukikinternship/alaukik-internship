# Day 21 — SQL Fundamentals & MySQL Database Management 🗄️

## 📌 Overview

Day 21 focuses on understanding the fundamentals of SQL and relational database management using MySQL. The objective was to learn how databases store and organize information, how tables are connected through relationships, and how constraints maintain data consistency.

As part of the practical implementation, I configured MySQL and developed an **Employee Management Database** named `employee_db`, consisting of three related tables: `employees`, `departments`, and `roles`.

---

## 📚 Topics Covered

### 1. Database Fundamentals
- **Database:** An organized collection of data used for efficient storage and retrieval.
- **DBMS:** Software that manages databases and provides operations to insert, retrieve, update, and delete data.
- **RDBMS:** A database management system that organizes information into related tables.
- **Tables:** Structures consisting of rows and columns used to store related records.

### 2. Keys and Constraints
- **Primary Key:** Uniquely identifies each record in a table.
- **Foreign Key:** Establishes relationships between different tables.
- **NOT NULL:** Prevents inserting NULL values.
- **UNIQUE:** Prevents duplicate values.
- **CHECK:** Ensures that values satisfy a specified condition.
- **DEFAULT:** Assigns a default value when no value is provided.
- **AUTO_INCREMENT:** Automatically generates sequential numeric identifiers.

### 3. Database Normalization
Learned how normalization reduces redundant data and improves database consistency.

- **1NF:** Ensures atomic values in each column.
- **2NF:** Eliminates partial dependencies.
- **3NF:** Eliminates transitive dependencies.
- **BCNF:** Ensures every determinant is a candidate key.

---

## 🛠️ Technologies & Tools

- **Database:** MySQL
- **Database Client:** MySQL Workbench
- **Language:** SQL
- **Port:** 3306

---

## 💻 Practical Implementation

### 1. Database Creation

Created a database named `employee_db` to manage employee-related information.

```sql
CREATE DATABASE employee_db;

USE employee_db;
```

### 2. Database Tables

Implemented three relational tables.

**A. Departments Table**

Stores department information such as department name and location.

```sql
CREATE TABLE departments (
    dept_id INT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(100) NOT NULL UNIQUE,
    location VARCHAR(100)
);
```

**B. Roles Table**

Stores available job roles and their descriptions.

```sql
CREATE TABLE roles (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255)
);
```

**C. Employees Table**

Stores employee details and connects employees with their respective departments and roles.

```sql
CREATE TABLE employees (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    salary DECIMAL(10,2) CHECK (salary > 0),
    hire_date DATE,
    dept_id INT,
    role_id INT,

    FOREIGN KEY (dept_id)
    REFERENCES departments(dept_id),

    FOREIGN KEY (role_id)
    REFERENCES roles(role_id)
);
```

### 3. Sample Data Insertion

Inserted sample department records:

```sql
INSERT INTO departments (dept_name, location)
VALUES
('IT', 'Indore'),
('HR', 'Pune'),
('Finance', 'Mumbai');
```

Inserted different job roles:

```sql
INSERT INTO roles (role_name, description)
VALUES
('Java Developer', 'Backend Development'),
('Frontend Developer', 'UI Development'),
('Full Stack Developer', 'Frontend and Backend'),
('HR Manager', 'Employee Management'),
('Database Administrator', 'Database Management');
```

Inserted employee records:

```sql
INSERT INTO employees
(emp_name, email, salary, hire_date, dept_id, role_id)
VALUES
('Rahul', 'rahul@gmail.com', 35000, '2026-01-10', 1, 1),
('Aman', 'aman@gmail.com', 40000, '2026-02-15', 2, 4),
('Ali', 'ali@gmail.com', 45000, '2026-03-20', 3, 5);
```

### 4. Retrieving Records

Used SELECT statements to retrieve information from database tables.

```sql
SELECT * FROM employees;

SELECT * FROM departments;

SELECT * FROM roles;
```

### 5. Joining Related Tables

Used INNER JOIN to retrieve employee details along with their department and role information.

```sql
SELECT
    e.emp_id,
    e.emp_name,
    e.email,
    e.salary,
    d.dept_name,
    r.role_name
FROM employees e
INNER JOIN departments d
    ON e.dept_id = d.dept_id
INNER JOIN roles r
    ON e.role_id = r.role_id;
```

---

## 🔗 Database Relationships

The database follows these relationships:

- **Departments → Employees:** One-to-Many (1:N)
- **Roles → Employees:** One-to-Many (1:N)

Each employee belongs to one department and has one assigned role, while a department or role can be associated with multiple employees.

---

## 🎯 Learning Outcomes

After completing Day 21, I gained practical knowledge of:

- Understanding the difference between DBMS and RDBMS.
- Creating and managing databases using MySQL.
- Designing relational tables with appropriate data types.
- Implementing Primary Keys and Foreign Keys.
- Applying SQL constraints to maintain data integrity.
- Understanding database normalization.
- Inserting and retrieving records using SQL queries.
- Establishing relationships between tables using JOIN operations.

---

## 🚀 Conclusion

Day 21 provided a practical introduction to relational database management using MySQL. Building the Employee Management Database helped me understand how real-world applications organize information into multiple related tables.

These concepts will serve as a foundation for upcoming Java JDBC connectivity, Spring JDBC