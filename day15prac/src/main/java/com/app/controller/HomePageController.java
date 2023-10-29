package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.product;
import com.app.service.productService;

@RestController

public class HomePageController {
	@Autowired
	private productService service;
	public HomePageController() {
		System.out.println("in ctor of " + getClass());
	}
	@GetMapping("/products")
	public List<product> getAll(){
		return service.fetchall() ;
	}
	
}
