-- Create Database
CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

-- Create Employee Table
CREATE TABLE IF NOT EXISTS emp (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    designation VARCHAR(100) NOT NULL
);

-- Insert sample data (optional)
INSERT INTO emp (id, name, designation) VALUES
(1, 'John Doe', 'Software Engineer'),
(2, 'Jane Smith', 'Project Manager'),
(3, 'Bob Johnson', 'QA Tester');
