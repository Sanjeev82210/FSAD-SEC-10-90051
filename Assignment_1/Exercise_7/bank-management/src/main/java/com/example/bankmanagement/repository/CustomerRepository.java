package com.example.bankmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bankmanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
