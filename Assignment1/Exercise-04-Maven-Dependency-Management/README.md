# Exercise 4: Dependency Management Using Maven in Eclipse

## Objective
To demonstrate how Maven manages external libraries using the pom.xml file by adding and using an external dependency.

## Project Description
A Maven project was created in Eclipse and an external dependency (Apache Commons Lang) was added using the pom.xml file. A Java program was written to use methods provided by the dependency.

## Steps Performed

### 1. Maven Project Creation
- Created a Maven project using Eclipse IDE.
- Configured Group ID and Artifact ID.

### 2. Adding Dependency
- Added Apache Commons Lang dependency in pom.xml.
- Maven automatically downloaded the required JAR from the Maven repository.

### 3. Java Program Using Dependency
- Used `StringUtils` class from Apache Commons Lang.
- Performed operations such as trimming, reversing strings, and checking blank values.

### 4. Execution
- Successfully executed the program and verified output in the console.

## Conclusion
Maven simplifies dependency management by automatically downloading and maintaining required libraries through the pom.xml file.
