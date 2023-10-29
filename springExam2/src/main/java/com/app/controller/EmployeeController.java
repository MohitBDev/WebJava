package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.EmployeeDto;
import com.app.dto.EmployeerespDto;
import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService ser;
	
	
	@GetMapping
	public List<Employee> getall(){
		return ser.getallEmp();
	  
	}
	
	@PostMapping
	public ApiResponse addemp(@RequestBody EmployeeDto e) {
		return new ApiResponse(ser.addemp(e));
		
	}
	@GetMapping("/dept/{deptid}")
	public List<Employee> getallemp(@PathVariable long deptid){
		return ser.getallemp(deptid);
		
	}
	@DeleteMapping("/delete/{empid}")
	public ApiResponse delteemp(@PathVariable Long empid) {
		
		
		
		return new ApiResponse(ser.deleteemp(empid));
		
	}
	@GetMapping("/emp/{empid}")
	public Employee getemp(@PathVariable Long empid) {
		return ser.getemp(empid);
		
	}
	@PutMapping
	public String getemp(@RequestBody Employee e) {
		return ser.updateemp(e);
		
	}
	

	
	

}
