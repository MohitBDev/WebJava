package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.CourseDto;
import com.app.dto.StudentDto;
import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService ser;
	@GetMapping
	public List<Student> getall(){
		return ser.getall();
	}
	@PostMapping
	public ApiResponse addstud(@RequestBody @Valid StudentDto s) {
		return new ApiResponse( ser.addstud(s));
	}
	
	@PostMapping("/course")
	public ApiResponse addcourse(@RequestBody 
			CourseDto c) {
		return new ApiResponse( ser.addcourse(c));
	}
	@GetMapping("/update/{sid}")
	public Student getstud(@PathVariable Long sid) 
	{
		return ser.getstud(sid);
	}
	@PutMapping
	public ApiResponse updatestud(@RequestBody @Valid StudentDto s) {
		return new ApiResponse( ser.updatestud(s));
	}
	@DeleteMapping("/delete/{sid}")
	public ApiResponse deletestud(@PathVariable Long sid) {
		return new ApiResponse( ser.deletestud(sid));
	}
	@GetMapping("/list/{cid}")
	public List<Student> getlist(@PathVariable Long cid ) {
		return ser.getallstudbycourse(cid);
		
		
	}
	
	
	
	
	
	

}
