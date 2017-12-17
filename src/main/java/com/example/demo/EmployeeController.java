package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public List<Employee> addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	
	@RequestMapping(value="/employees/{name}",method=RequestMethod.GET)
	public List<Employee> getEmployeeByName(@PathVariable("name") String name) {
		return employeeService.getEmployeeByName(name);
	}
}
