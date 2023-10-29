package com.app.dto;

import java.time.LocalDate;



public class CourseDto {
private  String ctitle;
	
	private LocalDate sdate;
	private LocalDate edate;

	private double cfees;
	
	private double  mscore;

	public String getCtitle() {
		return ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public LocalDate getSdate() {
		return sdate;
	}

	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}

	public LocalDate getEdate() {
		return edate;
	}

	public void setEdate(LocalDate edate) {
		this.edate = edate;
	}

	public double getCfees() {
		return cfees;
	}

	public void setCfees(double cfees) {
		this.cfees = cfees;
	}

	public double getMscore() {
		return mscore;
	}

	public void setMscore(double mscore) {
		this.mscore = mscore;
	}

	public CourseDto() {
		super();
	}

	@Override
	public String toString() {
		return "CourseDto [ctitle=" + ctitle + ", sdate=" + sdate + ", edate=" + edate + ", cfees=" + cfees
				+ ", mscore=" + mscore + "]";
	}
	

}
