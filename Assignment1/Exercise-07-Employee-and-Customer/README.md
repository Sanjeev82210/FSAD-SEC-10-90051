# Exercise 7 (Part A): Employee Role Update Using Spring Boot & Hibernate

## Objective
Develop a Spring Boot application that updates employee role details based on employee ID for an HR department.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- Spring Tools for Eclipse (STS)

## Project Description
This application performs the following operations:
- Fetch employee details by employee ID
- Update the employee role/designation
- Persist changes in the MySQL database using Hibernate

## Project Structure
employee-app/
- pom.xml
- src/main/java/com/fsad/employee
  - EmployeeAppApplication.java
  - entity/Employee.java
  - repository/EmployeeRepository.java
  - service/EmployeeService.java
  - runner/EmployeeRunner.java
- src/main/resources
  - application.properties

## Database Used
Database Name: hospital_db  
Table Name: employee  

## Execution
The application is executed as a Spring Boot application. On startup, employee role details are updated based on employee ID using Hibernate.

## Output
Console output confirms successful employee role update.
