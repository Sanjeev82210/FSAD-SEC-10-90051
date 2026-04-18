# Exercise 6: Fetch Book Details Using ISBN (Hibernate)

## Objective
Develop a Hibernate-based Java application to retrieve book details from a database using ISBN for inventory verification.

## Technologies Used
- Java 17
- Hibernate ORM
- MySQL
- Maven
- Eclipse IDE

## Project Description
The application connects to a MySQL database using Hibernate and fetches book details such as:
- ISBN
- Title
- Author
- Price

The book is retrieved based on a given ISBN.

## Project Structure
hibernate-book-app/
- pom.xml
- src/main/java/com/fsad/book
  - Book.java
  - FetchBookByISBN.java
  - HibernateUtil.java
- src/main/resources
  - hibernate.cfg.xml

## Database Details
Database Name: hospital_db  
Table Name: book  

## Execution
The application was run as a Java application from Eclipse. Hibernate successfully fetched the book details using the provided ISBN.

## Output
If the ISBN exists, book details are displayed.
If not found, a suitable message is shown.
