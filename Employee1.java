import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double salary;

    void getData(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Salary: " + salary);
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            emp[i] = new Employee();
            emp[i].getData(sc);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchemp = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].eno == searchemp) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        
    }
}








Here are Questions 1–30 with Answers (SQL statements) clearly written for your lab record.


---

1) Create table regions.

CREATE TABLE regions (
    region_id INT PRIMARY KEY,
    region_name VARCHAR(50)
);


---

2) Create table countries.

CREATE TABLE countries (
    country_id CHAR(2) PRIMARY KEY,
    country_name VARCHAR(50),
    region_id INT,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
);


---

3) Create table locations.

CREATE TABLE locations (
    location_id INT PRIMARY KEY,
    street_address VARCHAR(100),
    postal_code VARCHAR(20),
    city VARCHAR(50),
    state_province VARCHAR(50),
    country_id CHAR(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);


---

4) Create table departments.

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    location_id INT,
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);


---

5) Create table employees.

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    hire_date DATE,
    job_id VARCHAR(10),
    salary DECIMAL(10,2),
    manager_id INT,
    department_id INT,
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    FOREIGN KEY (manager_id) REFERENCES employees(employee_id),
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);


---

6) Create table dependents.

CREATE TABLE dependents (
    dependent_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    relationship VARCHAR(50),
    employee_id INT,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);


---

7) Create table jobs.

CREATE TABLE jobs (
    job_id VARCHAR(10) PRIMARY KEY,
    job_title VARCHAR(50),
    min_salary DECIMAL(10,2),
    max_salary DECIMAL(10,2)
);


---

8) Insert records into regions.

INSERT INTO regions VALUES
(1,'Europe'),
(2,'Americas'),
(3,'Asia'),
(4,'Middle East and Africa');


---

9) Insert records into countries.

INSERT INTO countries VALUES
('IT','Italy',1),
('US','United States',2),
('JP','Japan',3),
('IN','India',3),
('ZA','South Africa',4);


---

10) Insert records into locations.

INSERT INTO locations VALUES
(1000,'Via Roma 100','00100','Rome','Lazio','IT'),
(1700,'2000 Broadway','94111','San Francisco','California','US'),
(1800,'Nishi Shinjuku 3-2','160-0023','Tokyo','Tokyo','JP'),
(1900,'Block B, ITPL','560066','Bangalore','Karnataka','IN'),
(2000,'1 Mandela Way','8001','Cape Town','Western Cape','ZA'),
(2100,'123 Connaught Place','110001','Delhi','Delhi','IN');


---

11) Insert records into departments.

INSERT INTO departments VALUES
(10,'Administration',1000),
(20,'Marketing',1700),
(30,'Sales',1700),
(40,'Finance',1800),
(50,'IT',1900);


---

12) Insert records into employees.

INSERT INTO employees VALUES
(101,'John','Doe','jdoe@example.com','1234567890','2020-01-15','J01',12000,NULL,10),
(102,'Jane','Smith','jsmith@example.com','9876543210','2019-03-10','J02',8000,101,20),
(103,'Alice','Johnson','ajohnson@example.com','5556667777','2018-11-25','J03',15000,101,30),
(104,'Robert','Taylor','rtaylor@example.com','8889990000','2021-07-01','J04',11000,102,40),
(105,'Linda','Williams','lwilliams@example.com','4445556666','2022-05-12','J05',9500,103,50),
(106,'Mark','Brown','mbrown@example.com','9998887777','2024-01-10','J05',11000,105,50),
(109,'Zara','Ali','zali@example.com','3334445555','2024-02-01','J01',9000,NULL,10),
(110,'Ravi','Sharma','rsharma@example.com','9998887777','2024-03-15','J01',8500,NULL,20),
(111,'Smith','David','dsmith@example.com','8887776666','2024-04-01','J03',NULL,NULL,40);


---

13) Insert records into dependents.

INSERT INTO dependents VALUES
(1,'Anna','Doe','Daughter',101),
(2,'Michael','Smith','Son',102),
(3,'Emily','Johnson','Spouse',103),
(4,'Sophia','Taylor','Daughter',104),
(5,'James','Williams','Son',105);


---

14) Insert records into jobs.

INSERT INTO jobs VALUES
('J01','Administrator',10000,15000),
('J02','Marketing Specialist',7000,12000),
('J03','Sales Manager',12000,18000),
('J04','Finance Analyst',10000,14000),
('J05','IT Specialist',9000,13000);


---

15–30 Queries

(Already provided correctly earlier — repeating cleanly)

15)

SELECT * FROM regions;
SELECT * FROM countries;
SELECT * FROM locations;
SELECT * FROM departments;
SELECT * FROM jobs;
SELECT * FROM employees;
SELECT * FROM dependents;

16)

SELECT e.*
FROM employees e
JOIN departments d ON e.department_id=d.department_id
WHERE d.location_id=1700;

17)

SELECT e.*
FROM employees e
JOIN departments d ON e.department_id=d.department_id
WHERE d.location_id<>1700;

18)

SELECT * FROM employees
WHERE salary=(SELECT MAX(salary) FROM employees);

19)

SELECT * FROM employees
WHERE salary>(SELECT AVG(salary) FROM employees);

20)

SELECT department_id,department_name
FROM departments
WHERE department_id IN
(SELECT department_id FROM employees WHERE salary>10000);

21)

SELECT department_id,department_name
FROM departments
WHERE department_id NOT IN
(SELECT department_id FROM employees WHERE salary>10000);

22)

SELECT * FROM employees
WHERE salary>ALL
(SELECT MIN(salary) FROM employees GROUP BY department_id);

23)

SELECT * FROM employees
WHERE salary>=ALL
(SELECT MAX(salary) FROM employees GROUP BY department_id);

24)

SELECT AVG(avg_salary)
FROM (SELECT AVG(salary) avg_salary
      FROM employees
      GROUP BY department_id) dept_avg;

25)

SELECT employee_id,salary,
(SELECT AVG(salary) FROM employees) avg_salary,
salary-(SELECT AVG(salary) FROM employees) difference
FROM employees;

26)

SELECT e.*
FROM employees e
WHERE salary>
(SELECT AVG(salary)
 FROM employees
 WHERE department_id=e.department_id);

27)

SELECT * FROM employees
WHERE employee_id NOT IN
(SELECT employee_id FROM dependents);

28)

SELECT e.first_name,e.last_name,d.department_name
FROM employees e
JOIN departments d ON e.department_id=d.department_id
WHERE e.department_id IN (1,2,3);

29)

SELECT e.first_name,e.last_name,j.job_title,d.department_name
FROM employees e
JOIN jobs j ON e.job_id=j.job_id
JOIN departments d ON e.department_id=d.department_id
WHERE e.department_id IN (10,20,30)
AND e.salary>10000;

30)

SELECT d.department_name,l.street_address,l.postal_code,
c.country_name,r.region_name
FROM departments d
JOIN locations l ON d.location_id=l.location_id
JOIN countries c ON l.country_id=c.country_id
JOIN regions r ON c.region_id=r.region_id;


---

If you want, I can now give:

✅ Short viva explanations (2–3 lines each)

✅ Output tables

✅ Record format (Aim, Procedure, Result) for submission


Tell me what you need 👍

