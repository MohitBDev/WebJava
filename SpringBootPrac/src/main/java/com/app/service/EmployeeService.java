package com.app.service;

import java.util.List;

import com.app.dto.AuthLoginDto;

import com.app.entities.Employee;

public interface EmployeeService  {
	public List<Employee> getEmps();
	public Employee addEmp(Employee Emp);
	
	String deleteEmp(Long empId);

	Employee getEmp(Long empId);

	Employee updateEmp(Long id,Employee detachedEmp);
	public Employee authEmp(AuthLoginDto request);

}
