package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="emps")
@JsonIgnoreType
public class Employee extends BaseEntity {
	@Column(length = 30)
	private  String fname;
	@Column(length = 30)
	private String lname;
	@Column(length = 30,unique = true)
	private  String email;
	@Column(length = 30)
	private String password;
	@Column(nullable = false)
	private double salary;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="dept_id")
	private Department dept;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password
				+ ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
