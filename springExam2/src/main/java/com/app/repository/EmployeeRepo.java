package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employee;
import com.app.entities.Department;
import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
