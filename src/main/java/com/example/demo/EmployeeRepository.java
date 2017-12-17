package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

	List<Employee> findByFirstNameStartsWithIgnoreCase(String firstName);
	
}
