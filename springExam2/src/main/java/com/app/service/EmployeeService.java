package com.app.service;

import java.util.List;

import com.app.dto.EmployeeDto;
import com.app.dto.EmployeerespDto;
import com.app.entities.Employee;

public interface EmployeeService {
	List<Employee> getallEmp();
	String addemp(EmployeeDto e);
	List<Employee> getallemp(Long id);
	String deleteemp(Long id);
	
	Employee getemp(Long id);
	String updateemp(Employee e);

}
