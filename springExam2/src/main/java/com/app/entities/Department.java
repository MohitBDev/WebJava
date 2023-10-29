package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="dept")
@JsonIgnoreType
public class Department extends BaseEntity {
	@Column(length = 30)
	private String dname;
	@Column(length = 30)
	private String loc;
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	private  List<Employee> emplys=new ArrayList<>();
	
	//helper methods
	public boolean addEmp(Employee e) {
		emplys.add(e);
		e.setDept(this);
		return true;
		
	}
	
	public boolean removeEmp(Employee e) {
		emplys.remove(e);
		e.setDept(null);
		return true;
		
	}

	public Department() {
		super();
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Employee> getEmplys() {
		return emplys;
	}

	public void setEmplys(List<Employee> emplys) {
		this.emplys = emplys;
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
