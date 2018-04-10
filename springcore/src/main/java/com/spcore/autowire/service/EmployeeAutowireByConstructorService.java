package com.spcore.autowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spcore.autowire.model.Employee;

public class EmployeeAutowireByConstructorService {
	private Employee employee;
	
	//Autowired annotation on Constructor is equivalent to autowire="constructor"
	@Autowired(required=false)
	public EmployeeAutowireByConstructorService(@Qualifier("employee")Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}	
}
