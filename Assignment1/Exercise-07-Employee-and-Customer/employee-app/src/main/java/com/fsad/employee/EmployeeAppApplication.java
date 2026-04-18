package com.fsad.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeAppApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Insert employee
        Employee emp = new Employee(101L, "Rajesh", "Developer");
        employeeRepository.save(emp);

        // Update role using employee ID
        Employee existingEmp = employeeRepository.findById(101L).orElse(null);

        if (existingEmp != null) {
            existingEmp.setRole("Senior Developer");
            employeeRepository.save(existingEmp);
            System.out.println("Employee role updated successfully");
        } else {
            System.out.println("Employee not found");
        }
    }
}
