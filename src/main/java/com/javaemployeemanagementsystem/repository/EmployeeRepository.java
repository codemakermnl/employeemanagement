package com.javaemployeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaemployeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
