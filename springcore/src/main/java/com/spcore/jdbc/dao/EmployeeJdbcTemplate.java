package com.spcore.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spcore.jdbc.model.Employee;


public class EmployeeJdbcTemplate implements EmployeeDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}

	@Override
	public void save(Employee employee) {
		String query = "insert into employee(id,name,role) values (?,?,?)";
		jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getRole());
		System.out.println("Create a new record.");
	}

	@Override
	public Employee getById(Integer id) {
		String query = "select id,name,role from employee where id=?";
		return null;
	}

	@Override
	public void update(Employee employee) {
		String query="update employee set role=? where id=?";
		
	}

	@Override
	public void deleteById(Integer id) {
		String query = "delete from employee where id=?";
		
	}

	@Override
	public List<Employee> getAll() {
		String query="select id, name, role from employee";
		
		return null;
	}

}
