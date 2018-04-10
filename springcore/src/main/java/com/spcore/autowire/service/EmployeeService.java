package com.spcore.autowire.service;

import com.spcore.autowire.model.Employee;

public class EmployeeService {
	private Employee employee;
	
	public EmployeeService() {
		System.out.println("Default Constructor used.");
	}

	public EmployeeService(Employee employee) {
		System.out.println("Autowiring by Constructor used.");
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
