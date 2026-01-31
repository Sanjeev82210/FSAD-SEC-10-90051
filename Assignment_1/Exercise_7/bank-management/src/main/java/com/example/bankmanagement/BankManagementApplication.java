package com.example.bankmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bankmanagement.repository.CustomerRepository;

@SpringBootApplication
public class BankManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner deleteCustomer(CustomerRepository repo) {
        return args -> {
            repo.deleteById(1);
            System.out.println("Inactive customer deleted successfully");
        };
    }
}
