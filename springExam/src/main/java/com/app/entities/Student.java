package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertFalse;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@JsonIgnoreType


public class Student extends BaseEntity {
	@Column(length = 30)
	 private String fname;
	@Column(length = 30)
	 private String lname;
	@Column(length = 30)
	 private String email;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Course courseid;
	@Column(nullable = false)
	 private double score;
	public Student() {
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
	public Course getCourseid() {
		return courseid;
	}
	public void setCourseid(Course courseid) {
		this.courseid = courseid;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", email=" + email + ", courseid=" + courseid
				+ ", score=" + score + "]";
	}
	
	 
	 

}
