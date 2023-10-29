package com.app.pojos;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@ Table(name="user")
public class user extends BaseEntity  {
	@Column(name="first_name",length = 30)
	private String firstName;
	@Column(name="last_name",length = 30)
	private String lastName;
	@Column(name="email",unique = true)
	private String email;
	private String password;
	private LocalDate dob;
	@Column(name="voting_status",nullable = false)
	private boolean votingStatus;
	@ManyToMany(mappedBy = "candiSet")
	private Set<Candidate> candidates=new HashSet<>();

	private String role;

	public user() {
		
	}

	

	public user( String firstName, String lastName, String email, String password, LocalDate dob,
			boolean votingStatus, String role) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.votingStatus = votingStatus;
		this.role = role;
	}



	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isVotingStatus() {
		return votingStatus;
	}

	public void setVotingStatus(boolean votingStatus) {
		this.votingStatus = votingStatus;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + getId() + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dob="
				+ dob + ", votingStatus=" + votingStatus + ", role=" + role + "]";
	}
	
	
}
