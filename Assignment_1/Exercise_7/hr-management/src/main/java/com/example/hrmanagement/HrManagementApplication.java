package com.example.hrmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.hrmanagement.entity.Employee;
import com.example.hrmanagement.repository.EmployeeRepository;

@SpringBootApplication
public class HrManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner updateRole(EmployeeRepository repo) {
        return args -> {
            Employee emp = repo.findById(1).orElse(null);

            if (emp != null) {
                emp.setRole("Senior Developer");
                emp.setDesignation("Tech Lead");
                repo.save(emp);
                System.out.println("Employee role updated successfully");
            } else {
                System.out.println("Employee not found");
            }
        };
    }
}
