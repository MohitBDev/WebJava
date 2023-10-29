package com.app.dto;



public class AuthorDto {
	private String aname;

	private  String email;

	private String  password;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
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

	public AuthorDto() {
		super();
	}

	@Override
	public String toString() {
		return "AuthorDto [aname=" + aname + ", email=" + email + ", password=" + password + "]";
	}
	

}
