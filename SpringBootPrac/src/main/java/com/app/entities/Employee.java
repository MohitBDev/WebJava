package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee extends BaseEntity {
	@Column(length = 40)
	private String name;
	@Column(length = 40,unique = true)
	private String email;
	@Column(length = 40,nullable = false)
	private String password;
	private Double salary;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String name, String email, String password, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	

}
