package com.app.Global_exception;

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
public class Handler {

	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<?> ResourceNotFoundHnadler(ResourceNotFound e) {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
		Map<String, String> map = new HashMap<>();
		for (FieldError f : e.getFieldErrors())
			map.put(f.getField(), f.getDefaultMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);

	}

}
