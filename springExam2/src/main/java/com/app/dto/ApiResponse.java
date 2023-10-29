package com.app.dto;

import java.time.LocalDateTime;

public class ApiResponse {
	private String msg;
	private LocalDateTime ts;
	public ApiResponse(String msg) {
		super();
		this.msg = msg;
		this.ts=LocalDateTime.now();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ApiResponse [msg=" + msg + ", ts=" + ts + "]";
	}
	
	
	

}
