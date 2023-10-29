package com.app.
entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@JsonIgnoreType

public class Course extends BaseEntity{
	@Column(length=30,unique=true)
	private  String ctitle;
	
	private LocalDate sdate;
	private LocalDate edate;
	@Column(nullable=false)
	private double cfees;
	@Column(nullable=false)
	private double  mscore;
	@OneToMany(mappedBy = "courseid",cascade = CascadeType.ALL,orphanRemoval = true,fetch=FetchType.EAGER)
	List<Student> students =new ArrayList<>();
	
	public String getCtitle() {
		return ctitle;
	}
	public LocalDate getSdate() {
		return sdate;
	}
	public LocalDate getEdate() {
		return edate;
	}
	public double getCfees() {
		return cfees;
	}
	public double getMscore() {
		return mscore;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}
	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}
	public void setEdate(LocalDate edate) {
		this.edate = edate;
	}
	public void setCfees(double cfees) {
		this.cfees = cfees;
	}
	public void setMscore(double mscore) {
		this.mscore = mscore;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [ctitle=" + ctitle + ", sdate=" + sdate + ", edate=" + edate + ", cfees=" + cfees + ", mscore="
				+ mscore + "]";
	}
	
	
	
	//helper methods
	public boolean addStudent(Student s) {
		students.add(s);
		s.setCourseid(this);
		return true;
		
	}
	public boolean removeStudent(Student s) {
		students.remove(s);
		s.setCourseid(null);
		return true;
		
	}
	
	

}
