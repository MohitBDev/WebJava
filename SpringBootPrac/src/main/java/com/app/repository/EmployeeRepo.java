package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	

	Optional<Employee> findByEmailAndPassword(String email, String password);

}
