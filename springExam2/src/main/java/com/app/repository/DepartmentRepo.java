package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Department;
import java.lang.String;
import java.util.List;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
	 Optional<Department> findByDname(String dname);
		
	
	

}
