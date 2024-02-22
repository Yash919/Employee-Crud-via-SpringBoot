package com.example.Employee.repository;

import com.example.Employee.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee,Integer> {
}
