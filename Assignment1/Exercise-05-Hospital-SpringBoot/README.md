# Exercise 5: Hospital Patient Management using Spring Boot & Hibernate

## Objective
Develop a Spring Boot application using Hibernate (JPA) to store and manage hospital patient records in a MySQL database.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Spring Tools for Eclipse

## Project Description
The application stores patient details including:
- Patient ID
- Name
- Age
- Diagnosis

Spring Data JPA is used to perform database operations, and MySQL is used as the backend database.

## Project Structure
hospital-app/
- pom.xml
- src/main/java/com/fsad/hospital
  - HospitalAppApplication.java
  - Patient.java
  - PatientRepository.java
- src/main/resources
  - application.properties

## Database Configuration
The database connection is configured in `application.properties` using MySQL.

## Execution
The application was executed using Spring Boot. Hibernate automatically created the patient table and inserted records successfully.

## Output
Patient records were successfully stored and retrieved from the MySQL database.
