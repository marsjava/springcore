package com.spcore.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setRole(rs.getString("role"));
		return emp;
	}
	
}
