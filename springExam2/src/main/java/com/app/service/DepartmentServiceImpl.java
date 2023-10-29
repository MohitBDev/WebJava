package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.repository.DepartmentRepo;
import com.app.repository.EmployeeRepo;

@Service
@Transactional

public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepo deptrepo;
	@Autowired
	private EmployeeRepo erepo;

	@Override
	public List<Department> getalldept() {
		// TODO Auto-generated method stub
		return deptrepo.findAll();
	}

	
}
