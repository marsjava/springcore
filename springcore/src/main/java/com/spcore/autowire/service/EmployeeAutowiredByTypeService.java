package com.spcore.autowire.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spcore.autowire.model.Employee;

public class EmployeeAutowiredByTypeService {
	
	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
