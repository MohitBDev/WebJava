package com.app.custom_exception;

public class ResourceNotFound  extends RuntimeException{
	public ResourceNotFound (String msg) {
		super(msg);
		
	}

}
