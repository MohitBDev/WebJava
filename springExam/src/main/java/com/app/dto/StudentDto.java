package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import net.bytebuddy.utility.nullability.NeverNull;

public class StudentDto {
	@NotBlank(message = "First name can not be Blank ")
	 private String fname;
	@NotBlank(message = "Last name can not be Blank ")
	
	 private String lname;
	@Email(message = "invalid message")

	 private String email;
	@NeverNull
	
	private Long courseid;
@Positive(message = "should be +ve")
	private double score;

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

	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public StudentDto() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDto [fname=" + fname + ", lname=" + lname + ", email=" + email + ", courseid=" + courseid
				+ ", score=" + score + "]";
	}
	
	
	
	 

}
