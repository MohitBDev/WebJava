package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFound;
import com.app.dto.EmployeeDto;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.repository.DepartmentRepo;
import com.app.repository.EmployeeRepo;
@Service
@Transactional

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	@Autowired
	private DepartmentRepo drepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Employee> getallEmp() {
		
		return repo.findAll() ;
	}

	@Override
	public String addemp(EmployeeDto e) {
		String msg="Invalid Emp ";
		Employee e1=mapper.map(e,Employee.class);
		Department d=drepo.findById(e.getDept_id()).orElseThrow();
				repo.save(e1);
				d.addEmp(e1);
				msg="Employee Added";
		return  msg;
	}

	@Override
	public List<Employee> getallemp(Long id) {
		
		Department d=drepo.findById(id).orElseThrow();
	System.out.println(d);
		return d.getEmplys();
	}

	@Override
	public String deleteemp(Long id) {
		String msg="invalid id ";
		repo.deleteById(id);
		msg="Employee delete  id :"+id;
		
		return msg;
	}

	@Override
	public Employee getemp(Long id) {
		
		  Employee e1=repo.findById(id).orElseThrow(()->new ResourceNotFound("Invalid id"));
		  
		 return e1;
	}

	@Override
	public String updateemp(Employee e) {
		String msg="invalid id ";
		
		repo.save(e);
		msg="Employee Updated :";
		
		return msg;
	}

}
