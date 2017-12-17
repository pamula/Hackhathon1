package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
		
	}
	
	public List<Employee> addEmployee(Employee emp) {
		employeeRepository.save(emp);
		return employeeRepository.findAll();
	}
	
	public List<Employee> getEmployeeByName(String name) {
		return employeeRepository.findByFirstNameStartsWithIgnoreCase(name);
	}
	

}
