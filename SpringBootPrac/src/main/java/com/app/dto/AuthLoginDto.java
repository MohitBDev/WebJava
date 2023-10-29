package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AuthLoginDto {
	@NotBlank(message="Email cant be blank")
	@Email(message="invalid email ")
	private String email;
	@NotBlank(message="password can not be blank")
	private String password;
	
	
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
	
	@Override
	public String toString() {
		return "AuthLoginDto [email=" + email + ", password=" + password + "]";
	}
	

}
