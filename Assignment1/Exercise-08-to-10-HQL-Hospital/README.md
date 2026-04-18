# Exercises 8–10: Hibernate Query Language (HQL) Operations

## Objective
Develop a Java–Hibernate based application for a multi-specialty hospital to manage patients and appointments using Hibernate Query Language (HQL).

The project performs sorting, filtering, aggregation, pagination, and pattern matching operations on patient and appointment data.

---

## Technologies Used
- Java
- Hibernate ORM
- MySQL
- Maven
- Eclipse IDE / Spring Tools for Eclipse

---

## Entity Description

### Patient Entity
- patientId (Primary Key)
- patientName (String)
- age (Integer)
- gender (String)
- disease (String)

### Appointment Entity
- appointmentId (Primary Key)
- doctorName (String)
- department (String)
- appointmentDate (Date)
- consultationFee (Double)
- patient (Many-to-One relationship with Patient)

---

## Data Insertion
- Inserted **8–10 patient records**
- Inserted **8–10 appointment records**
- Used:
  - Different diseases
  - Multiple departments (Cardiology, Neurology, Orthopedics, etc.)
  - Varying consultation fees
  - Different appointment dates

---

## HQL Operations Implemented

### Sorting Operations
- Appointments sorted by consultationFee (Ascending)
- Appointments sorted by consultationFee (Descending)
- Appointments sorted by appointmentDate (Latest first)

---

### Pagination
- Retrieved first 3 appointment records
- Retrieved next 3 appointment records

---

### Aggregate Functions
- Count total number of patients
- Count total number of appointments
- Count appointments per department
- Find minimum consultation fee
- Find maximum consultation fee

---

### GROUP BY Clause
- Grouped appointments based on department and displayed count

---

### Filtering Using WHERE Clause
- Retrieved appointments with consultationFee between 500 and 1500

---

### Pattern Matching Using LIKE
- Patients whose name starts with a specific letter
- Patients whose name ends with a specific letter
- Patients whose name contains a substring
- Patients whose name length is exactly 8 characters

---

## Project Structure
