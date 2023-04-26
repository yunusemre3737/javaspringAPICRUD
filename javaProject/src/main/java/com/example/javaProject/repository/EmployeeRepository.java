package com.example.javaProject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javaProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}
