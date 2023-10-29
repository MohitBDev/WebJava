package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthLoginDto;
import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	private EmployeeService empser;
	
	@GetMapping("/emp")
	public List<Employee> listEmps() {
		System.out.println("in list emps");
		return empser.getEmps();
	}
	@GetMapping("/emp/{id}")
	public Employee listEmp(@PathVariable Long id ) {
		
		return empser.getEmp(id);
	}
	@PostMapping("/emp/login")
	public Employee AuthEmp(@RequestBody AuthLoginDto req) {
		
		return empser.authEmp(req);
	}
	
	
	@PostMapping("/emp/add")
	public Employee saveEmp(@RequestBody Employee emp) {
		
		return empser.addEmp(emp);
	}
	
	
	@PutMapping("/emp/update/{id}")
	public Employee updateEmp(@PathVariable Long id ,@RequestBody Employee emp) {
		
		return empser.addEmp(emp);
	}
	
	@DeleteMapping("/emp/delete/{id}")
	
	public ResponseEntity<?> delEmp(@PathVariable Long id ) {
		
		return new ResponseEntity<>(empser.deleteEmp(id), HttpStatus.ACCEPTED);
	}
	

}
