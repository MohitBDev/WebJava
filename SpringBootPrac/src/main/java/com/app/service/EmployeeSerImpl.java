package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.AuthLoginDto;
import com.app.entities.Employee;
import com.app.repository.EmployeeRepo;

@Service
@Transactional
public class EmployeeSerImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo emprepo;

	@Override
	public List<Employee> getEmps() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}



	@Override
	public Employee addEmp(Employee Emp) {
		
		return emprepo.save(Emp);
	}


	@Override
	public String deleteEmp(Long empId) {
		String msg="Employee Does not Exists";
		if(emprepo.existsById(empId)) {
			emprepo.deleteById(empId);
			msg="Employee Deleted";
		}
		return msg;
	}



	@Override
	public Employee getEmp(Long empId) {
	
    return emprepo.findById(empId).orElseThrow();
	}



	@Override
	public Employee updateEmp(Long empId,Employee detachedEmp) {
		if(emprepo.existsById(empId)) {
			return emprepo.save(detachedEmp);
		
		}
		return null;
	}



	@Override
	public Employee authEmp(AuthLoginDto request) {
		
		return emprepo.findByEmailAndPassword(request.getEmail(), request.getPassword()).orElseThrow();
	}

}
