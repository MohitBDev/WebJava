package com.app.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.custom_exception.ResourceNotFound;

@RestControllerAdvice
public class globalexceptn {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> MethodArgument(MethodArgumentNotValidException e){
		Map<String,String> map=new HashMap<>();
		for(FieldError f: e.getFieldErrors())
			map.put(f.getField(), f.getDefaultMessage());
			
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	
		
	}
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<?> ResourceNotFound(ResourceNotFound e){
		
			
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	
		
	}

}
