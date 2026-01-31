package com.example.hrmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
