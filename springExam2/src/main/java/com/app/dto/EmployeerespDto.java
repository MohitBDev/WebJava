package com.app.dto;

public class EmployeerespDto {
private  String fname;
	
	private String lname;
	
	private  String email;
	
	private String password;
	
	private double salary;

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

	public EmployeerespDto() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeerespDto [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password
				+ ", salary=" + salary + "]";
	}
	

}
