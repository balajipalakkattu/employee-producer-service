package com.learnings.employee.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnings.employee.models.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpId("1");
		employee.setName("Employee-1");
		employee.setDesignation("English Teacher");
		employee.setSalary(1500);
		return employee;
	}
}
