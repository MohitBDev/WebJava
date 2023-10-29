package com.app.dto;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.app.entities.Department;

public class EmployeeDto {
	@NotBlank(message = "firstname can not be blank")
	private  String fname;
	@NotBlank(message = "last name can  not be blank")
	private String lname;
	@Email(message = "invalid email")
	
	private  String email;
	@NotBlank(message = " inavalid pass")
	private String password;
	@Positive(message = "salary should be positive")
	private double salary;
	private Long dept_id;
	

	public Long getDept_id() {
		return dept_id;
	}

	public void setDept_id(Long dept_id) {
		this.dept_id = dept_id;
	}

	public EmployeeDto() {
		super();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	

}
