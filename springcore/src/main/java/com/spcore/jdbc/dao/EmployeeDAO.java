package com.spcore.jdbc.dao;

import java.util.List;

import com.spcore.jdbc.model.Employee;

public interface EmployeeDAO {
	public void save(Employee employee);	//create
	public Employee getById(Integer id);	//read 
	public void update(Employee employee);	//update
	public void deleteById(Integer id);		//delete
	public List<Employee> getAll();			//read all
}
